package com.bjstudio.utility.template.singleton;

public class SingletonTemplate {
	private SingletonTemplate() {
	}

	public static SingletonTemplate getInstance() {
		return SingletonLazyHolder.INSTANCE;
	}

	private static class SingletonLazyHolder {
		private static final SingletonTemplate INSTANCE = new SingletonTemplate();
	}
}
