package com.demo.configuration;

public class SwimCoach implements ICoach {

	private IFortuneService fortuneService;

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
