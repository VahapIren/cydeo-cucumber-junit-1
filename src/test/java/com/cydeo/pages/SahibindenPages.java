package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SahibindenPages {

    public SahibindenPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookies;

    @FindBy(xpath="//a[@title='Otomobil']")
    public WebElement otomobil;

    @FindBy(xpath="//a[@title='Honda']")
    public WebElement honda;

    @FindBy(xpath="//a[@title='Aion']")
    public WebElement aion;

    @FindBy(xpath="//a[@title='Jazz']")
    public WebElement jazz;

    @FindBy(xpath = "//a[@id='advancedSorting']")
    public WebElement siralama;

    @FindBy(xpath = "//a[.='Fiyata göre (Önce en düşük)']")
    public WebElement endusuk;

    @FindBy(xpath = "//a[@title='Navigasyon Cihazı']")
    public WebElement navigasyon;

    @FindBy(xpath = "//a[@title='Alpine']")
    public WebElement alpine;

    @FindBy(xpath = "//a[@class='faceted-select']")
    public WebElement city;

    @FindBy(xpath = "//a[@class='noChild facetedCheckbox']/i")
    public WebElement istanbul;

    @FindBy(xpath = "//*[@id=\"searchResultLeft-address\"]/dl/dd/ul/li[1]/div/a")
    public WebElement cross;

    @FindBy(xpath = "//form//button")
    public WebElement search;


}
