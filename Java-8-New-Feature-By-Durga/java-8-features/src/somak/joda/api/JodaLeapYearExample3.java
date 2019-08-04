package somak.joda.api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaLeapYearExample3 {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("Current timezone: " + zone);

		ZoneId zone1 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(zone1);
		System.out.println("Current time in America/Los_Angeles timezone is: " + zt);
		
		String a[]=new String[5];
		System.out.println(a.getClass().getName() );

	}
	
	

}
