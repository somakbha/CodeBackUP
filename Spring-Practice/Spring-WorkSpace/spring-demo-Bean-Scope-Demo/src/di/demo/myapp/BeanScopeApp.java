package di.demo.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.demo.coach.CricketCoach;

public class BeanScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");

		
		//We are creating object of CricketCoach using scope "prototype"
		CricketCoach coachObj1 = context.getBean("myCoach", CricketCoach.class);
		
		CricketCoach coachObj2 = context.getBean("myCoach", CricketCoach.class);

		boolean result=(coachObj1==coachObj2);
		
		System.out.println("coachObj1 object address: "+coachObj1);
		System.out.println("coachObj2 object address: "+coachObj2);
		System.out.println("coachObj1 object and coachObj2 object address compariosn result: "+result);
		
		context.close();

	}

}
