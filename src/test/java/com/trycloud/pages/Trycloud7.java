package com.trycloud.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Trycloud7 extends Trycloud2{
    @FindBy (xpath = "//a[@class='button new']")
    public WebElement addBtn;

    @FindBy(xpath = "(//a[@class='menuitem'])[1]")
    public WebElement newFolderCreation;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement inputNewFolderCreation;

    @FindBy (xpath = "(//input[@type='submit'])[2]")
    public WebElement submitBtn;

    @FindBy(xpath = "//tr[@data-file='hello world123']")
    public WebElement folderNameFile;

    @FindBy(xpath = "(//td[@class='selection'])[24]")
    public WebElement folderNameFileCheckBox;

    @FindBy (xpath = "//td[@class='selection'] ")
    public List<WebElement> selectionBox;

    @FindBy(xpath = "(//table)[1]//tbody//tr")
    public List<WebElement> allFiles;

    @FindBy(xpath = "(//table)[1]//tr[@data-file='hello world123']")
    public WebElement helloWorldFile;


    @FindBy (xpath = "((//table//tbody)[1]//tr[@data-file='hello world123']//td)[1]")
    public WebElement clickFileBtn;

    @FindBy(xpath = "//input[@type ='file']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement newUploadBtn;

    @FindBy(xpath = "//table//tbody//tr[@data-file='Screen Shot 2022-09-27 at 2.29.57 AM.png']")
    public WebElement uploadedFile;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> files;



    public void clickSpecificCheckBox(String fileName) {
        for (int i = 0; i < selectionBox.size(); i++) {
            if (selectionBox.get(i).getText().equals(fileName)) {
                selectionBox.get(i).click();
            }
        }
    }

    public List<String> nameOfFilesToString(List<WebElement> listOfElement){

    List<String> lists =new ArrayList<>();
        for (WebElement each: listOfElement) {
            lists.add(each.getAttribute("data-file"));

        }

    return lists;
    }

    public void verifyFileName(List<WebElement> listOfElements, String expected){
        String actual = "";
        for (WebElement each : listOfElements){
            if(each.getText().equalsIgnoreCase(expected)){
                actual += "" + each.getText();
                break;
            }
        }
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }



}
