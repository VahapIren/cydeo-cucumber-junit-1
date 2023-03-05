package com.cydeo.step_definations;

import com.cydeo.pages.DriverLoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DriverLogin_StepDefinations {

    DriverLoginPage driverLoginPage=new DriverLoginPage();
    @When("user enters username")
    public void user_enters_username() {
       driverLoginPage.username.sendKeys("user1");
    }
    @When("user enters password")
    public void user_enters_password() {
        driverLoginPage.password.sendKeys("UserUser123");
    }
    @Then("user should see the {string}")
    public void user_should_see_the(String string) {
        System.out.println("driverLoginPage.header.getText() = " + driverLoginPage.header.getText());
        Assert.assertTrue(string.equals(driverLoginPage.header.getText()));
    }


    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get("http://qa.fleetgru.com/");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        driverLoginPage.loginBtn.click();
    }


}
