package testing.bdd.workshop.java.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"classpath:features"},
        tags = {"~@ignore"},
        glue = {"testing.bdd.workshop.java.cucumber", "cucumber.api.spring"},
        plugin = {"pretty", "json:target/cucumber-json/testing-bdd-workshop.json"},
        monochrome = true
)
public class CucumberTests {}
