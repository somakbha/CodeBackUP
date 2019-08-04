package annotations.demo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoachImpl implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

}
