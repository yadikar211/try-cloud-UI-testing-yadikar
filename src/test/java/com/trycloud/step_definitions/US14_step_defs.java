package com.trycloud.step_definitions;

import com.trycloud.pages.Trycloud13;
import com.trycloud.pages.Trycloud14;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class US14_step_defs {
    Trycloud14 trycloud14=new Trycloud14();
    String depot = "";

    @Given("the user clicks the magnifier icon on the right top")
    public void theUserClicksTheMagnifierIconOnTheRightTop() {
        trycloud14.lupaClick.click();
        BrowserUtils.waitFor(2);
    }

    @And("users search any existing file,folder,user name")
    public void usersSearchAnyExistingFileFolderUserName() {
        String send = "User";
        depot += send;
        trycloud14.searchBox.sendKeys(send + Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @Then("verify the app displays the expected result option")
    public void verifyTheAppDisplaysTheExpectedResultOption() {

        trycloud14.getSearchList(depot);
    }

}
