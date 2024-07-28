package com.toqio.step_definitions;

import com.toqio.pages.ContentLanguagePage;
import com.toqio.pages.TeamMembersPage;
import com.toqio.utilities.BrowserUtils;
import com.toqio.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class contentLanguage_Step_Definitions {

    ContentLanguagePage contentLanguagePage = new ContentLanguagePage();

    @When("the user selects Spanish as a language")
    public void theUserSelectsSpanishAsALanguage() {

        BrowserUtils.hover(contentLanguagePage.clickLanguage);
        BrowserUtils.clickWithJS(contentLanguagePage.spanish);
    }

    @Then("the user should be able to verify the url {string}")
    public void theUserShouldBeAbleToVerifyTheUrl(String expectedUrl) {

        String actualMenuLanguage = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualMenuLanguage);
    }

}
