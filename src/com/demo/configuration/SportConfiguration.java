package com.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.demo.configuration")
@PropertySource("classpath:sport.properties")
public class SportConfiguration {

	@Bean
	public IFortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public ICoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
