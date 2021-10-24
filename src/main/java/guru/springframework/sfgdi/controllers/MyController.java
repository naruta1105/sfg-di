package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * sfg-di
 * guru.springframework.sfgdi.controllers
 * create by tranxuandien on 22/10/2021
 */
@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        // no need Autowired
        // This contructor will use primary bean
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return this.greetingService.sayGreeting();
    }

    public String sayHello() {
        System.out.println("Hello World!!");
        return "Hi Forks!";
    }

}
