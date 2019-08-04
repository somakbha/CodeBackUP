package somak.joda.api;

import java.time.Year;
import java.util.function.Predicate;

public class JodaTimeZoneExample4 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		Year y=Year.of(n);
		Predicate<Year>p=x->x.isLeap();
		if(p.test(y))
		{
			System.out.printf("%d is a leap year",n);
		}
		else
		{
			System.out.printf("%d is not a leap year",n);
		}
	}

}
