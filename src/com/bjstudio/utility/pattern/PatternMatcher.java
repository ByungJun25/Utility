package com.bjstudio.utility.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	 
	public static final String NUMBER_PATTERN = "^[0-9]*$";
	public static final String HANGUL_ALL_PATTERN="^[ㄱ-ㅎㅏ-ㅣ가-힣]*$";
	public static final String HANGUL_WORD_ONLY_PATTERN="^[가-힣]*$";
	public static final String HANGUL_NUMBER_PATTERN="^[가-힣0-9]*$";
	public static final String HANGUL_ALPHABET_PATTERN = "^[가-힣a-zA-Z]*$";
	public static final String ALPHABET_PATTERN = "^[a-zA-Z]*$";
	public static final String ALPHABET_LOWERCASE_PATTERN = "^[a-z]*$";
	public static final String ALPHABET_UPPERCASE_PATTERN = "^[A-Z]*$";
	public static final String ALPHABET_NUMBER_OLNY_PATTERN = "^[a-zA-Z0-9]*$";
	public static final String CHARACTER_ONLY_PATTERN="^[ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z]*$";
	public static final String CHARACTER_NUMBER_PATTERN="^[ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]*$";
	public static final String SPECIAL_CHARACTER_PATTERN = "[\\{\\}\\[\\]\\/?.,;:|\\)*~`!^\\-_+<>@\\#$%&\\\\\\=\\(\\'\\\"]";
	public static final String EMAIL_PATTERN = "^(([^<>()\\[\\]\\\\.,;:\\s@\"]+(\\.[^<>()\\[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
	public static final String PASSWORD_PATTERN = "^(?=.*[A-Za-z])(?=.*\\\\d)(?=.*[$@$!%*#?&])[A-Za-z\\\\d$@$!%*#?&]{8,}$"; //최소 8자리에 숫자, 문자, 특수문자 각각 1개 이상 포함
	public static final String PASSWORD_PATTERN2 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$"; //최소 8자리에 대문자 1자리 소문자 한자리 숫자 한자리
	public static final String PASSWORD_PATTERN3 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,}"; //최소 8자리에 대문자 1자리 소문자 1자리 숫자 1자리 특수문자 1자리
	
	private Pattern pattern;
	private Matcher matcher;
	
	public PatternMatcher(String pattern) {
		super();
		this.pattern = Pattern.compile(pattern);
	}
	
	public boolean patternCheck(String value) {
		 this.matcher = this.pattern.matcher(value);
		
		if(this.matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isNumeric(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.NUMBER_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isHangul(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.HANGUL_ALL_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isHangulWordOnly(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.HANGUL_WORD_ONLY_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isHangulAndNumber(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.HANGUL_NUMBER_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isHangulAndAlphabet(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.HANGUL_ALPHABET_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isAlphabet(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.ALPHABET_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isSmallLetterAlphabet(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.ALPHABET_LOWERCASE_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isCapitalLetterAlphabet(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.ALPHABET_UPPERCASE_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isAlphabetAndNumber(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.ALPHABET_NUMBER_OLNY_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isCharacterOnly(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.CHARACTER_ONLY_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isCharacterAndNumber(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.CHARACTER_NUMBER_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isSpecialCharacter(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.SPECIAL_CHARACTER_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isEmail(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isPassword(String strValue) {
		Pattern pattern = Pattern.compile(PatternMatcher.PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(strValue);
		
		if(matcher.find()) {
			return true;
		} else {
			return false;
		}
	}
	
	public Pattern getPattern() {
		return pattern;
	}
	
	public void setPattern(String pattern) {
		this.pattern = Pattern.compile(pattern);
	}
}
