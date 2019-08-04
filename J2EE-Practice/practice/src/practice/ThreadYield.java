package practice;

class MyThread1 extends Thread {

	public void run() {

		for(int i=0; i<10; i++)
		{
			Thread.yield();
			System.out.println("child thread"  );
		}
	}

}

public class ThreadYield {

	public ThreadYield() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		MyThread1 t = new MyThread1();
		t.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Parent thread"  );
		}

	}

}
