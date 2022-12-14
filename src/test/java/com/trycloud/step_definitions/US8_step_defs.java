package com.trycloud.step_definitions;

import com.trycloud.pages.Trycloud8;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US8_step_defs {

    Trycloud8 trycloud8=new Trycloud8();
    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String files) {
        trycloud8.selectTopModule(files);
        BrowserUtils.waitFor(2);
    }

    @And("user click action-icon from any file on the page")
    public void userClickActionIconFromAnyFileOnThePage() {
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(trycloud8.deletedFileName).build().perform();
        trycloud8.fileName();
        BrowserUtils.waitFor(2);
    }

    @And("user choose the {string} option")
    public void userChooseTheOption(String deleteF) {
        trycloud8.deleteFile(deleteF);
        BrowserUtils.waitFor(1);
    }

    @When("the user clicks the {string} sub-module on the left side")
    public void theUserClicksTheSubModuleOnTheLeftSide(String deletedFiles) {

        trycloud8.deletedFiles(deletedFiles);
    }

    @Then("Verify the deleted file is displayed on the page.")
    public void verifyTheDeletedFileIsDisplayedOnThePage() {

        trycloud8.verifyDeletedFileUS8();
    }

}
