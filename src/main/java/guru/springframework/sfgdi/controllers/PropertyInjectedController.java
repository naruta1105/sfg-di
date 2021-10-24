package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * sfg-di
 * guru.springframework.sfgdi.controllers
 * create by tranxuandien on 23/10/2021
 */
@Controller
public class PropertyInjectedController {
    // Controller using changing property directly

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public PropertyInjectedGreetingService greetingService;

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
}
