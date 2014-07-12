package com.csg.utils;

import java.util.UUID;

/**
 * Éú³ÉËæ¼´µÄUUID
 * @author csg
 *
 */
public class IdCreater {
	public static String getRadomId(){
		return UUID.randomUUID().toString();
	}
}
