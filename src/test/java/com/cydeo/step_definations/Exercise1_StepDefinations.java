package com.cydeo.step_definations;

import com.cydeo.pages.Exercise1_Page1;
import com.cydeo.pages.Exercise1_Page2;
import com.cydeo.pages.Exercise1_Page3;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class Exercise1_StepDefinations {

    Exercise1_Page1 exercise1Page=new Exercise1_Page1();
    Exercise1_Page2 exercise1Page2=new Exercise1_Page2();

    Exercise1_Page3 exercise1Page3=new Exercise1_Page3();
    Faker faker = new Faker();

    @Given("Navigate to url {string} and verify home page is visible successfully")
    public void navigate_to_url_and_verify_home_page_is_visible_successfully(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("execise1.url"));
        String expectedTitle="Automation Exercise";
        Assert.assertTrue(expectedTitle.equals(Driver.getDriver().getTitle()));

    }
    @When("Click on Signup Login button and Verify New User Signup! is visible")
    public void click_on_signup_login_button_and_verify_new_user_signup_is_visible() {
        exercise1Page.signup.click();
        Assert.assertTrue(exercise1Page.newUser.isDisplayed());

    }
    @When("Enter name and email address and Click Signup button and Verify that ENTER ACCOUNT INFORMATION is visible")
    public void enter_name_and_email_address_and_click_signup_button_and_verify_that_enter_account_ınformatıon_is_visible() {

        exercise1Page.name.sendKeys(faker.name().fullName());
        exercise1Page.email.sendKeys(faker.internet().emailAddress());
        exercise1Page.signupBtn.click();
        Assert.assertTrue(exercise1Page2.information.isDisplayed());


    }
    @When("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        exercise1Page2.gender.click();
        exercise1Page2.password.sendKeys(faker.internet().password(6,8));

        Select select=new Select(exercise1Page2.day);
        select.selectByIndex(faker.number().numberBetween(1,31));
        Select select1=new Select(exercise1Page2.month);
        select1.selectByIndex(faker.number().numberBetween(1,12));
        Select select2=new Select(exercise1Page2.year);
        select2.selectByIndex(faker.number().numberBetween(0,122));



    }
    @When("Select checkbox Sign up for our newsletter! and Select checkbox Receive special offers from our partners!")
    public void select_checkbox_sign_up_for_our_newsletter_and_select_checkbox() {
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", exercise1Page2.newsletter);
        js.executeScript("arguments[0].click()",exercise1Page2.newsletter);
        js.executeScript("arguments[0].click()",exercise1Page2.offers);
    }
    @When("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        exercise1Page2.fname.sendKeys(faker.name().firstName());
        exercise1Page2.lname.sendKeys(faker.name().lastName());


        exercise1Page2.company.sendKeys(faker.company().name());
        exercise1Page2.address1.sendKeys(faker.address().fullAddress());
        exercise1Page2.address2.sendKeys(faker.address().fullAddress());
        Select select=new Select(exercise1Page2.country);
        select.selectByIndex(faker.number().numberBetween(0,6));
        exercise1Page2.state.sendKeys(faker.address().state());
        exercise1Page2.city.sendKeys(faker.address().city());
        exercise1Page2.zipcode.sendKeys(faker.address().zipCode());
        exercise1Page2.mobile.sendKeys(faker.phoneNumber().phoneNumber());
    }
    @When("Click Create Account button and Verify that ACCOUNT CREATED! is visible")
    public void click_create_account_button_and_verify_that_account_created_is_visible() {
        exercise1Page2.createAccountBtn.click();
        Assert.assertTrue(exercise1Page3.created.isDisplayed());


    }
    @When("Click Continue button and Verify that Logged in as username is visible")
    public void click_continue_button_and_verify_that_logged_in_as_username_is_visible() {
        exercise1Page3.continuee.click();


        try {
            Driver.getDriver().switchTo().frame("aswift_2");
            exercise1Page3.close.click();
        }catch (Exception e){
            Driver.getDriver().switchTo().frame("ad_iframe");

            exercise1Page3.close2.click();
        }





        BrowserUtils.sleep(2);
        Assert.assertTrue(exercise1Page3.user.isDisplayed());
    }
    @Then("Click Delete Account button and Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void click_delete_account_button_and_verify_that_account_deleted_is_visible_and_click_continue_button() {

    }

}
