package practice;

import java.util.concurrent.locks.ReentrantLock;

public class SimpleThread extends Thread {
	int num;
	static ReentrantLock l=new ReentrantLock();
	
	public SimpleThread(int number)
	{
		this.num=number;
	}
	
	public void run()
	{
		l.lock();
		System.out.println("sum for "+num+" numbers calcullation is started ");
		int sum =0;
		for (int i=0; i<=num;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("sum for "+num+" numbers is "+sum);
		l.unlock();
	}
	
	
	public static void main (String args[])
	{
		SimpleThread t1= new SimpleThread(10);
		SimpleThread t2= new SimpleThread(5);
		t1.start();
		t2.start();
	}

	
}
