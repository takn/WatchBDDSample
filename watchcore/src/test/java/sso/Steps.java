package sso;

import com.aetn.watch.core.sso.boundaries.ISSOPromptService;
import com.aetn.watch.core.sso.boundaries.ISSOPromptModel;

import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.mockito.Mockito.when;


/**
 * Created by nelsonramirez on 5/6/16.
 */
public class Steps {
    @Mock
    private ISSOPromptService ssoPromptService;
    @Mock
    private ISSOPromptModel mockedPromptModel;

    private ISSOPromptModel ssoPromptModel;


    @BeforeStory
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(mockedPromptModel.getBenefitsList()).thenReturn(Arrays.asList(new String[]{"one", "two"}));
        when(ssoPromptService.showPrompt()).thenReturn(mockedPromptModel);
    }

    @Given("I want to show the prompt")
    public void givenIWantToShowThePrompt() {
        // PENDING
    }

    @When("I request to show the prompt")
    public void whenIRequestToShowThePrompt() {
        ssoPromptModel = ssoPromptService.showPrompt();
    }

    @Then("I should see the dialog")
    public void thenIShouldSeeTheDialog() {
        //what to do here? figure it out
    }

    @Then("see a list of the benefits of signing up for an account")
    public void thenSeeAListOfTheBenefitsOfSigningUpForAnAccount() {
        Assert.assertNotNull(ssoPromptModel.getBenefitsList());
    }

    @Then("see a button to sign into an existing account")
    @Pending
    public void thenSeeAButtonToSignIntoAnExistingAccount() {
        // PENDING
    }

    @Then("see a button to register for a new account")
    @Pending
    public void thenSeeAButtonToRegisterForANewAccount() {
        // PENDING
    }

    @Then("see a close button")
    @Pending
    public void thenSeeACloseButton() {
        // PENDING
    }

    @Then("see a maybe later button")
    @Pending
    public void thenSeeAMaybeLaterButton() {
        // PENDING
    }

    @Then("I have a url to sign in")
    @Pending
    public void thenIHaveAUrlToSignIn() {
        // PENDING
    }

    @Then("I have a url to register")
    @Pending
    public void thenIHaveAUrlToRegister() {
        // PENDING
    }
}
