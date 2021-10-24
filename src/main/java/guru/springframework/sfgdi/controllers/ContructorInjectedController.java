package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ContructorInjectedGreetingService;
import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * sfg-di
 * guru.springframework.sfgdi.controllers
 * create by tranxuandien on 23/10/2021
 */
@Controller
public class ContructorInjectedController {
    // Controller using changing property using contructor
    private GreetingService greetingService;

    public ContructorInjectedController(@Qualifier("contructorInjectedGreetingService") GreetingService greetingService) {
        // no need Autowired
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }
}
