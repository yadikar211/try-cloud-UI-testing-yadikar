package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.Trycloud4;
import com.trycloud.pages.Trycloud5;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US5_step_defs {


    Trycloud5 filesPage = new Trycloud5();
    Faker faker = new Faker();
    String nameOfAddedFavoriteFile = "";

    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        filesPage.firstFileActionBtn.click();
        nameOfAddedFavoriteFile = filesPage.nameOfFirstFile.getText();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        filesPage.selectFromListOfElements(filesPage.actionDropdown,string);
    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        filesPage.selectFromListOfElements(filesPage.appNavigition,string);
    }

    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        Assert.assertEquals(nameOfAddedFavoriteFile,filesPage.firstFavoriteFile.getAttribute("data-file"));
    }








/*
    Trycloud5 trycloud5=new Trycloud5();

    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        BrowserUtils.sleep(3);
    trycloud5.clicKIconBtn(trycloud5.files, "133", trycloud5.choseOptionFromActionIcon );
    }
    @And("user choose the {string} option")
    public void user_choose_the_option(String string) {
        BrowserUtils.sleep(3);
    trycloud5.clickFile(trycloud5.choseOptionFromActionIcon, string);


    }
    @And("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {

    trycloud5.clickTheSubModules(string);
    }

    @Then("Verify the chosen file is listed on the table")
    public void verifyTheChosenFileIsListedOnTheTable() {
        Assert.assertEquals("133", trycloud5.File133.getAttribute("data-file"));

    }

*/

}