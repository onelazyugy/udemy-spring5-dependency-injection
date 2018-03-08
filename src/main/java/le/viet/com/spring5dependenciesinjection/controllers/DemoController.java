package le.viet.com.spring5dependenciesinjection.controllers;

import le.viet.com.spring5dependenciesinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * This demo @Primary annotation because we have multiple beans of same type
 * Created by associate on 3/6/18.
 */
@Controller
public class DemoController {
    private GreetingService greetingService;

    public DemoController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return this.greetingService.sayHello();
    }
}
