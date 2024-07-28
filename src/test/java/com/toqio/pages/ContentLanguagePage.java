package com.toqio.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContentLanguagePage extends BasePage{

    @FindBy(xpath = "//li//a[@lang='es']")
    public WebElement spanish;
    @FindBy(xpath ="//div[@class='globe_class']")
    public WebElement clickLanguage;
}