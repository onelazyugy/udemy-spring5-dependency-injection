package le.viet.com.spring5dependenciesinjection.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by associate on 3/7/18.
 */
@Service
@Primary
@Qualifier("chineseGreeting")
public class ChineseGreeting implements GreetingService {
    @Override
    public String sayHello() {
        return "ni hao!";
    }
}
