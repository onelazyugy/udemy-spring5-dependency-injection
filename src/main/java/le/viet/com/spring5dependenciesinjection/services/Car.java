package le.viet.com.spring5dependenciesinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by associate on 3/8/18.
 */
@Service
@Profile("car")
public class Car implements Vehicle {
    @Override
    public String retrieveVehicleProfile() {
        return "profile car";
    }
}
