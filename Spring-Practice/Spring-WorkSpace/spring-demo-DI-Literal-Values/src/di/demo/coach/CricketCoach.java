package di.demo.coach;

import di.demo.fortune.FortuneService;

public class CricketCoach {
	
	private FortuneService fortuneService;
	private String emailAddres;
	
	public String getEmailAddres() {
		return emailAddres;
	}


	public String getTeam() {
		return team;
	}

	private String team;

	public void setEmailAddres(String emailAddres) {
		this.emailAddres = emailAddres;
	}


	public void setTeam(String team) {
		this.team = team;
	}

	
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
