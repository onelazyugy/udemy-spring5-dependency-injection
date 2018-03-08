package le.viet.com.spring5dependenciesinjection.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by associate on 3/6/18.
 */
@Controller
public class DemoController {
    public String hello(){
        System.out.println("hello!");
        return "hello";
    }
}
