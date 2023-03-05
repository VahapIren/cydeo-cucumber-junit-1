package com.cydeo.step_definations;

import com.cydeo.pages.LetsCodeButtonPages;
import com.cydeo.pages.LetsCodeInputPages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class LetsCode_StepDefinations {
    LetsCodeInputPages letsCodePages=new LetsCodeInputPages();

    @Given("user on the letscode input web page")
    public void user_on_the_letscode_web_page() {
        Driver.getDriver().get("https://letcode.in/edit");
    }
    @When("user write fullname on EnterFullNameInput")
    public void user_write_fullname_on_enter_full_name_ınput() {
       letsCodePages.fullNameInput.sendKeys("Vahap İren");
        BrowserUtils.sleep(3);

    }
    @When("user uses Tab key and write text on next input")
    public void user_uses_tab_key_and_write_text_on_next_input() {
        letsCodePages.joinInput.sendKeys("I am so good"+Keys.TAB);
        BrowserUtils.sleep(3);
    }
    @When("user goes next input and read text on next input")
    public void user_goes_next_input_and_read_text_on_next_input() {
        System.out.println("letsCodePages.getMeInput.getAttribute(\"value\") = " + letsCodePages.getMeInput.getAttribute("value"));
        BrowserUtils.sleep(3);
    }
    @When("user goes next input and clear the text on next input")
    public void user_goes_next_input_and_clear_the_text_on_next_input() {
        letsCodePages.clearMeInput.clear();
        BrowserUtils.sleep(3);
    }
    @When("user confirms next input is disabled")
    public void user_confirms_next_input_is_disabled() {
        Assert.assertFalse(letsCodePages.noEditInput.isEnabled());
        BrowserUtils.sleep(3);
    }
    @When("user goes next input and confirm input is readonly")
    public void user_goes_next_input_and_confirm_input_is_readonly() {
        Assert.assertTrue(letsCodePages.dontWriteInput.getAttribute("value").contains("readonly"));
        BrowserUtils.sleep(3);
    }
    @Then("user close the window")
    public void user_close_the_window() {
        BrowserUtils.sleep(3);
        Driver.getDriver().close();
    }


}
