package com.bjstudio.utility.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidChecker {
	private static final String NUMBER_PATTERN = "^[0-9]*$";
	
	public static boolean isNull(Object object) {
		if(object == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isNumeric(String strValue) {
		Pattern pattern = Pattern.compile(ValidChecker.NUMBER_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
}
