package di.demo.coach;

import di.demo.fortune.FortuneService;

public class CricketCoach {

	FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Parctice Fast Ball";
	}

	public String getFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
