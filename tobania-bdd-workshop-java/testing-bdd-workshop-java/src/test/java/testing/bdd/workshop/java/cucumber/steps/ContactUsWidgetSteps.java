package testing.bdd.workshop.java.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testing.bdd.workshop.java.AbstractSeleniumTest;

import static org.assertj.core.api.Assertions.assertThat;

public class ContactUsWidgetSteps extends AbstractSeleniumTest {

    @Given("^Gert is on the homepage$")
    public void gertIsOnTheHomepage() throws Throwable {
        //nothing to do because homepage is already loaded in before scenario hook
    }

    @When("^Gert clicks Contact Us$")
    public void theUserClicksContactUs() throws Throwable {
        homePage().clickContactUsButton();
    }

    @Then("^the Contact Us Widget is opened$")
    public void theContactUsWidgetIsOpened() throws Throwable {
        assertThat(contactUsWidget().isContactWidgetDisplayed()).isTrue();
    }


}
