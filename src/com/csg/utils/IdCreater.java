package com.csg.utils;

import java.util.UUID;

/**
 * �����漴��UUID
 * @author csg
 *
 */
public class IdCreater {
	public static String getRadomId(){
		return UUID.randomUUID().toString();
	}
}
