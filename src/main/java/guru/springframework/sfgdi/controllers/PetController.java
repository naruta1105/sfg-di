package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * sfg-di
 * guru.springframework.sfgdi.controllers
 * create by tranxuandien on 24/10/2021
 */
@Controller
public class PetController {
    private PetService petService;

    public PetController(@Qualifier("pet") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
