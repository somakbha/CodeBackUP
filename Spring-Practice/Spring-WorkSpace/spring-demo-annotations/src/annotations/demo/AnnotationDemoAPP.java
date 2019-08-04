package annotations.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AnnotationDemoAPP {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");

		//get the bean from spring container
		Coach c = context.getBean("thatSillyCoach", Coach.class);

		//call a method on the bean
		System.out.println(c.getDailyWorkOut());
		
		//close the context
		context.close();


	}

}
