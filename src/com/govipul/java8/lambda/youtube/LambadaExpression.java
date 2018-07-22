package com.govipul.java8.lambda.youtube;

public class LambadaExpression {

	public static void main(String[] args) {
		Greetings greetings = new HelloWorldGreetings();
		greetings.perform();

		Greetings annoynmousClass = new Greetings() {

			@Override
			public void perform() {
				System.out.println("Hellow World");
			}
		};
		annoynmousClass.perform();

		Greetings lambdaExpr = () -> System.out.println("Hello World Lambda");
		lambdaExpr.perform();
	}

}

interface Greetings {
	void perform();
}

class HelloWorldGreetings implements Greetings {

	@Override
	public void perform() {
		System.out.println("Hello World!");
	}

}