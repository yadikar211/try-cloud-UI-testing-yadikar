package com.trycloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Trycloud6 extends Trycloud5{

    @FindBy (xpath = "(//table[@id='filestable'])[3]//tbody//tr")
    public List<WebElement> listOfFavoriteFiles;

    @FindBy (xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']//li")
    public List<WebElement> addIconDropdown;

    @FindBy (xpath = "//input[@type='file']")
    public WebElement inputFile;

    @FindBy (css = "#uploadprogressbar")
    public WebElement loadBar;

    @FindBy (xpath = "(//table[@id='filestable'])[1]//tbody//tr")
    public List<WebElement> listOfAllFiles;

    @FindBy (css = "a[class='button new']")
    public WebElement addIconBtn;


    public List<String> nameOfFilesToString(List<WebElement> listOfElement){
        List<String> lists = new ArrayList<>();
        for (WebElement each: listOfElement){
            lists.add(each.getAttribute("data-file"));
        }
        return lists;
    }










@FindBy (xpath = "(//span[@class='fileactions']/a[@data-action='menu'])")
    public List<WebElement> actionIcon;

@FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li")
public List<WebElement> choseOptionFromActionIcon;

@FindBy(xpath = "(//table)[3]//tbody[@id='fileList']//tr")
public List<WebElement> filesUnderFav;


public List<String> textFileNameUnderFav(){
    List<String> text=new ArrayList<>();
    for (int i = 0; i <filesUnderFav.size() ; i++) {
        text.add(filesUnderFav.get(i).getText());
    }
    return text;
}

public void clickFile(List<WebElement> webElements, String fileName){
    for (WebElement each: webElements) {
        if(each.getText().equals(fileName)){
            each.click();
            break;
        }
    }


}



}
