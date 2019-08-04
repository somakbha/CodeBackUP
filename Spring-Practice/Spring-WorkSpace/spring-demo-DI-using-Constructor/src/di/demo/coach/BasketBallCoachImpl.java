package di.demo.coach;

import di.demo.fortune.FortuneService;

public class BasketBallCoachImpl implements Coach {
	
	private FortuneService fortuneService;

	public BasketBallCoachImpl(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run 5 KM daily";
	}

	public String getFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

}
