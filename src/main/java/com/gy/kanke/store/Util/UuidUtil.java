package com.gy.kanke.store.Util;

import java.util.UUID;
/**
 * 生成表ID
 * @author Administrator
 *
 */
public class UuidUtil {
    public static String createUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
    
    public static void main(String[] args) {
		String uuid=UuidUtil.createUUID();
		System.out.println(uuid);
	}
}