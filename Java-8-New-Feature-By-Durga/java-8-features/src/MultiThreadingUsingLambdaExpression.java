
//traditional way to do multi threading

/*class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child thread");
		}

	}

}*/

public class MultiThreadingUsingLambdaExpression {

	public static void main(String args[]) {
		
		//traditional way to do multi threading
		/*MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();*/
		
		Runnable r=()->{
			for (int i = 0; i <= 10; i++) {
				System.out.println("Child thread");
			}

		};
		
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Parent thread");
		}

	}

}
