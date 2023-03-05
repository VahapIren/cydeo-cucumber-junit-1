package com.cydeo.step_definations;

import com.cydeo.pages.LetsCodeInputPages;
import com.cydeo.pages.SahibindenPages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import io.cucumber.java.eo.Se;
import io.cucumber.java.it.Ma;
import io.cucumber.java.ja.但し;
import org.bouncycastle.crypto.DSA;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class Sahibinden_StepDefinations {

    SahibindenPages sahibindenPages = new SahibindenPages();

    @Given("open sahibinden com")
    public void open_sahibinden_com() {
        Driver.getDriver().get("https://sahibinden.com");
        BrowserUtils.sleep(2);
        sahibindenPages.cookies.click();

    }

    @When("user enter a car brand")
    public void user_enter_a_car_brand() {
        sahibindenPages.otomobil.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        List<WebElement> names = new ArrayList<>();
        names = Driver.getDriver().findElements(By.xpath("//div[@class='jspPane']/li"));
        for (WebElement name : names) {
            js.executeScript("arguments[0].scrollIntoView(true)", name);
            System.out.println(name.getText());
        }

        BrowserUtils.sleep(2);


        //js.executeScript("arguments[0].scrollIntoView(true)", sahibindenPages.honda);
        js.executeScript("arguments[0]. click()", sahibindenPages.honda);
        //sahibindenPages.honda.click();

        BrowserUtils.sleep(5);

        /*
        sahibindenPages.navigasyon.click();
        BrowserUtils.sleep(2);
        sahibindenPages.alpine.click();

         */
    }

    @When("user enter the car model")
    public void user_enter_the_car_model() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(2);
        //js.executeScript("arguments[0].scrollIntoView(true)", sahibindenPages.jazz);
        //BrowserUtils.sleep(2);
        js.executeScript("arguments[0].click()", sahibindenPages.jazz);

        BrowserUtils.sleep(2);


    }

    @Then("User should see the Cheapest car's page on screen")
    public void user_should_see_the_cheapest_car_s_page_on_screen() {
        sahibindenPages.siralama.click();
        sahibindenPages.endusuk.click();
        BrowserUtils.sleep(3);

        List<WebElement> list = new ArrayList<>();
        List<WebElement> list2 = new ArrayList<>();
        List<WebElement> list3 = new ArrayList<>();
        String locator = "//table[@id='searchResultsTable']//tr/td[2]";

        list = Driver.getDriver().findElements(By.xpath(locator));
        list2 = Driver.getDriver().findElements(By.xpath(locator + "/following-sibling::td[5]"));
        list3 = Driver.getDriver().findElements(By.xpath(locator + "/following-sibling::td[7]"));

        BrowserUtils.sleep(3);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().equals("1.4 ES")) {
                System.out.print(list.get(i).getText() + "  ");
                System.out.print(list2.get(i).getText() + "  ");
                System.out.println(list3.get(i).getText());


            }
        }

    }
}


