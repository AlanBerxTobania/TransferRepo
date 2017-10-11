package testing.bdd.workshop.java.cucumber.hooks;

import testing.bdd.workshop.java.webdriver.WebDriverFactory;
import cucumber.api.java.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class BeforeScenarioHook {

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private WebDriverFactory factory;

    @Before
    public void goToHomePage() {
        factory.getWebDriver().get(appUrl);
    }
}
