package com.myproject.whiteapp.interfaces.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author michael.cheung
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> hello(@RequestParam(value = "name", required = true) String name) {
        return Mono.just("Hello " + name);
    }

}
