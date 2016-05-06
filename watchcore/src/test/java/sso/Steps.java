package sso;

import com.aetn.sso.SSOService;

import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by nelsonramirez on 5/6/16.
 */
public class Steps {
    private SSOService ssoService;

    @BeforeStory
    public void setup() {
        ssoService = new SSOService(false);
    }

    @Given("I am a <loggedIn> user")
    public void givenIAmAloggedInUser(@Named("loggedIn") boolean loggedIn) {
        ssoService = new SSOService(loggedIn);
        Assert.assertEquals(loggedIn, ssoService.isLoggedIn());
    }

    @When("I start the app")
    public void whenIStartTheApp() {
        // no op? will we need to know?
    }

    @Then("I <should> see the Single SignOn prompt dialog")
    public void thenIshouldSeeTheSingleSignOnPromptDialog(@Named("should") boolean should) {
        // PENDING
        Assert.assertEquals("fail",should,ssoService.shouldShowDialog());
    }
}
