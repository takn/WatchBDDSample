package sso;

import com.aetn.sso.SSOSigningService;

import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by nelsonramirez on 5/6/16.
 */
public class Steps {
    private SSOSigningService ssoSignInStatusService;

    @BeforeStory
    public void setup() {
        ssoSignInStatusService = new SSOSigningService();
    }

    @Given("I am a <loggedIn> user")
    public void givenIAmAloggedInUser() {
    }

    @When("I start the app")
    @Pending
    public void whenIStartTheApp() {
        // PENDING
    }

    @Then("I <should> see the Single SignOn prompt dialog")
    @Pending
    public void thenIshouldSeeTheSingleSignOnPromptDialog() {
        // PENDING
    }
}
