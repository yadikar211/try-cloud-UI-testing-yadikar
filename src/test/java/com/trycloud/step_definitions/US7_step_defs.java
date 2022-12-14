package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.Trycloud7;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class US7_step_defs {
    Trycloud7 trycloud7 = new Trycloud7();

    String nameForNewFolder = "hello world123";

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        trycloud7.addBtn.click();
    }

    @And("user click new folder")
    public void userClickNewFolder()  {
        BrowserUtils.sleep(2);
        trycloud7.newFolderCreation.click();

    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
        //trycloud7.newFolderCreation.clear();
        trycloud7.inputNewFolderCreation.sendKeys(nameForNewFolder);

    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        trycloud7.submitBtn.click();
    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        BrowserUtils.sleep(1);
        //List<String> folderNames = trycloud7.nameOfFilesToString(trycloud7.allFiles);
        Driver.getDriver().navigate().refresh();
        trycloud7.helloWorldFile.isDisplayed();
        //Assert.assertTrue(folderNames.contains(nameForNewFolder))

    }

    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
       trycloud7.helloWorldFile.click();
    }

    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
    trycloud7.newUploadBtn.click();
    BrowserUtils.waitForPageToLoad(5);
    trycloud7.uploadFileBtn.sendKeys("/Users/apple/Desktop/Screen Shot 2022-09-27 at 2.29.57 AM.png");
    BrowserUtils.waitForPageToLoad(5);
    }



    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        BrowserUtils.sleep(3);
       trycloud7.verifyFileName(trycloud7.files, "Screen Shot 2022-09-27 at 2.29.57 AM");
        BrowserUtils.sleep(3);
        //List<String> elementsFileName=trycloud7.nameOfFilesToString(trycloud7.files);
    //Assert.assertTrue(elementsFileName.contains("/Users/apple/Desktop/Screen Shot 2022-09-27 at 2.29.57 AM.png"));

    }


}