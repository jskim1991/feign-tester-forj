package com.sdg.dpd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("server")
public class ServerController {

    @GetMapping("get")
    public String getString() throws InterruptedException{
    	Thread.sleep(5000l);
        return "String from server";
    }
    
    @PostMapping("post")
    public String postString(@RequestBody String string) throws InterruptedException {
    	Thread.sleep(5000l);
    	return string + "wowowow";
    }
}
