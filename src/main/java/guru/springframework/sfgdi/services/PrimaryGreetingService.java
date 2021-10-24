package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * sfg-di
 * guru.springframework.sfgdi.services
 * create by tranxuandien on 23/10/2021
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    // Primary Bean will be used
    // when there is no @Qualifier
    @Override
    public String sayGreeting() {
        return "Hello World - From Primary Bean";
    }
}
