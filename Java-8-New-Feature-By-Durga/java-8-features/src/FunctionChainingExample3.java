import java.util.function.Function;

public class FunctionChainingExample3 {
	
	public static void main(String args[])
	{
		Function<Integer,Integer>doubleIt=i->2*i;
		Function<Integer,Integer>tripleIt=i->i*i*i;
		
		
		System.out.println("demo of andThen function chaining "+doubleIt.andThen(tripleIt).apply(2));
		System.out.println("demo of compose function chaining "+doubleIt.compose(tripleIt).apply(2));
		
	}

}
