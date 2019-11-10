package com.sdg.dpd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {

    private TestClient testClient;
    private DupClient dupClient;

    public ClientController(TestClient testClient, DupClient dupClient) {
        this.testClient = testClient;
        this.dupClient = dupClient;
    }

    @GetMapping("get")
    public String getString(){
        return testClient.getString();
    }
    
    @PostMapping("post")
    public String postString(@RequestBody String string) {
    	return testClient.postString(string);
    }

    @GetMapping("getDup")
    public String getStringDup(){
        return dupClient.getString();
    }
    
    @PostMapping("postDup")
    public String postStringDup(@RequestBody String string) {
    	return dupClient.postString(string);
    }
}
