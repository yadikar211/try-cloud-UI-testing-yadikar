package com.trycloud.step_definitions;

import com.trycloud.pages.Trycloud9;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US9_step_defs {
    Trycloud9 trycloud9=new Trycloud9();

    @And("the user choose the {string} option")
    public void theUserChooseTheOption(String details) {
        trycloud9.detailsOnRightClickMenu(details);
        BrowserUtils.waitFor(1);
    }

    @And("user write a comment inside the input box")
    public void userWriteACommentInsideTheInputBox() {
        trycloud9.commentBtn.click();
        BrowserUtils.waitFor(1);
        String sendMsg = "Lambada7";
        trycloud9.textAreaInDetails.sendKeys(trycloud9.sendMsg());
        BrowserUtils.waitFor(1);
    }

    @And("user click the submit button to post it")
    public void userClickTheSubmitButtonToPostIt() {
        trycloud9.textSubmit.click();
        BrowserUtils.waitFor(1);
    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verifyTheCommentIsDisplayedInTheCommentSection() {
        trycloud9.verifyMsgUS9();
    }
}
