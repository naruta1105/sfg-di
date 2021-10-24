package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * sfg-di
 * guru.springframework.sfgdi.services
 * create by tranxuandien on 23/10/2021
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
