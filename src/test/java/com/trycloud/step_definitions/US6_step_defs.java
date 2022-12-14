package com.trycloud.step_definitions;

import com.trycloud.pages.Trycloud5;
import com.trycloud.pages.Trycloud6;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class US6_step_defs extends Trycloud5 {



    Trycloud6 filesPage = new Trycloud6();
    String nameOfFile = filesPage.nameOfFirstFile.getText();



    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        Assert.assertFalse(filesPage.nameOfFilesToString(filesPage.listOfFavoriteFiles).equals(nameOfFile));
    }

    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        filesPage.addIconBtn.click();
    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        filesPage.clickFile(filesPage.actionIcon, filesPage.nameOfFirstFile.getAttribute("data-file"));
    }

    @When("users uploads file with the {string} option")
    public void users_uploads_file_with_the_upload_file_option(String optionFromAddBtn) {
        filesPage.selectFromListOfElements(filesPage.addIconDropdown, optionFromAddBtn);
        filesPage.inputFile.sendKeys("/Users/apple/Desktop/Screen Shot 2022-09-27 at 2.29.57 AM.png");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(filesPage.loadBar));
    }

    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {

    }


    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        List<String> namesOfAllFiles = filesPage.nameOfFilesToString(filesPage.listOfAllFiles);
        Assert.assertTrue(namesOfAllFiles.contains(nameOfFile));

    }










    /*
    Trycloud6 trycloud6=new Trycloud6();


    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        BrowserUtils.sleep(2);
        trycloud6.clickFile(trycloud6.actionIcon, "133");
    }
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
    //trycloud6.clickFile(trycloud6.choseOptionFromActionIcon, "Remove from favorites");
    //trycloud6.clickFile(trycloud6.allTabOptions, "Favorites");
        BrowserUtils.sleep(2);
    Assert.assertFalse(trycloud6.textFileNameUnderFav().contains("133"));

    }

    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

*/




}
