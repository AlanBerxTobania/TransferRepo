package testing.bdd.workshop.java.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import testing.bdd.workshop.java.AbstractSeleniumTest;
import testing.bdd.workshop.java.webdriver.pages.CreateAccountFormPage;

import java.util.Date;

public class CreateAccountWidgetSteps extends AbstractSeleniumTest {

    @Given("^Gert is on the homepage$")
    public void gertIsOnTheHomepage() throws Throwable {
        //nothing to do because homepage is already loaded in before scenario hook
    }

    @When("^Gert clicks Sign in$")
    public void gertClicksSignIn () throws Throwable {
        homePage().clickSignInButton();
    }

    @Then("^The Sign in widget is opened$")
    public void gertIsOnTheSignInPage() throws Throwable {
        // Do nothing, Gert is already on sign in page
    }

    @When("^Gert enters his email address$")
    public void gertEntersHisEmailAddress() throws Throwable {
        signInPage().enterEmail("gertemail@" + (int)(Math.random()*1000000000) + ".com");
    }

    @And("^Gert clicks Create an account$")
    public void gertClicksCreateAnAccount() throws Throwable {
        signInPage().clickCreateAccount();
    }

    @Then("^the create account form is opened$")
    public void theCreateAccountFormIsOpened() throws Throwable {
        // Do Nothing, Gert is already on the create account form page
    }

    @When("^the create account form is populated with the personal information of Gert$")
    public void theCreateAccountFormIsPopulatedWithThePersonalInformationOfGert() throws Throwable {
        CreateAccountFormPage.populateForm(0,"Gert","met een achternaam", "abcd1234",new Date(1990,8,21),"testerstreet 12", "New York", "New York", 45555, "United States", "011782858");
    }

    @And("^when the register button is pressed$")
    public void whenTheRegisterButtonIsPressed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the account is logged in$")
    public void theAccountIsLoggedIn() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the my account widget is opened$")
    public void theMyAccountWidgetIsOpened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
