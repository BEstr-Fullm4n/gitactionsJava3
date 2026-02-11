
package com.bancoppel.gitactionsJava3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World Global CICD Template Repo Java 3 Test v1.0.2";
    }
}
