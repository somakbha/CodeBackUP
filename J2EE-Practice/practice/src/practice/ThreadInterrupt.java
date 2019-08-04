package practice;

class MyThread2 extends Thread {

	public void run() {

		try {
		for(int i=0; i<10; i++)
		{
			System.out.println("lazy thread"  );
			Thread.sleep(2000);
			
		}
		}
		catch (InterruptedException ie)
		{
			for(int i=0; i<100000; i++)
			{
				
			}
			System.out.println("I am interrupted"  );
		}
	}

}

public class ThreadInterrupt {

	public ThreadInterrupt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MyThread2 t= new MyThread2();
		
		t.start();
		t.interrupt();
		
		System.out.println("End of main thread"  );

	}

}
