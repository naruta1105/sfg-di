package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * sfg-di
 * guru.springframework.sfgdi.controllers
 * create by tranxuandien on 23/10/2021
 */
@Controller
public class I18nController {
    // This greeting with different language. i18n is abbtract for international
    // by using profile to determine which same-name beans to be used
    private GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
