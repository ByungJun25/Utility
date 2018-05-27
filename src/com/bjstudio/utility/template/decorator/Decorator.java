package com.bjstudio.utility.template.decorator;

public abstract class Decorator implements Component {
	protected Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public abstract void method();
}