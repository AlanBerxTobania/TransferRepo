package testing.bdd.workshop.java.config;

import testing.bdd.workshop.java.cucumber.CucumberContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestingConfig {

    @Bean
    public CucumberContext cucumberContext() {
        return new CucumberContext();
    }
}
