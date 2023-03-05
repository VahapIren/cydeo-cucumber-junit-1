package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exercise1_Page3 {
    public Exercise1_Page3() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[.='Account Created!']")
    public WebElement created;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continuee;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement user;

    @FindBy(xpath = "//div[@style='cursor: pointer;']")
    public WebElement close;

    @FindBy(xpath = "//span[.='Close']")
    public WebElement close2;
}
