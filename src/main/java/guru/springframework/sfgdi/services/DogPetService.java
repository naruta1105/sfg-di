package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * sfg-di
 * guru.springframework.sfgdi.services
 * create by tranxuandien on 24/10/2021
 */
@Profile({"dog", "default"})
@Service("pet")
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
