package annotations.demo;

import org.springframework.stereotype.Component;

//We are not giving any explicit bean id to the following class
//so that spring will give the default bean id which is class name itself
//with first letter in lower case so here it is: tennisCoachImpl
@Component
public class TennisCoachImpl implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

}
