package com.trycloud.step_definitions;

import com.trycloud.pages.Trycloud2;
import com.trycloud.pages.Trycloud3;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class US3_step_defs {
    Trycloud3 tryCloud3=new Trycloud3();
    Trycloud2 trycloud2=new Trycloud2();
    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
    tryCloud3.loginProcess(ConfigurationReader.getProperty("userName"),ConfigurationReader.getProperty("passWord"));
    }


    @Then("Verify the user see the following modules:")
    public void verifyTheUserSeeTheFollowingModules(List<String> expectedModules) {
         List<String> actualModuleNames = tryCloud3.getModulesText();
           Assert.assertEquals(expectedModules,actualModuleNames);
    }
}
