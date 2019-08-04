package somak.joda.api;

import java.time.LocalDate;
import java.time.Period;

public class JodaPeriodExample2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1980, 12, 20);
		Period p = Period.between(today, birthDate);

		System.out.printf("hello your age is: %d years %d months %d days", p.getYears(), p.getMonths(), p.getDays());

	}

}
