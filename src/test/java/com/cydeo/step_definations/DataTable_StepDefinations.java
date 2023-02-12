package com.cydeo.step_definations;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTable_StepDefinations {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_ı_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }


}
