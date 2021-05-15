package com.gy.kanke.store.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gy.kanke.store.IDao.MallProMapper;
import com.gy.kanke.store.IDao.MallProNormMapper;
import com.gy.kanke.store.IDao.MallProNormValueMapper;
import com.gy.kanke.store.IDao.MallProNormValuePriceMapper;
import com.gy.kanke.store.IDao.ShopInfoMapper;
import com.gy.kanke.store.Util.ResponseUtil;
import com.gy.kanke.store.Util.UuidUtil;
import com.gy.kanke.store.cache.CachePropertyData;
import com.gy.kanke.store.common.BaseAPIRequestparam;
import com.gy.kanke.store.common.CommonWeb;
import com.gy.kanke.store.common.DateUtils;
import com.gy.kanke.store.common.HttpSecretKey;
import com.gy.kanke.store.common.HttpUtil;
import com.gy.kanke.store.common.ResponseEntity;
import com.gy.kanke.store.common.ResponseStateInfo;
import com.gy.kanke.store.domain.MallPro;
import com.gy.kanke.store.domain.MallProExample;
import com.gy.kanke.store.domain.MallProNorm;
import com.gy.kanke.store.domain.MallProNormExample;
import com.gy.kanke.store.domain.MallProNormValue;
import com.gy.kanke.store.domain.MallProNormValueExample;
import com.gy.kanke.store.domain.MallProNormValuePrice;
import com.gy.kanke.store.domain.MallProNormValuePriceExample;
import com.gy.kanke.store.domain.ShopInfo;
import com.gy.kanke.store.domain.ShopInfoExample;
import com.gy.kanke.store.dto.ApiProListDTO;
import com.gy.kanke.store.dto.DetailShowDTO;
import com.gy.kanke.store.dto.MallProDTO;
import com.gy.kanke.store.dto.commodityDetailDTO;
import com.gy.kanke.store.param.ApiProListParam;
import com.gy.kanke.store.param.MallProParam;
import com.gy.kanke.store.param.ProStandardParam;
import com.gy.kanke.store.param.ProStandardUpdParam;
import com.gy.kanke.store.param.proNormValueParam;
import com.gy.kanke.store.service.MallProService;

@Service
public class MallProServiceImpl implements MallProService {
	@Autowired
	private MallProMapper mallProMapper;

	@Autowired
	private MallProNormMapper mallProNormMapper;
	@Autowired
	private MallProNormValueMapper mallProNormValueMapper;
	@Autowired
	private MallProNormValuePriceMapper mallProNormValuePriceMapper;
	@Autowired
	private ShopInfoMapper shopInfoMapper;

	// 用于缓存
	private MallPro mallPro = new MallPro();

