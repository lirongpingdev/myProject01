package com.gy.kanke.store.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Properties;
import java.util.UUID;
import java.util.Vector;

import com.gy.kanke.store.common.DateUtils;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SFTPUtils {

	private static final String host = "120.77.40.10";
	private static final int port = 22;
	private static final String username = "root";
	private static final String password = "Guoyoupay666";
	private static final String directory = "/var/www/html/ad/pro_files/";
	private static ChannelSftp sftp = null;

	public static synchronized ChannelSftp getInstance() {
		if (sftp == null || (null != sftp && sftp.isClosed())) {
			sftp = connect();
		}
		return sftp;
	}

	/**
	 * 连接sftp服务器
	 * 
	 * @param host
	 *            主机
	 * @param port
	 *            端口
	 * @param username
	 *            用户名
	 * @param password
	 *            密码 g
	 * @return
	 */
	private static ChannelSftp connect() {
		ChannelSftp sftp = null;
		try {
			JSch jsch = new JSch();
			jsch.getSession(username, host, port);
			Session sshSession = jsch.getSession(username, host, port);
			sshSession.setPassword(password);
			Properties sshConfig = new Properties();
			sshConfig.put("StrictHostKeyChecking", "no");
			sshSession.setConfig(sshConfig);
			sshSession.connect();
			Channel channel = sshSession.openChannel("sftp");
			channel.connect();
			sftp = (ChannelSftp) channel;
			System.out.println("Connected to " + host + ".");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sftp;
	}

	/**
	 * 上传文件
	 * 
	 * @param directory
	 *            上传的目录
	 * @param uploadFile
	 *            要上传的文件
	 * @param sftp
	 */
	public static void upload(String directory, String uploadFile, ChannelSftp sftp) {
		try {
			sftp.cd(directory);
			File file = new File(uploadFile);
			sftp.put(new FileInputStream(file), "aa.jpg");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 上传文件
	 * 
	 * @param directory
	 *            上传的目录
	 * @param uploadFile
	 *            要上传的文件
	 * @param sftp
	 * @throws SftpException
	 * @throws IOException
	 */
	public static String upload(InputStream inputStream, ChannelSftp sftp, String fileName)
			throws SftpException, IOException {
		String datePath = DateUtils.getFormatDateStr(Calendar.getInstance().getTime(), "yyyyMM");
		String path = directory + datePath;
		Vector vec = null;
		try {
			vec = sftp.ls(path);
		} catch (Exception e) {
			vec = null;
		}
		 
		if (null == vec) {
			sftp.mkdir(path);
		}
		sftp.cd(path);
		fileName = UUID.randomUUID().toString() + fileName.substring(fileName.indexOf("."));
		sftp.put(inputStream, fileName);
		inputStream.close();
		return datePath + "/" + fileName;
	}

	/**
	 * 下载文件
	 * 
	 * @param directory
	 *            下载目录
	 * @param downloadFile
	 *            下载的文件
	 * @param saveFile
	 *            存在本地的路径
	 * @param sftp
	 */
	public void download(String directory, String downloadFile, String saveFile, ChannelSftp sftp) {
		try {
			sftp.cd(directory);
			File file = new File(saveFile);
			sftp.get(downloadFile, new FileOutputStream(file));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 删除文件
	 * 
	 * @param directory
	 *            要删除文件所在目录
	 * @param deleteFile
	 *            要删除的文件
	 * @param sftp
	 */
	public void delete(String directory, String deleteFile, ChannelSftp sftp) {
		try {
			sftp.cd(directory);
			sftp.rm(deleteFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 列出目录下的文件
	 * 
	 * @param directory
	 *            要列出的目录
	 * @param sftp
	 * @return
	 * @throws SftpException
	 */
	@SuppressWarnings("unchecked")
	public Vector<LsEntry> listFiles(String directory, ChannelSftp sftp) throws SftpException {
		return sftp.ls(directory);
	}
}