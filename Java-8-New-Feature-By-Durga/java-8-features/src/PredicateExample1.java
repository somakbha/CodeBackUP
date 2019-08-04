import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String args[]) {
		Predicate<Integer> p = i -> i % 2 == 0;

		System.out.println("test if number 10 is even:" + p.test(10));
		System.out.println("test if number 11 is even:" + p.test(11));

		Predicate<String> p2 = s -> s.length() > 5;
        String s1="somakb";
		System.out.println("length of String "+s1+" is more than 5 or not :" + p2.test(s1));

		String[] str = { "Nag", "sounak", "raj", "sourabh", "surya", "ritobroto" };

		for (String s2: str) {
			System.out.println("length of string " + s2 + " is greater that 5: " + p2.test(s2));
		}

	}

}
