package org.somak.lambda.uni1;

public class RunnableExample {

	public static void main(String[] args) {
		Runnable r=()->{
			for (int i=0; i< 10; i++)
			{
				System.out.println("Child thread executing "+i+" th time");
			}
		};
		
		
		Thread t=new Thread(r);
		//Child thread starts here
		t.start();
		
		//Main thread continues here
		for (int i=0; i< 10; i++)
		{
			System.out.println("Main thread executing "+i+" th time");
		}

	}

}
