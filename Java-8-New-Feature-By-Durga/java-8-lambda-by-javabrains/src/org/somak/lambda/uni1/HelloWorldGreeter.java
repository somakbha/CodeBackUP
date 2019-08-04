package org.somak.lambda.uni1;

import org.somak.lambda.inter.Greeting;

public class HelloWorldGreeter implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello World");

	}

}
