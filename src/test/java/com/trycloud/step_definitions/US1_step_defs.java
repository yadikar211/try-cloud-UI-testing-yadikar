package com.trycloud.step_definitions;

import com.trycloud.pages.Trycloud1;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_step_defs {
    Trycloud1 trycloud1=new Trycloud1();
    @When("user use username {string} and passcode “Userpass123\"")
    public void user_use_username_and_passcode_userpass123(String username) {
       trycloud1.userName.sendKeys(username);
       trycloud1.passwWord.sendKeys("Userpass123");

    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        Assert.assertEquals("Dashboard - Trycloud", Driver.getDriver().getTitle());

    }



}