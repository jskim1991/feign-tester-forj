package com.sdg.dpd;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
		contextId = "client-context-id", 
		name = "client-feign", url = "http://localhost:8001/server"
//		, configuration = TestClientConfiguration.class
		, fallback = TestFallback.class
		)
public interface TestClient {

    @GetMapping("get")
    String getString();
    
    @PostMapping("post")
    String postString(@RequestBody String string);
}