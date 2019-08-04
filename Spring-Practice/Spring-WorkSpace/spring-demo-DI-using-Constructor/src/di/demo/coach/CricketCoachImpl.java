package di.demo.coach;

import di.demo.fortune.FortuneService;

public class CricketCoachImpl implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoachImpl(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Parctice Fast Ball";
	}
	
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
