package com.bjstudio.utility.template.Enum;

public enum EnumExample {
	ENUM1(1, "decription1"), ENUM2(2, "decription2"), ENUM3(3, "decription3");
	
	private int intDescription;
	private String strDescription;
	
	private EnumExample(int intDescription, String strDescription) {
		this.intDescription = intDescription;
		this.strDescription = strDescription;
	}
	
	public static EnumExample getEnumValueByDescription(int intDescription) {
		for(EnumExample enumExample: EnumExample.values()) {
			if(enumExample.getIntDescription() == intDescription) {
				return enumExample;
			}
		}
		throw new IllegalArgumentException("There is no enum value. - intDescription: "+ intDescription);
	}
	
	public static EnumExample getEnumValueByDescription(String strDescription) {
		for(EnumExample enumExample: EnumExample.values()) {
			if(enumExample.getStrDescription().equals(strDescription)) {
				return enumExample;
			}
		}
		throw new IllegalArgumentException("There is no enum value. - strDescription: "+ strDescription);
	}

	public int getIntDescription() {
		return intDescription;
	}
	
	public String getStrDescription() {
		return strDescription;
	}
}
