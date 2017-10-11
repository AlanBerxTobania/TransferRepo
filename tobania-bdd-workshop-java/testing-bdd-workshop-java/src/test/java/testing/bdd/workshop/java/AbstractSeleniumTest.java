package testing.bdd.workshop.java;

import testing.bdd.workshop.java.config.TestingConfig;
import testing.bdd.workshop.java.cucumber.CucumberContext;
import testing.bdd.workshop.java.webdriver.WebDriverFactory;
import testing.bdd.workshop.java.webdriver.config.SeleniumConfig;
import testing.bdd.workshop.java.webdriver.pages.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ContextConfiguration
@SpringBootTest(classes = {TestingConfig.class, SeleniumConfig.class})
public abstract class AbstractSeleniumTest {

    @Autowired
    private WebDriverFactory webDriverFactory;

    private List<AbstractPage> pageObjects = new ArrayList<>();

    @Autowired
    protected CucumberContext context;


    private WebDriver getWebDriver() {
        return webDriverFactory.getWebDriver();
    }

    protected HomePage homePage() {
        return getPageObject(HomePage.class);
    }

    protected SignInPage signInPage() {
        return getPageObject(SignInPage.class);
    }

    protected CreateAccountFormPage createAccountFormPage() {
        return getPageObject(CreateAccountFormPage.class);
    }

    protected ContactUsWidget contactUsWidget() {
        return getPageObject(ContactUsWidget.class);
    }

    @SuppressWarnings("unchecked")
    private <T extends AbstractPage> T getPageObject(Class<T> PageObjectClassType) {

        Optional<AbstractPage> pageObject = pageObjects.stream()
                .filter(PageObjectClassType::isInstance)
                .findFirst();
        if(pageObject.isPresent()) {
            return (T) pageObject.get();
        } else {
            return initializePageObject(PageObjectClassType);
        }
    }

    private <T extends AbstractPage> T initializePageObject(Class<T> PageObjectClassType) {

        T pageObject;

        try {
            pageObject = PageObjectClassType.getDeclaredConstructor(WebDriver.class)
                    .newInstance(webDriverFactory.getWebDriver());
        } catch (Exception e) {
            throw new IllegalStateException("Unable to initialize page object for class " + PageObjectClassType.getName());
        }

        pageObjects.add(pageObject);
        return pageObject;
    }
}
