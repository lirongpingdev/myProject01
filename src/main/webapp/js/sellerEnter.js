/*
 * 获取字符串长度，中文字符当成两个
 */
function getLength(textStr)
{
    var i,sum;
    sum = 0;
    for(i=0;i<textStr.length;i++)
    {
        if ((textStr.charCodeAt(i)>=0) && (textStr.charCodeAt(i)<=255))
            sum = sum + 1;
        else
            sum = sum + 2;
    }
    return sum;
}

//全中文字符判断(true:全是中文,false:不全是中文)
function checkChinese(val) {　
	var reg = /^[\u4E00-\u9FA5]+$/; 
	if(!reg.test(val)){ 
		//不全是全是中文
		return false; 
	}
	//全是中文
	return true; 
  }

