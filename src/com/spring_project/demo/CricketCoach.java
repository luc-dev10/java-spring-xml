package com.spring_project.demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String team;
	private String emailAddress;

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Eating well";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
