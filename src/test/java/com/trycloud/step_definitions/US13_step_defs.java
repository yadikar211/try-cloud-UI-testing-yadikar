package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.Trycloud13;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class US13_step_defs {
    Trycloud13 trycloud13=new Trycloud13();
    Faker faker=new Faker();
    @Then("verify the contact names are in the list")
    public void verifyTheContactNamesAreInTheList() {
        BrowserUtils.waitFor(2);
        trycloud13.createNewContactBtn.click();
        trycloud13.inputName.clear();
        String sendKeys = faker.name().fullName();
        trycloud13.inputName.sendKeys(sendKeys);
        trycloud13.inputTel.sendKeys(faker.phoneNumber().cellPhone());
        trycloud13.inputEmail.sendKeys(faker.internet().emailAddress());
        trycloud13.inputAddress.sendKeys(faker.address().fullAddress());
        trycloud13.inputPostalCode.sendKeys(faker.address().zipCode());
        trycloud13.inputCity.sendKeys(faker.address().city());
        trycloud13.inputState.sendKeys(faker.address().state());
        trycloud13.inputCountry.sendKeys(faker.address().country());
        BrowserUtils.waitFor(1);
        trycloud13.clickContactBtn.click();

        trycloud13.verifyUS13();
    }

}
