package com.cydeo.step_definations;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;

public class Outdoor_StepDefinations {
    @Then("user navigate to {string}")
    public void user_navigate_to(String string) {
        Driver.getDriver().get(string);
    }

}
