package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.Trycloud11;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.net.Proxy;

public class US11_step_defs {
    Trycloud11 trycloud11=new Trycloud11();
    Faker faker = new Faker();

    /**
     * User Story 11 TC1 *************************************************************************
     */
    @And("the user clicks the Talk module")
    public void theUserClicksTheTalkModule() {
        trycloud11.talkButton.click();
    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
        /**
         * Bug report = Expected Title does not match to Actual Title
         *
         * Expected :Talk - Trycloud QA
         * Actual   :Talk - Trycloud
         */
    }

    /**
     * User Story 11 TC2 *************************************************************************
     */
    String str = "";

    @And("user search user from the search box")
    public void userSearchUserFromTheSearchBox() {
        BrowserUtils.waitFor(1);
        trycloud11.searchBox.sendKeys("user");
        BrowserUtils.waitFor(1);
        trycloud11.user100.click();
        BrowserUtils.waitFor(1);
    }

    @And("user write a message")
    public void userWriteAMessage() {
        String sendText = faker.address().country();
        str += sendText;
        trycloud11.msgBox.sendKeys(str);
        BrowserUtils.waitFor(1);
    }

    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
        trycloud11.submitMsg.click();
        BrowserUtils.waitFor(1);
    }

    @Then("the user should be able to see the message is displayed on the conversation log")
    public void theUserShouldBeAbleToSeeTheMessageIsDisplayedOnTheConversationLog() {
        trycloud11.verifyMsg(str);
    }
}
