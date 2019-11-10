package com.sdg.dpd;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DupClientConfiguration {

	@Bean
	public DupFallback dupFallback() {
		return new DupFallback();
	}
}
