package testing.bdd.workshop.java.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends AbstractPage {

    @FindBy(id = "header")
    private WebElement parent;

    public SignInPage (final WebDriver webDriver) {super(webDriver);}

    public SignInPage enterEmail(String email){
        parent.findElement(By.id("email_create")).sendKeys(email);
        return this;
    }

    public SignInPage clickCreateAccount() {
        click(parent, By.id("SubmitCreate"));
        return this;
    }
}
