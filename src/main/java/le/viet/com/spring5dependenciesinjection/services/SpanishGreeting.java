package le.viet.com.spring5dependenciesinjection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by associate on 3/6/18.
 */
@Service
@Qualifier("spanishGreeting")
public class SpanishGreeting implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola!";
    }
}
