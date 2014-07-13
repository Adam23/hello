package com.csg.utils;

import java.util.UUID;

/**
 * 生成随即的UUID
 * @author csg
 *
 */
public class IdCreater {
	public static String getRadomId(){
		return UUID.randomUUID().toString();
	}
}
