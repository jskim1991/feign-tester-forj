package com.sdg.dpd;

import org.springframework.stereotype.Component;

@Component
public class DupFallback implements TestClient {

	@Override
	public String getString() {
		return "DUP FALLBACK : get fallback method";
	}

	@Override
	public String postString(String string) {
		return "DUP FALLBACK : post fallback method";
	}
}
