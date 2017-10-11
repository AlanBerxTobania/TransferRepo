package testing.bdd.workshop.java.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Date;

public class CreateAccountFormPage extends AbstractPage{
    @FindBy(id = "header")
    private WebElement parent;

    public CreateAccountFormPage (final WebDriver webDriver) {super(webDriver);}


    public CreateAccountFormPage populateForm(int gender, String first_name, String last_name, String password, Date birthDate, String address, String city, String state, int zip, String country, String phone) {
        // gender: 0 means male, 1 means female
        click(parent, By.id("id_gender"+gender));
        parent.findElement(By.name("customer_firstname")).sendKeys(first_name);
        parent.findElement(By.name("customer_lastname")).sendKeys(last_name);
        parent.findElement(By.id("passwd")).sendKeys(password);
        //retrieving dropdown
        WebElement dropdown = parent.findElement(By.id("days"));
        dropdown.findElement(By. // continue here)


        return this;
    }
}
