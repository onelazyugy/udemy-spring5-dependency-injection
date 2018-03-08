package le.viet.com.spring5dependenciesinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by associate on 3/7/18.
 */
@Controller
public class ProfileDemoController {
    @Autowired
    private String sayBye;

    public void sayBye() {

    }

}
