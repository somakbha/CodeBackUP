package org.somak.lambda.uni1;

import org.somak.lambda.inter.Greeting;

public class Greeter {
	
	public void perform(Greeting gt)
	{
		gt.perform();
	}

	public static void main(String[] args) {
	
		Greeter greeter=new Greeter();
		Greeting gt=new HelloWorldGreeter();
		greeter.perform(gt);
		
		Greeting gt1=()->System.out.println("Hello India");
		//passing a variable which points to lambda expression
		greeter.perform(gt1);
		
		//passing a lambda expression as value directly
		greeter.perform(()->System.out.println("Hello Bangalore"));
		

	}

}
