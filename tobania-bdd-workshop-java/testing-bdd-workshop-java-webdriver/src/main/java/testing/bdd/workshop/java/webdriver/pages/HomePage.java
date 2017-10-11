package testing.bdd.workshop.java.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(id = "header")
    private WebElement parent;

    public HomePage(final WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage clickContactUsButton() {
        click(parent, By.id("contact-link"));
        return this;
    }

    public HomePage clickSignInButton() {
        click(parent, By.linkText("http://automationpractice.com/index.php?controller=my-account"));
        return this;
    }
}
