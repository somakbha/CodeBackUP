package di.demo.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.demo.coach.CricketCoach;

public class myApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");

		CricketCoach c = context.getBean("myCoach", CricketCoach.class);

		System.out.println(c.getDailyWorkOut());
		System.out.println(c.getFortuneService());
		System.out.println("Email address "+c.getEmailAddres());
		System.out.println("Team details "+c.getTeam());
		context.close();

	}

}
