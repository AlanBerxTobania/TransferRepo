package testing.bdd.workshop.java.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

    private final WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void click(final WebElement parent, final By by) {
        parent.findElement(by).click();
    }

    protected boolean isDisplayed(final WebElement parent, final By by) {
        return isDisplayed(parent.findElement(by));
    }

    protected boolean isDisplayed(final WebElement element) {
        return element.isDisplayed();
    }

    protected void typeInto(final WebElement parent, final By by, final String value) {
        parent.findElement(by).sendKeys(value);
    }
}
