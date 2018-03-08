package le.viet.com.spring5dependenciesinjection.controllers;

import le.viet.com.spring5dependenciesinjection.services.GreetingService;
import le.viet.com.spring5dependenciesinjection.services.SpanishGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * * This demo dependency injection through constructor
 * Created by associate on 3/6/18.
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(@Qualifier("spanishGreeting") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.greetingService.sayHello();
    }
}
