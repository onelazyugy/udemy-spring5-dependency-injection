package le.viet.com.spring5dependenciesinjection.controllers;

import le.viet.com.spring5dependenciesinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * * This demo dependency injection through class property
 * Created by associate on 3/6/18.
 */
@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("vnGreeting")
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}
