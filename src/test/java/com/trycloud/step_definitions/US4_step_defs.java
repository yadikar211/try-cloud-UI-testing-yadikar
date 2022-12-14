package com.trycloud.step_definitions;

import com.trycloud.pages.Trycloud2;
import com.trycloud.pages.Trycloud4;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US4_step_defs {
    Trycloud4 trycloud4=new Trycloud4();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
    Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    trycloud4.loginProcess(ConfigurationReader.getProperty("userName"), ConfigurationReader.getProperty("passWord"));
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String module) {
    trycloud4.fileBtn.click();


        }
    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expected) {

        Assert.assertEquals(expected, Driver.getDriver().getTitle());
    }

    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
    trycloud4.topLeftCheckBox.click();
    }
    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
    trycloud4.allCheckBox.isSelected();
    }


}
