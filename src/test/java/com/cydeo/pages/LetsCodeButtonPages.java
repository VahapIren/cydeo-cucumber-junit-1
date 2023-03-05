package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsCodeButtonPages {
    public LetsCodeButtonPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="home")
    public WebElement gotoHomeBtn;
    @FindBy(id="position")
    public WebElement findPositionBtn;
    @FindBy(id="color")
    public WebElement findColorBtn;
    @FindBy(id="property")
    public WebElement findPropertyBtn;
    @FindBy(id="isDisabled")
    public WebElement isDisabledBtn;
    @FindBy(xpath = "//h2[.='Button Hold!']")
    public WebElement holdBtn;
    @FindBy(xpath = "//h2[.='Button has been long pressed']")
    public WebElement longPressBtn;



}
