package le.viet.com.spring5dependenciesinjection.controllers;

import le.viet.com.spring5dependenciesinjection.services.VNGreeting;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by associate on 3/6/18.
 */
public class SetterInjectionControllerTest {
    private SetterInjectionController setterInjectionController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectionController = new SetterInjectionController();
        this.setterInjectionController.setGreetingService(new VNGreeting());
    }

    @Test
    public void sayHello() throws Exception {
        assertEquals("xin chao!", this.setterInjectionController.sayHello());
    }

}