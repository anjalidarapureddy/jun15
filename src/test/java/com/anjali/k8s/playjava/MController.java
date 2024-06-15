package com.anjali.k8s.playjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MController {

    @GetMapping("/test-docker")

    public String getData() {
        return "Hello Welocome to the server!";
    }
}
