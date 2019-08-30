package com.yizhu;

import com.yizhu.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Client01Application {

    public static void main(String[] args) {
        SpringApplication.run(Client01Application.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public Object home(@RequestParam String name)

    {
        HashMap<String, Object> map = new HashMap<>();
        User user = new User("李白", "君不见黄河之水天上来");
        map.put("user", user);
        map.put("str", "hi " + name + ",i am from port:" + port);

        return map;

    }


}





