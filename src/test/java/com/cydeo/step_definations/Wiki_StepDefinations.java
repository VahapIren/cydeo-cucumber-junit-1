package com.cydeo.step_definations;

import com.cydeo.pages.WikipediaSerchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinations {

    WikipediaSerchPage wikipediaSerchPage = new WikipediaSerchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("user types {string} in the wiki search page")
    public void user_types_in_the_wiki_search_page(String string) {
        wikipediaSerchPage.searchBox.sendKeys(string);
    }

    @When("user click wiki search button")
    public void user_click_wiki_search_button() {
        wikipediaSerchPage.searchButton.click();
    }

    @Then("user sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }


    @Then("user sees {string} is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader(String string) {
        Assert.assertTrue(wikipediaSerchPage.mainHeader.isDisplayed());
        Assert.assertTrue(wikipediaSerchPage.mainHeader.getText().equals(string));

    }
}
