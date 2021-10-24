package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * sfg-di
 * guru.springframework.sfgdi.services
 * create by tranxuandien on 23/10/2021
 */
@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
