package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exercise1_Page2 {
    public Exercise1_Page2() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[.='Enter Account Information']")
    public WebElement information;

    @FindBy(xpath = "//label[@for='id_gender1']")
    public WebElement gender;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='days']")
    public WebElement day;
    @FindBy(xpath = "//*[@id='months']")
    public WebElement month;
    @FindBy(xpath = "//*[@id='years']")
    public WebElement year;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletter;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement offers;

    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement fname;

    @FindBy(xpath = "//*[@id='last_name']")
    public WebElement lname;

    @FindBy(xpath = "//*[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//*[@id='address1']")
    public WebElement address1;

    @FindBy(xpath = "//*[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//*[@id='country']")
    public WebElement country;
    @FindBy(xpath = "//*[@id='state']")
    public WebElement state;
    @FindBy(xpath = "//*[@id='city']")
    public WebElement city;
    @FindBy(xpath = "//*[@id='zipcode']")
    public WebElement zipcode;
    @FindBy(xpath = "//*[@id='mobile_number']")
    public WebElement mobile;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountBtn;






}
