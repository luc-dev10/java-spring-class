package com.demo.configuration;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {

	private IFortuneService fortuneService;

	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getName() {
		return "Swim for the win";
	}

	@Override
	public String getFortune() {
		return this.fortuneService.getFortune();
	}

}
