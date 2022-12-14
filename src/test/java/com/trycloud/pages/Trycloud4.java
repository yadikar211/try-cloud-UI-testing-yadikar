package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.util.List;

public class Trycloud4 extends Trycloud2 {



    public void loginProcess(String userName1, String passWord1) {
        userName.sendKeys(userName1);
        passwWord.sendKeys(passWord1);
        loginBtn.click();
    }


    @FindBy(xpath = "//ul[@id='appmenu']/li[@id='more-apps']/preceding-sibling::li")
    public List<WebElement> modules;

    @FindBy(xpath = "(//ul[@id='appmenu']/li[@id='more-apps']/preceding-sibling::li)[2]")
    public WebElement fileBtn;

    @FindBy(xpath = "(//th[@id='headerSelection'])[1]")
    public  WebElement topLeftCheckBox;

    @FindBy(xpath = "//tbody[@id='fileList']/tr")
    public WebElement allCheckBox;



    }





