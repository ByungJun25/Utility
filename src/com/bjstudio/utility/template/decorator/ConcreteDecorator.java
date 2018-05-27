package com.bjstudio.utility.template.decorator;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
	}

	@Override
	public void method() {
		System.out.println("Define the extended method here for Component.");
	}
}
