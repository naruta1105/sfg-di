package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ContructorInjectedGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * sfg-di
 * guru.springframework.sfgdi.controllers
 * create by tranxuandien on 23/10/2021
 */
class ContructorInjectedControllerTest {
    ContructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ContructorInjectedController(new ContructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}