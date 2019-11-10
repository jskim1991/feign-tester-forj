package com.sdg.dpd;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TestClientConfiguration {

	@Bean
	public TestFallback stringFallback() {
		return new TestFallback();
	}
}
