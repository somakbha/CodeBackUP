package somak.joda.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JodaExample1 {

	public static void main(String[] args) {
		LocalDate dt=LocalDate.now();
		System.out.println("Current Date:"+dt);
		
		LocalTime tm=LocalTime.now();
		System.out.println("Current Time:"+tm);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println("Current Date:"+datetime);
		
		int dd=datetime.getDayOfMonth();
		int mm=datetime.getMonthValue();
		int yy=datetime.getYear();
		int hr=datetime.getHour();
		int min=datetime.getMinute();
		int sec=datetime.getSecond();
		
		System.out.printf("Current system date and time is: %d-%d-%d %d:%d:%d", dd,mm,yy,hr,min,sec);
		
		//Convert a particular date
		System.out.println();
		LocalDateTime birthDate=LocalDateTime.of(1980,12,20,19,45);
		System.out.println("somak's birthdate: "+birthDate);
		System.out.println("After 6 month's of somak's birthday: "+birthDate.plusMonths(6));
		System.out.println("Before 3 month's of somak's birthday: "+birthDate.minusMonths(3));
		

	}

}
