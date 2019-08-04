package bean.demo.coach;

import bean.demo.fortuneservice.FortuneService;

public class TrackCoachImpl implements Coach {
	
	FortuneService fortuneService;

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return "Just Do it: "+fortuneService.getDailyFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	//add an init method
	
	public void doMyStartupStuff() {

		System.out.println("TrackCoach: inside method doMyStartupStuff");

	}
	
	//add a destroy method
	
	public void doMyCleanupStuff() {

		System.out.println("TrackCoach: inside method doMyCleanupStuff");

	}

}
