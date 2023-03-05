package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exercise1_Page1 {
    public Exercise1_Page1() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signup;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUser;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupBtn;




}
