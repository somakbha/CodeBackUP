import java.util.function.BiPredicate;

public class BiPredicateExample1 {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bp=(a,b)->(a+b)%2==0;
		System.out.println("Sum of number 10 and 20 is even:"+bp.test(10, 20));
		System.out.println("Sum of number 5 and 6 is even:"+bp.test(5, 6));
	}

}
