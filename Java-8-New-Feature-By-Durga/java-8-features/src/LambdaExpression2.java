
@FunctionalInterface
interface interf2 {
	
	public void add(int a, int b);
}


class Demo2 implements  interf2{
	@Override
	public void add(int a, int b) {
		System.out.println("Sum by traditional way for "+a+" & "+b+" is:  " +(a+b));	
		}
}


public class LambdaExpression2 {
	
	public static void main (String args[])
	{
		interf2 i1=new Demo2();
		i1.add(7,8);
		
		interf2 i2=(a, b)-> System.out.println("Sum by lambda expression for "+a+" & "+b+" is: " +(a+b));
		i2.add(60, 40);
	}

}


