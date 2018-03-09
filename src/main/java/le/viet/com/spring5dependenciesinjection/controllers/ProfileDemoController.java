package le.viet.com.spring5dependenciesinjection.controllers;

import le.viet.com.spring5dependenciesinjection.services.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by associate on 3/8/18.
 */
@Controller
public class ProfileDemoController {
    //--class property injection
//    @Autowired
//    private Vehicle vehicle;
    //--end

    //--constructor injection
    private Vehicle vehicle;

    @Autowired
    public ProfileDemoController(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    //--end

    public String getProfile() {
        return vehicle.retrieveVehicleProfile();
    }
}
