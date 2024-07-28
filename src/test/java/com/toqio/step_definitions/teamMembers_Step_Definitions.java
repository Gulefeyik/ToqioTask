package com.toqio.step_definitions;

import com.toqio.pages.TeamMembersPage;
import com.toqio.utilities.BrowserUtils;
import com.toqio.utilities.ConfigurationReader;
import com.toqio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class teamMembers_Step_Definitions {


    TeamMembersPage teamMembersPage = new TeamMembersPage();

    @Given("User is on Toqio homepages")
    public void user_is_on_toqio_homepages() {
        Driver.get().get(ConfigurationReader.get("baseUrl"));
        teamMembersPage.acceptCookieButton.click();
    }

    @When("user clicks on company tab and team sub menu")
    public void userClicksOnCompanyTabAndTeamSubMenu() {
        BrowserUtils.hover(teamMembersPage.company);
        BrowserUtils.clickWithJS(teamMembersPage.team);

    }

    @Then("the user should be able to see following team members")
    public void theUserShouldBeAbleToSeeFollowingTeamMembers(List<String> expectedTeamMembers) {
        List<String> actualMembers = BrowserUtils.getElementsText(teamMembersPage.teamMembers);
        Assert.assertEquals(expectedTeamMembers, actualMembers);
    }
}
