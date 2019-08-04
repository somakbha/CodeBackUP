import java.util.function.IntUnaryOperator;

public class UnaryOperatorExample1 {
	
	public static void main(String args[]) {
		IntUnaryOperator increaseValue=i->i+1;
		System.out.println("increase value 4 by 1:"+increaseValue.applyAsInt(4));
		
		
		IntUnaryOperator squareValue=i->i*i;
		System.out.println("square value of 4:"+squareValue.applyAsInt(4));
		
		int res=increaseValue.andThen(squareValue).applyAsInt(4);
		System.out.println("chaining unray operator result, increase value 4 by 1 and then square it:"+res);
	}

}
