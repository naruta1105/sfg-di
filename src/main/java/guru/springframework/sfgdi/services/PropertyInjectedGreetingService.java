package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * sfg-di
 * guru.springframework.sfgdi.services
 * create by tranxuandien on 22/10/2021
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
