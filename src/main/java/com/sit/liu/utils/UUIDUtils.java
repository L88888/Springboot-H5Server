package com.sit.liu.utils;

import java.util.UUID;

public class UUIDUtils {

	public static String createUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
}
