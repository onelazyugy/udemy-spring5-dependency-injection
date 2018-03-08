package le.viet.com.spring5dependenciesinjection.controllers;

import le.viet.com.spring5dependenciesinjection.services.VNGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by associate on 3/6/18.
 */
@Controller
public class PropertyInjectedController {
    @Autowired
    public VNGreeting greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}
