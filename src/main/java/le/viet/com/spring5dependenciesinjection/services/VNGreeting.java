package le.viet.com.spring5dependenciesinjection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by associate on 3/6/18.
 */
@Service
@Qualifier("vnGreeting")
public class VNGreeting implements GreetingService {
    @Override
    public String sayHello() {
        return "xin chao!";
    }
}
