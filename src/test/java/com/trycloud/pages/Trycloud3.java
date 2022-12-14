package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

public class Trycloud3 extends Trycloud2 {



    @FindBy(xpath = "//ul[@id='appmenu']/li")
    public List<WebElement> modules1;

    @FindBy(xpath = "//ul[@id='appmenu']/li[@id='more-apps']/preceding-sibling::li")
    public List<WebElement> modules;

    public void loginProcess(String userName1, String passWord1) {
        userName.sendKeys(userName1);
        passwWord.sendKeys(passWord1);
        loginBtn.click();
    }


    public List<String> getModulesText() {

        List<String> modulesText = new ArrayList<>();
        for (int i = 0; i < modules.size(); i++) {

            BrowserUtils.hover(modules.get(i));
            BrowserUtils.sleep(1);
            modulesText.add(modules.get(i).getText());

        }
        return modulesText;

    }

    public void clickModulesWithText(String moduleName) {

        for (int i = 0; i < modules1.size() - 1; i++) {

            BrowserUtils.hover(modules1.get(i));
            BrowserUtils.sleep(1);
            if (modules1.get(i).getText().equals(moduleName)) {
                BrowserUtils.clickElement(modules1.get(i));
                break;
            }

        }


    }
}