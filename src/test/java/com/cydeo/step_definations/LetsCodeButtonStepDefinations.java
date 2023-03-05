package com.cydeo.step_definations;

import com.cydeo.pages.LetsCodeButtonPages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LetsCodeButtonStepDefinations {
    LetsCodeButtonPages letsCodeButtonPages=new LetsCodeButtonPages();
    @Given("user on the xxx button web page")
    public void userOnTheXxxButtonWebPage() {
        Driver.getDriver().get("https://letcode.in/buttons");
        WebElement xxx=Driver.getDriver().findElement(By.id("color"));
        System.out.println("xxx.getAttribute(\"color\") = " + xxx.getCssValue("color"));
    }

    @Given("user on the letscode button web page")
    public void userOnTheLetscodeButtonWebPage() {
        Driver.getDriver().get("https://letcode.in/buttons");
    }
    @When("user clicks GoTo Home button and navigate to Back")
    public void userClicksGoToHomeButtonAndNavigateToBack() {
        letsCodeButtonPages.gotoHomeBtn.click();
        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().back();
    }

    @When("user find location of FindLocation button")
    public void userFindLocationOfFindLocationButton() {
        System.out.println("letsCodeButtonPages.findPositionBtn.getLocation() = " + letsCodeButtonPages.findPositionBtn.getLocation());
    }

    @And("user prints What is my color button color")
    public void userPrintsWhatIsMyColorButtonColor() {
        System.out.println("letsCodeButtonPages.findColorBtn.getCssValue(\"color\") = " + letsCodeButtonPages.findColorBtn.getCssValue("color"));
    }

    @And("user prints heights and width")
    public void userPrintsHeightsAndWidth() {
        System.out.println("letsCodeButtonPages.findPropertyBtn.getSize() = " + letsCodeButtonPages.findPropertyBtn.getSize());
    }


    @And("user confirms button is disabled")
    public void userConfirmsButtonIsDisabled() {
        Assert.assertTrue(letsCodeButtonPages.isDisabledBtn.isDisplayed());
    }

    @And("user Click and Hold Button and sees name is Button has been long pressed")
    public void userClickAndHoldButtonAndSeesNameIsButtonHasBeenLongPressed() {


        Actions actions=new Actions(Driver.getDriver());
        actions.clickAndHold(letsCodeButtonPages.holdBtn).perform();


        BrowserUtils.sleep(2);
        String expectedText="Button has been long pressed";
        String actualText=letsCodeButtonPages.longPressBtn.getText();
        Assert.assertEquals("False",expectedText,actualText);
    }


}
