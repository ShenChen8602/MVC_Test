package com.imooc.utils;

import java.util.UUID;

public class UploadUtils {
	//生成唯一的文件名
	public static String getUUIDFileName(String fileName){
		System.out.println();
		//将文件名前面的部分进行截取： xx.jpg -> .jpg
		int idx = fileName.lastIndexOf(".");
		String extention = fileName.substring(idx);
		String uuidFileName = UUID.randomUUID().toString().replaceAll("-", "");
		return uuidFileName;
	}
}
