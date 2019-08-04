
public class MethodReferenceExample1 {

	public static void m1() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child thread created using static method reference "+i);
	}

	public void m2() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child thread created using instance method reference "+i);
	}

	public static void main(String[] args) {

		Runnable lambdar = () -> {

			for (int i = 0; i < 10; i++)
				System.out.println("Child thread created using lambda expresison "+i);
		};

		Thread t1 = new Thread(lambdar);
		t1.start();

		Runnable staticmethodreferenceR = MethodReferenceExample1::m1;

		Thread t2 = new Thread(staticmethodreferenceR);
		t2.start();

		Runnable instancemethodreferenceR = new MethodReferenceExample1()::m2;

		Thread t3 = new Thread(instancemethodreferenceR);
		t3.start();

		// main thread

		for (int i = 0; i < 10; i++)
			System.out.println("main thread "+i);
	}

}
