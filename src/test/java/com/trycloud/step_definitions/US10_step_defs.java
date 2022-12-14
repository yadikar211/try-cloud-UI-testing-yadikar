package com.trycloud.step_definitions;

import com.trycloud.pages.Trycloud10;
import com.trycloud.pages.Trycloud6;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_step_defs {
    Trycloud10 trycloud10=new Trycloud10();
    Trycloud6 trycloud6=new Trycloud6();

    /**
     * User Story 10 TC1 *************************************************************************
     */
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        trycloud10.settingsBtn.click();
        BrowserUtils.waitFor(1);
    }

    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
        System.out.println(trycloud10.firstCheckBox.isSelected());
        System.out.println(trycloud10.secondCheckBox.isSelected());
        System.out.println(trycloud10.thirdCheckBox.isSelected());

        trycloud10.firstCheckBoxClick.click();
        trycloud10.secondCheckBoxClick.click();
        trycloud10.thirdCheckBoxClick.click();

        System.out.println(trycloud10.firstCheckBox.isSelected());
        System.out.println(trycloud10.secondCheckBox.isSelected());
        System.out.println(trycloud10.thirdCheckBox.isSelected());
        BrowserUtils.waitFor(2);
    }


    /**
     * User Story 10 TC2
     *
     * @return
     */
    String before = "";
    String after = "";

    @And("user checks the current storage usage")
    public void userChecksTheCurrentStorageUsage() {
        String a = trycloud10.checkStorage.getText();
        before += a;
    }

    @And("user uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() {
        BrowserUtils.waitFor(1);
        trycloud6.inputFile.sendKeys("C:\\Users\\TRIADA\\Desktop\\CYDEO\\case\\Java - Copy (7).jpg");
        BrowserUtils.waitFor(3);
    }

    @And("user refresh the page")
    public void userRefreshThePage() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitFor(3);
        String b = trycloud10.checkStorage.getText();
        after += b;
    }

    @Then("the user should be able to see storage usage is increased")
    public void theUserShouldBeAbleToSeeStorageUsageIsIncreased() {
        System.out.println("before upload " + before);
        System.out.println("after upload " + after);
        Assert.assertFalse(before.equalsIgnoreCase(after));
    }
}
