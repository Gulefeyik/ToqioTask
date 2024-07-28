package com.toqio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TeamMembersPage extends BasePage {

    @FindBy(css = "button#hs-eu-confirmation-button")
    public WebElement acceptCookieButton;
    @FindBy(xpath = "//li[@class='hs-menu-item hs-menu-depth-1 hs-item-has-children']//a[contains(text(),'Company')]")
    public WebElement company;
    @FindBy(xpath = "//li[@class='hs-menu-item hs-menu-depth-2']//a[contains(text(),'Team')]")
    public WebElement team;
    @FindBy(css = ".cm_team_cont>a")
    public List<WebElement> teamMembers;
}
