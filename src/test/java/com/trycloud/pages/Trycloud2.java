package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trycloud2 {
    public Trycloud2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@id='user']")
    public WebElement userName;

    @FindBy (xpath = "//input[@id='password']" )
    public WebElement passwWord;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;

    @FindBy (xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongCredentialsMsg;





}
