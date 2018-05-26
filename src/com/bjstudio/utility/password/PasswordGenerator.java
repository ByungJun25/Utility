package com.bjstudio.utility.password;

import java.util.Date;
import java.util.Random;

public class PasswordGenerator {

	public static final String DEFAULT_PASSWORD_SOURCE_WITH_SPECIAL_CHARACTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-=+";
	public static final String DEFAULT_PASSWORD_SOURCE_WITHOUT_SPECIAL_CHARACTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	public static final String SPECIAL_CHARACTER_SOURCE = "!@#$%^&*()_-=+";
	public static final String PASSWORD_ALPHABET_SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	public static final String PASSWORD_NUMBER_SOURCE = "0123456789";
	public static final String PASSWORD_ALPHABET_UPPERCAES_SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String PASSWORD_ALPHABET_LOWERCAES_SOURCE = "abcdefghijklmnopqrstuvwxyz";
	
	public PasswordGenerator() {
		super();
	}

	public static String generatePassword(int size) {
		StringBuffer password = new StringBuffer();
		Random random = new Random(new Date().getTime());
		
		for(int i = 0; i < size; i++) {
			password.append(DEFAULT_PASSWORD_SOURCE_WITH_SPECIAL_CHARACTER.charAt(random.nextInt(size)));
		}
		
		return password.toString();
	}
	
	public static String generatePassword(int size, String source) {
		StringBuffer password = new StringBuffer();
		Random random = new Random(new Date().getTime());
		
		for(int i = 0; i < size; i++) {
			password.append(source.charAt(random.nextInt(size)));
		}
		
		return password.toString();
	}
}
