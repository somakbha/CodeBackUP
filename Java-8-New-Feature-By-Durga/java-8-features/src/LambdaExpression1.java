
@FunctionalInterface
interface interf {
	
	public void m1();
}


class Demo implements  interf{
	@Override
	public void m1() {
		System.out.println("Hello world by traditional way");	
		}
}


public class LambdaExpression1 {
	
	public static void main (String args[])
	{
		interf i1=new Demo();
		i1.m1();
		
		interf i2=()-> System.out.println("Hello world by lambda expression");
		i2.m1();
	}

}


