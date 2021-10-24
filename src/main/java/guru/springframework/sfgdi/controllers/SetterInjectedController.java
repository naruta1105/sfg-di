package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * sfg-di
 * guru.springframework.sfgdi.controllers
 * create by tranxuandien on 23/10/2021
 */
@Controller
public class SetterInjectedController {
    // Controller using changing property using setter

    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
}
