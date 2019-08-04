import java.util.function.Predicate;

public class PredicateExample3 {

	public static void main(String args[]) {
		Predicate<Integer> evenPredicate = i -> i % 2 == 0;
		Predicate<Integer> greaterThanTenPredicate = i -> i > 10;
		
		int x[]= {0,5,10,15,20,25,30,35};
		
		System.out.println("numbers greater than 10 and even");
		for (int i:x)
		{
			if (evenPredicate.and(greaterThanTenPredicate).test(i))
			{
				System.out.println(i);
			}
		}
		
		System.out.println("numbers greater than 10 or even");
		for (int i:x)
		{
			if (evenPredicate.or(greaterThanTenPredicate).test(i))
			{
				System.out.println(i);
			}
		}
		
		System.out.println("numbers which are not even");
		for (int i:x)
		{
			if (evenPredicate.negate().test(i))
			{
				System.out.println(i);
			}
		}

		
	}

}
