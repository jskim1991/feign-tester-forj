package com.sdg.dpd;

import org.springframework.stereotype.Component;

@Component
public class TestFallback implements TestClient {

	@Override
	public String getString() {
		return "STRING FALLBACK : get fallback method";
	}

	@Override
	public String postString(String string) {
		return "STRING FALLBACK : post fallback method";
	}
}
