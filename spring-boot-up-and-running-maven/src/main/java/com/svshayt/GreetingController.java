package com.svshayt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    // Значение по-умолчанию, для случаев, когда переменная не описана
    // в объекте Environment приложения.
    @Value("${greeting-name: Mirage}")
    private String name;

    @GetMapping
    String getGreeting() {
        return name;
    }
}
