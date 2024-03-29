package com.yizhu.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public Object hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, Object.class);
    }

    public String hiError(String name) {
        return "hey " +
                name + ", there is some problem with hi page";
    }

}
