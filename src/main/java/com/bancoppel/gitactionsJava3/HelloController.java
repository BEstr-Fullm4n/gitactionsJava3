
package com.bancoppel.gitactionsJava3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST principal de la aplicación.
 */
@RestController
public class HelloController {
    /**
     * Endpoint de prueba que retorna saludo.
     *
     * @return Mensaje de bienvenida
     *
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello World Global CICD Template Repo Java 3 Test v1.0.2";
    }
}
