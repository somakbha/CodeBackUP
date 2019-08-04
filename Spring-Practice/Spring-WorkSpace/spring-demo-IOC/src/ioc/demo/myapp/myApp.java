package ioc.demo.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ioc.demo.coach.Coach;

public class myApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");

		Coach c = context.getBean("myCoach", Coach.class);

		System.out.println(c.getDailyWorkOut());
		context.close();

	}

}
