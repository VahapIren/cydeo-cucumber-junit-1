package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsCodeInputPages {
    public LetsCodeInputPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "fullName")
    public WebElement fullNameInput;

    @FindBy(id = "join")
    public WebElement joinInput;

    @FindBy(id = "getMe")
    public WebElement getMeInput;
    @FindBy(id = "clearMe")
    public WebElement clearMeInput;
    @FindBy(id = "noEdit")
    public WebElement noEditInput;

    @FindBy(id = "dontwrite")
    public WebElement dontWriteInput;





}
