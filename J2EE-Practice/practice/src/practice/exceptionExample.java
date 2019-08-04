package practice;

import java.io.FileNotFoundException;

public class exceptionExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		new exceptionExample().methodA();

	}
	
	
	private void methodA() throws FileNotFoundException
	{
		System.out.println("before calling method B");
		methodB();
		System.out.println("after calling method B");
	}
	
	private void methodB() throws FileNotFoundException
	{
		throw new FileNotFoundException();
	}

}
