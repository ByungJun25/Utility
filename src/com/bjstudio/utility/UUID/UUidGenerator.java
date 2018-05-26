package com.bjstudio.utility.UUID;

import java.util.UUID;

public class UUidGenerator {
	public static String generateUUID() {
		UUID uuid = UUID.randomUUID();

		return uuid.toString();
	}
	
	public static String generateUUIDWithoutHyphen() {
		UUID uuid = UUID.randomUUID();
		String s_uuid = uuid.toString().replaceAll("-", "");
		
		return s_uuid;
	}
	
}
