package le.viet.com.spring5dependenciesinjection.controllers;

import le.viet.com.spring5dependenciesinjection.services.SpanishGreeting;
import le.viet.com.spring5dependenciesinjection.services.VNGreeting;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by associate on 3/6/18.
 */
public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new SpanishGreeting());
    }

    @Test
    public void sayHello() throws Exception {
        assertEquals("Hola!", this.constructorInjectedController.sayHello());
    }

}