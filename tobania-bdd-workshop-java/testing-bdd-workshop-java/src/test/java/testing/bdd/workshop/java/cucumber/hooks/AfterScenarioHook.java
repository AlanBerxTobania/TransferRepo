package testing.bdd.workshop.java.cucumber.hooks;

import testing.bdd.workshop.java.cucumber.CucumberContext;
import testing.bdd.workshop.java.webdriver.WebDriverFactory;
import cucumber.api.java.After;
import org.springframework.beans.factory.annotation.Autowired;

public class AfterScenarioHook {

    @Autowired
    private WebDriverFactory webDriverFactory;

    @Autowired
    private CucumberContext cucumberContext;

    @After
    public void resetWebDriver() {
        webDriverFactory.quitWebDriver();
        cucumberContext.clear();
    }
}
