import java.util.function.Function;

public class FunctionExample1 {
	
	public static void main(String args[])
	{
		Function<Integer,Integer>squareIt=i->i*i;
		Function<String,String>upperCase=s->s.toUpperCase();
		Function<String,Integer>stringLength=s->s.length();
		
		System.out.println("Square of number 4 is "+squareIt.apply(4));
		System.out.println("upper case of string somak is "+upperCase.apply("somak"));
		System.out.println("length of string bhattacharya is "+stringLength.apply("bhattacharya"));
		
	}

}
