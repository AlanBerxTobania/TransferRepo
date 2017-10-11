package testing.bdd.workshop.java.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ContactUsWidget extends AbstractPage {

    @FindBy(className = "contact-form-box")
    private WebElement parent;

    public ContactUsWidget(WebDriver driver) {
        super(driver);
    }

    public boolean isContactWidgetDisplayed() {
        return isDisplayed(parent);
    }

    public ContactUsWidget fillInMessage(final String message) {
        typeInto(parent, By.id("message"), message);
        return this;
    }
}