	@Override
	public List<MallProDTO> selList(MallProParam param) {

		try {
			// 查询条件:开始日期(上架时间),结束日期(上架时间),商品状态(1:审核中 2:已上架 3:已下架 4:审核不通过)

			MallProExample example = new MallProExample();
			com.gy.kanke.store.domain.MallProExample.Criteria criteria = example.createCriteria();

			try {
				if (!StringUtils.isEmpty(param.getStartDate())) {
					String getStartTime = param.getStartDate() + " 00:00:00";
					Date getStartDate = DateUtils.getFormatDateStr(getStartTime, "yyyy-MM-dd HH:mm:ss");
					criteria.andCreateTimeGreaterThanOrEqualTo(getStartDate);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (!StringUtils.isEmpty(param.getEndDate())) {
					String getStartTime = param.getEndDate() + " 23:59:59";
					Date getStartDate = DateUtils.getFormatDateStr(getStartTime, "yyyy-MM-dd HH:mm:ss");
					criteria.andCreateTimeLessThanOrEqualTo(getStartDate);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			criteria.andDeleteStateNotEqualTo(1);// 1：删除

			// 商品状态：1:审核中 2:已上架 3:已下架 4:审核不通过
			if (param.getState() != null && param.getState() > 0) {
				criteria.andStateEqualTo(param.getState());
			}

			int count = mallProMapper.countByExample(example);

			example.setLimitStart(param.getStart());
			example.setLimitEnd(param.getEnd());

			List<MallPro> mallPros = mallProMapper.selectByExample(example);
			List<MallProDTO> dtos = new ArrayList<>();
			for (MallPro mallPro : mallPros) {
				MallProDTO dto = new MallProDTO();
				dto.setId(mallPro.getId());
				dto.setPicturesShow(mallPro.getPicturesShow());
				dto.setShortTitle(mallPro.getShortTitle());
				dto.setSoldCount(0);
				dto.setTotalInventory(0);
				dto.setCreateTime(mallPro.getCreateTime());
				dto.setState(mallPro.getState());
				dtos.add(dto);
			}
			dtos=tongbuProList(dtos);
			return dtos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 商家版商品与会员版商品数据对比返回已售数量
	 * @param dtos
	 */
	public List<MallProDTO> tongbuProList(List<MallProDTO> dtos){

		List<MallProDTO> proDTOs =new ArrayList<>();
		try {
			
			BaseAPIRequestparam<List<MallProDTO>> requestparam=new BaseAPIRequestparam<List<MallProDTO>>();
			requestparam.setData(dtos);

			String httpUrl = CachePropertyData.getValueByKey("kanke_manager_url") + "MallProApi/getList";

			// 
			String str = HttpUtil.sendHttpPostJson(httpUrl, requestparam.toJSONString());

			if (str != null) {
				BaseAPIRequestparam<String> map=new BaseAPIRequestparam<String>(str,String.class); 
				ResponseStateInfo stateInfo= map.getState();
				if(stateInfo.getCode()==stateInfo.CODE_SUCCESS){
					String data=	map.getData();
					proDTOs = JSON.parseArray(data, MallProDTO.class);
					return proDTOs;
				}
			}
			return proDTOs;
		} catch (Exception e) {
			e.printStackTrace();
			return proDTOs;
		}
			 
		 
	}

	/**
	 * 商品审核同步接口 对外接口
	 */
	@Override
	public String updAuditState(String proId, Integer state) {
		return CommonWeb.ReturnJson(1, "操作成功", null);
	}

	/**
	 * 上架、下架、取消(审核中)
	 * 
	 * @param param
	 * @param model
	 */
	@Transactional
	@Override
	public ResponseEntity operationState(String proId, Integer state, String account) {
		try {
			// 数据合法验证
			if (proId == null || "".equals(proId.trim()) || state == null) {
				return CommonWeb.ReturnJsonObject(0, "参数有误，请稍刷新重新操作", proId);
			}

			MallPro mallPro = mallProMapper.selectByPrimaryKey(proId);
			if (mallPro == null) {
				return CommonWeb.ReturnJsonObject(0, "没有该商品，请稍刷新重新操作", proId);
			}

			// state商品状态：1:审核中 2:已上架 3:已下架 4:审核不通过
			if (mallPro.getState() == 2) {
				if (state == 3) {
					mallPro.setState(state);

					// 传入数据到运营后台更新商品相关信息
					JSONObject jsonParam = new JSONObject();
					jsonParam.put("token", HttpSecretKey.getToken(account));// 用户账号
					jsonParam.put("systemIdentify", HttpSecretKey.getSystemIdentify());
					jsonParam.put("proId", proId);
					jsonParam.put("state", state);
					jsonParam.put("account", account);

					String jsonStr = JSON.toJSONString(jsonParam);

					String httpUrl = CachePropertyData.getValueByKey("kanke_manager_url") + "MallProApi/operationState";

					// 发短信
					String str = HttpUtil.sendHttpPostJson(httpUrl, jsonStr);

					if (str != null) {
						com.alibaba.fastjson.JSONObject object = JSON.parseObject(str);
						boolean success = object.getBoolean("success");
						if (success) {
							// 更新本地的商品数据
							mallPro.setLastUpdateTime(new Date());
							mallProMapper.updateByPrimaryKeySelective(mallPro);
							return CommonWeb.ReturnJsonObject(1, "操作成功", proId);
						} else {

						}
					}

				}
			}

			if (mallPro.getState() == 1) {
				mallPro.setState(3);
				mallPro.setLastUpdateTime(new Date());
				mallProMapper.updateByPrimaryKeySelective(mallPro);
				return CommonWeb.ReturnJsonObject(1, "操作成功", proId);
			}

			mallPro.setState(1);
			mallPro.setLastUpdateTime(new Date());
			mallProMapper.updateByPrimaryKeySelective(mallPro);
			return CommonWeb.ReturnJsonObject(1, "操作成功", proId);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonWeb.ReturnJsonObject(0, "操作失败，请稍后再试", proId);
		}
	}

	/**
	 * 添加商品到缓存中
	 */
	@Override
	public ResponseEntity addCachePro(MallPro param) {
		// 数据合法验证
		ResponseEntity responseEntity = isFiedCheck(param);
		if (responseEntity.getStatus() != 1) {
			return responseEntity;
		}

		mallPro = param;
		mallPro.setId(UuidUtil.createUUID());

		return CommonWeb.ReturnJsonObject(1, "操作成功", null);
	}

	/**
	 * 数据合法验证(商品)
	 * 
	 * @param param
	 * @return
	 */
	private ResponseEntity isFiedCheck(MallPro param) {
		// 7、“商品简称不能为空”
		// 8、“商品名称不能为空”
		// 1、“商品简称最长20个字符”
		// 2、“商品名称最长100个字符”
		if (param.getShortTitle() == null || "".equals(param.getShortTitle().trim()) || param.getShortTitle().length() > 20) {
			return CommonWeb.ReturnJsonObject(0, "商品简称不能为空，并且商品简称最长20个字符", null);
		}
		if (param.getLongTitle() == null || "".equals(param.getLongTitle().trim()) || param.getLongTitle().length() > 100) {
			return CommonWeb.ReturnJsonObject(0, "商品名称不能为空，并且商品名称最长100个字符", null);
		}
		// 3、“请上传商品展示图“
		if (param.getPicturesShow() == null || "".equals(param.getPicturesShow().trim())) {
			return CommonWeb.ReturnJsonObject(0, "请上传商品展示图", null);
		}
		// 4、“请上传至少一张商品主图”
		if (StringUtils.isEmpty(param.getImgOne()) && StringUtils.isEmpty(param.getImgTwo()) && StringUtils.isEmpty(param.getImgThree()) && StringUtils.isEmpty(param.getImgFour()) && StringUtils.isEmpty(param.getImgFive())) {
			return CommonWeb.ReturnJsonObject(0, "请上传至少一张商品主图", null);
		}
		// 5、“图片格式不符合要求”
		if (!isImgSuffix(param.getPicturesShow())) {
			return CommonWeb.ReturnJsonObject(0, "商品展示图,图片格式不符合要求", null);
		}
		if ((!StringUtils.isEmpty(param.getImgOne()) && !isImgSuffix(param.getImgOne())) || (!StringUtils.isEmpty(param.getImgTwo()) && !isImgSuffix(param.getImgTwo())) || (!StringUtils.isEmpty(param.getImgThree()) && !isImgSuffix(param.getImgThree())) || (!StringUtils.isEmpty(param.getImgFour()) && !isImgSuffix(param.getImgFour())) || (!StringUtils.isEmpty(param.getImgFive()) && !isImgSuffix(param.getImgFive()))) {
			return CommonWeb.ReturnJsonObject(0, "图片仅支持JPG、PNG格式", null);
		}
		// 6、“请填写商品详情”
		if (param.getDetailContent() == null || "".equals(param.getDetailContent().trim())) {
			return CommonWeb.ReturnJsonObject(0, "请填写商品详情", null);
		}
		// 9、“运费必须大于0元”
		if (param.getPostPrice() == null || param.getPostPrice().compareTo(BigDecimal.ZERO) == -1) {
			return CommonWeb.ReturnJsonObject(0, "运费必须大于等于0元", null);
		}

		return CommonWeb.ReturnJsonObject(1, "验证成功", null);
	}

	/**
	 * 图片仅支持JPG、PNG格式，长宽比例1:1，大小不超过500K
	 * 
	 * @param path
	 * @return
	 */
	public static boolean isImgSuffix(String path) {
		if (path == null) {
			return false;
		} else if ("".equals(path.trim())) {
			return false;
		}

		String suffix = path.substring(path.lastIndexOf(".") + 1);
		suffix = suffix.toUpperCase();
		if ("JPG".equals(suffix) || "PNG".equals(suffix)) {
			return true;
		}
		return false;

	}

	@Transactional
	@Override
	public ResponseEntity isnertProStandard(ProStandardParam param) {

		try {
			// 数据合法验证

			List<proNormValueParam> porVal = param.getPorVal();
			if (porVal == null || porVal.size() > 30) {
				return CommonWeb.ReturnJsonObject(0, "最多30个规格值,最少一个", null);
			}

			// 查询店铺信息
			ShopInfoExample example = new ShopInfoExample();
			com.gy.kanke.store.domain.ShopInfoExample.Criteria criteria = example.createCriteria();
			criteria.andAccountEqualTo(param.getInfo().getAccount());
			List<ShopInfo> shopInfos = shopInfoMapper.selectByExample(example);
			if (shopInfos == null || shopInfos.get(0) == null) {
				return CommonWeb.ReturnJsonObject(0, "店铺信息有误，请刷新入商品信息", null);
			}
			ShopInfo shopInfo = shopInfos.get(0);

			// 商品状态：1:审核中 2:已上架 3:已下架 4:审核不通过
			mallPro.setState(1);
			mallPro.setCreateTime(new Date());
			mallPro.setCreator(param.getInfo().getAccount());
			mallPro.setDeleteState(0);
			mallPro.setMerchantId(shopInfo.getId());
			// 写入商品缓存数据和商品规格价格数据
			if (mallPro == null || "".equals(mallPro.getId().trim())) {
				return CommonWeb.ReturnJsonObject(0, "操作失败，请重新输入商品信息", null);
			}
			if (mallProMapper.insertSelective(mallPro) == 1) {
				// 商品规格表
				MallProNorm proNorm = new MallProNorm();
				proNorm.setId(UuidUtil.createUUID());
				proNorm.setProId(mallPro.getId());
				proNorm.setNormName(param.getNormName());
				proNorm.setSort(1);
				proNorm.setState(1);
				proNorm.setCreator(param.getInfo().getAccount());
				proNorm.setCreateTime(new Date());
				proNorm.setLastUpdateTime(new Date());
				mallProNormMapper.insertSelective(proNorm);

				int i = 1;
				List<proNormValueParam> valueParams = param.getPorVal();
				for (proNormValueParam proNormValueParam : valueParams) {

					MallProNormValue proNormValue = new MallProNormValue();
					proNormValue.setId(UuidUtil.createUUID());
					proNormValue.setNormId(proNorm.getId());
					proNormValue.setNormName(proNorm.getNormName());
					proNormValue.setNormValue(proNormValueParam.getProTypeName());
					proNormValue.setSort(i);
					i++;
					mallProNormValueMapper.insertSelective(proNormValue);

					MallProNormValuePrice valuePrice = new MallProNormValuePrice();
					valuePrice.setProId(mallPro.getId());
					valuePrice.setId(UuidUtil.createUUID());
					valuePrice.setMormKeys(proNormValue.getId());
					valuePrice.setStockpile(proNormValueParam.getRepertory());
					valuePrice.setCreator(param.getInfo().getAccount());
					valuePrice.setPrice(proNormValueParam.getSellingPrice());
					// 售价
					valuePrice.setOriginalprice(proNormValueParam.getOriginalPrice());
					// 原价
					valuePrice.setCreateTime(new Date());

					mallProNormValuePriceMapper.insertSelective(valuePrice);
				}

			}
			return CommonWeb.ReturnJsonObject(1, "操作成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonWeb.ReturnJsonObject(0, "操作失败，请稍后再试", null);
		}
	}

	/**
	 * 商品修改
	 */
	@Transactional
	@Override
	public ResponseEntity updProStandard(ProStandardUpdParam param) {

		try {
			// 数据合法验证
			ResponseEntity responseEntity = isFiedCheck(param.getPro());
			if (responseEntity.getStatus() != 1) {
				return responseEntity;
			}

			List<proNormValueParam> porVal = param.getPorVal();
			if (porVal == null || porVal.size() > 30) {
				return CommonWeb.ReturnJsonObject(0, "最多30个规格值,最少一个", null);
			}

			// 把数据存入本地
			String proId = param.getPro().getId();
			if (proId == null || "".equals(proId.trim())) {
				return CommonWeb.ReturnJsonObject(0, "该商品不存在", null);
			}
			MallPro mallPro = mallProMapper.selectByPrimaryKey(proId);
			if (mallPro == null) {
				return CommonWeb.ReturnJsonObject(0, "该商品不存在", null);
			}

			MallPro pro = param.getPro();

			pro.setSynchronous(1);// 同步0:未同步1:已同步
			//商品状态：1:审核中 2:已上架 3:已下架 4:审核不通过
			pro.setState(3);
			mallProMapper.updateByPrimaryKeySelective(pro);
			List<proNormValueParam> valueParams = param.getPorVal();
			for (proNormValueParam proNormValueParam : valueParams) {
				MallProNormValuePrice valuePrice = new MallProNormValuePrice();
				valuePrice.setId(proNormValueParam.getId());
				valuePrice.setPrice(proNormValueParam.getSellingPrice());
				valuePrice.setOriginalprice(proNormValueParam.getOriginalPrice());
				valuePrice.setStockpile(proNormValueParam.getRepertory());
				mallProNormValuePriceMapper.updateByPrimaryKeySelective(valuePrice);

			}

			// 传入数据到运营后台更新商品相关信息
			Map<String, Object> map=new HashMap<>();
			map.put("proId", pro.getId());
			
			BaseAPIRequestparam<Map<String, Object>> apiRequestparam=new BaseAPIRequestparam<Map<String, Object>>();
			apiRequestparam.setData(map);

			String httpUrl = CachePropertyData.getValueByKey("kanke_manager_url") + "MallProApi/updAddProStandard";

			String str = HttpUtil.sendHttpPostJson(httpUrl, apiRequestparam.toJSONString());

			if (str != null) {
				BaseAPIRequestparam<Map<String, Object>> returnparam=new BaseAPIRequestparam<Map<String, Object>>(str,Map.class);
				ResponseStateInfo ResponseStateInfo=returnparam.getState();
				if(ResponseStateInfo!=null&&ResponseStateInfo.getCode()==ResponseStateInfo.CODE_SUCCESS){
					return CommonWeb.ReturnJsonObject(1, "操作成功", param);
				}
			}

			return CommonWeb.ReturnJsonObject(0, "操作失败", null);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonWeb.ReturnJsonObject(0, "操作失败", null);
		}
	}

	/**
	 * 商品编辑数据
	 */
	@Override
	public DetailShowDTO detailEditShow(String proId) {
		DetailShowDTO dtos = new DetailShowDTO();
		if (proId == null || "".equals(proId.trim())) {
			dtos = null;
		}

		MallPro mallPro = mallProMapper.selectByPrimaryKey(proId);
		if (mallPro == null) {
			return dtos;
		}

		dtos.setMallPro(mallPro);

		// 有效规格
		MallProNormExample example = new MallProNormExample();
		com.gy.kanke.store.domain.MallProNormExample.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(1);// 状态，1 有效，2 无效，3 已删除
		criteria.andProIdEqualTo(mallPro.getId());
		example.setOrderByClause(" sort asc ");

		List<MallProNorm> proNorms = mallProNormMapper.selectByExample(example);
		if (proNorms == null || proNorms.size() <= 0) {
			return dtos;
		}
		List<String> normIds = new ArrayList<String>();
		for (MallProNorm mallProNorm : proNorms) {
			normIds.add(mallProNorm.getId());
		}
		MallProNormValueExample valueExample = new MallProNormValueExample();
		com.gy.kanke.store.domain.MallProNormValueExample.Criteria criteria2 = valueExample.createCriteria();
		criteria2.andNormIdIn(normIds);

		valueExample.setOrderByClause(" sort asc ");
		List<MallProNormValue> selectByExample = mallProNormValueMapper.selectByExample(valueExample);
		if (selectByExample == null || selectByExample.size() <= 0) {
			return dtos;
		}
		List<proNormValueParam> porVal = new ArrayList<proNormValueParam>();
		for (MallProNormValue mallProNormValue : selectByExample) {
			MallProNormValuePriceExample priceExample = new MallProNormValuePriceExample();
			com.gy.kanke.store.domain.MallProNormValuePriceExample.Criteria criteria3 = priceExample.createCriteria();
			criteria3.andProIdEqualTo(mallPro.getId());
			criteria3.andMormKeysEqualTo(mallProNormValue.getId());
			List<MallProNormValuePrice> valuePrices = mallProNormValuePriceMapper.selectByExample(priceExample);
			if (valuePrices == null || valuePrices.size() <= 0) {
				continue;
			}
			for (MallProNormValuePrice mallProNormValuePrice : valuePrices) {
				proNormValueParam valueParam = new proNormValueParam();
				valueParam.setId(mallProNormValuePrice.getId());
				valueParam.setSellingPrice(mallProNormValuePrice.getPrice());
				valueParam.setOriginalPrice(mallProNormValuePrice.getOriginalprice());
				valueParam.setRepertory(mallProNormValuePrice.getStockpile());
				valueParam.setProTypeName(mallProNormValue.getNormValue());
				porVal.add(valueParam);
			}

		}
		dtos.setNormName(proNorms.get(0).getNormName());
		dtos.setPorVal(porVal);
		return dtos;
	}

	@Override
	public List<ApiProListDTO> apiProList(ApiProListParam param) {

		return null;
	}

	@Override
	public DetailShowDTO commodityDetailShow(String proId) {
		return detailEditShow(proId);
	}

	@Override
	public ResponseEntity proDel(String proId, String acount) {
		try {
			MallPro mallPro = mallProMapper.selectByPrimaryKey(proId);
			if (mallPro == null) {
				return CommonWeb.ReturnJsonObject(0, "没有该商品", null);
			}

			// 传入数据到运营后台更新商品相关信息
			JSONObject jsonParam = new JSONObject();
			jsonParam.put("token", HttpSecretKey.getToken(acount));// 商品ID
			jsonParam.put("systemIdentify", HttpSecretKey.getSystemIdentify());
			jsonParam.put("acount", acount);
			jsonParam.put("proId", proId);

			String jsonStr = JSON.toJSONString(jsonParam);

			String httpUrl = CachePropertyData.getValueByKey("kanke_manager_url") + "MallProApi/proDel";

			String str = HttpUtil.sendHttpPostJson(httpUrl, jsonStr);

			if (str != null) {
				com.alibaba.fastjson.JSONObject object = JSON.parseObject(str);
				boolean success = object.getBoolean("success");
				if (success) {
					// 更新本地的商品数据
					mallPro.setDeleteState(1);// 1：删除
					mallPro.setState(3);// 商品状态：1:审核中 2:已上架 3:已下架 4:审核不通过
					mallPro.setCreateTime(new Date());
					if (mallProMapper.updateByPrimaryKeySelective(mallPro) == 1) {
						return CommonWeb.ReturnJsonObject(0, "操作成功", null);
					}
				}
			}
			return CommonWeb.ReturnJsonObject(0, "操作失败", null);
		} catch (Exception e) {
			e.printStackTrace();
			return CommonWeb.ReturnJsonObject(0, "操作失败，请稍后再试", null);

		}

	}

	@Override
	public BaseAPIRequestparam kankeSelListApi(MallProParam param) {
		try {
			// 查询条件:开始日期(上架时间),结束日期(上架时间),商品状态(1:审核中 2:已上架 3:已下架 4:审核不通过)

			MallProExample example = new MallProExample();
			com.gy.kanke.store.domain.MallProExample.Criteria criteria = example.createCriteria();

			try {
				if (!StringUtils.isEmpty(param.getStartDate())) {
					String getStartTime = param.getStartDate() + " 00:00:00";
					Date getStartDate = DateUtils.getFormatDateStr(getStartTime, "yyyy-MM-dd HH:mm:ss");
					criteria.andCreateTimeGreaterThanOrEqualTo(getStartDate);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (!StringUtils.isEmpty(param.getEndDate())) {
					String getStartTime = param.getEndDate() + " 23:59:59";
					Date getStartDate = DateUtils.getFormatDateStr(getStartTime, "yyyy-MM-dd HH:mm:ss");
					criteria.andCreateTimeLessThanOrEqualTo(getStartDate);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			criteria.andDeleteStateNotEqualTo(1);// 1：删除

			// 商品状态：1:审核中 2:已上架 3:已下架 4:审核不通过
			if (param.getState() != null && param.getState() > 0) {
				criteria.andStateEqualTo(param.getState());
			}

			int count = mallProMapper.countByExample(example);

			param.setTotalCount(count);

			example.setLimitStart(param.getStart());
			example.setLimitEnd(param.getEnd());

			List<MallPro> mallPros = mallProMapper.selectByExample(example);

			Map<String, Object> map = new HashMap<>();
			map.put("datas", mallPros);
			map.put("totalCount ", count);

			return ResponseUtil.getSuccessResponseBean(map);

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseUtil.getSuccessResponseBean("操作失败，请稍后再试");
		}
	}

	/**
	 * 商品详情页面（被调：用于审核初始化）
	 * 
	 * @param param
	 *            商品id
	 * @param model
	 * @return
	 */
	@Override
	public commodityDetailDTO commodityDetail(String proId) {
		commodityDetailDTO dtos = new commodityDetailDTO();
		try {
			if (proId == null || "".equals(proId.trim())) {
				dtos = null;
			}

			// 商品
			MallPro mallPro = mallProMapper.selectByPrimaryKey(proId);
			if (mallPro == null) {
				return dtos;
			}
			dtos.setMallPro(mallPro);
			// 商品规格表
			MallProNormExample proNormExample = new MallProNormExample();
			com.gy.kanke.store.domain.MallProNormExample.Criteria proNormCriteria = proNormExample.createCriteria();
			proNormCriteria.andProIdEqualTo(mallPro.getId());

			proNormExample.setOrderByClause(" sort asc ");
			List<MallProNorm> mallProNorms = mallProNormMapper.selectByExample(proNormExample);
			dtos.setProNorms(mallProNorms);

			// 商品规格表，如颜色、尺寸、款式的数值
			// 规格ID
			List<String> proNormIds = new ArrayList<>();
			for (MallProNorm strId : mallProNorms) {
				proNormIds.add(strId.getId());
			}

			MallProNormValueExample proNormValueExample = new MallProNormValueExample();
			com.gy.kanke.store.domain.MallProNormValueExample.Criteria proNormValueCriteria = proNormValueExample.createCriteria();
			proNormValueCriteria.andNormIdIn(proNormIds);

			proNormValueExample.setOrderByClause(" sort asc ");
			List<MallProNormValue> mallProNormValues = mallProNormValueMapper.selectByExample(proNormValueExample);
			dtos.setMallProNormValues(mallProNormValues);

			// 商品规格值与价格库存对应表
			// 规格值ID
			List<String> valuePriceIds = new ArrayList<>();
			for (MallProNormValue strId : mallProNormValues) {
				valuePriceIds.add(strId.getId());
			}

			MallProNormValuePriceExample valuePriceExample = new MallProNormValuePriceExample();
			for (String string : valuePriceIds) {
				if (string != null && !"".equals(string.trim())) {
					com.gy.kanke.store.domain.MallProNormValuePriceExample.Criteria valuePriceCriteria = valuePriceExample.createCriteria();
					valuePriceCriteria.andMormKeysLike("%" + string + "%");
					valuePriceExample.or(valuePriceCriteria);
				}
			}

			List<MallProNormValuePrice> normValuePrices = mallProNormValuePriceMapper.selectByExample(valuePriceExample);
			dtos.setNormValuePrices(normValuePrices);

			return dtos;
		} catch (Exception e) {
			e.printStackTrace();
			return dtos;
		}
	}

	@Override
	public BaseAPIRequestparam commodityAuditSucceedUpd(String proId, Integer state) {
		try {
			if (proId == null || "".equals(proId) || state == null || "".equals(state)) {
				ResponseUtil.getFailResult("参数有误");
			}

			// state 商品状态：1:审核中 2:已上架 3:已下架 4:审核不通过
			MallPro mallPro = new MallPro();
			mallPro.setState(state);
			mallPro.setId(proId);
			mallPro.setSynchronous(1);// 同步0:未同步1:已同步
			if (mallProMapper.updateByPrimaryKeySelective(mallPro) == 1) {
				return ResponseUtil.getSuccessResponseBean(mallPro);
			}
			return ResponseUtil.getFailResponseBean("操作失败");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseUtil.getFailResponseBean("操作失败,请稍后再试");
		}
	}

}
