package ru.oparin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = "ru.oparin.service")
@EnableJpaRepositories(basePackages = "ru.oparin.service.repositories")
@EntityScan(basePackages = "ru.oparin.service.models")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);

    }
}
