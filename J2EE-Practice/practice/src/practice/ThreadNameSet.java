package practice;

class MyThread extends Thread {

	public void run() {

		System.out.println(Thread.currentThread().getName() + "------------" + Thread.currentThread().getPriority());
		System.out.println(this.getName());
	}

}

public class ThreadNameSet {

	public ThreadNameSet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Thread.currentThread().setPriority(7);
		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();
		t2.start();
		/*System.out.println(t1.getName() + "------------" + t1.getPriority());
		System.out.println(t2.getName() + "------------" + t2.getPriority());*/
		System.out.println(Thread.currentThread().getName() + "-------" + Thread.currentThread().getPriority());

	}

}
