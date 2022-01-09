
package com.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

	@Autowired
	@Qualifier("happyFortuneService")
	private IFortuneService fortuneService;

	@Override
	public String getName() {
		return "Tennis Coach";
	}

	@Override
	public String getFortune() {
		return this.fortuneService.getFortune();
	}

}
