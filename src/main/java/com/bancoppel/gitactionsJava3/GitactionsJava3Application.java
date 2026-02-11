
package com.bancoppel.gitactionsJava3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación Spring Boot.
 */
@SpringBootApplication
public final class GitactionsJava3Application {
    /**
     * Constructor privado para la aplicación.
     */
    private GitactionsJava3Application() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de línea de comandos
     *
     */
    public static void main(final String[] args) {
        SpringApplication.run(GitactionsJava3Application.class, args);
    }
}
