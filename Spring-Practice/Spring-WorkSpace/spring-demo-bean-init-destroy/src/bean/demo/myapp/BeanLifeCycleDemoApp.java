package bean.demo.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.demo.coach.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle-init-destroy.xml");

		Coach c = context.getBean("myCoach", Coach.class);

		System.out.println(c.getDailyWorkOut());
		System.out.println(c.getDailyFortune());
		context.close();

	}

}
