package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Trycloud5 extends Trycloud2{


    @FindBy (xpath = "(//table[@id='filestable']//tbody//a[@class='action action-menu permanent'])[1]")
    public WebElement firstFileActionBtn;

    @FindBy (xpath = "(//table[@id='filestable'])[1]//tbody//tr[1]//span[@class='innernametext']")
    public WebElement nameOfFirstFile;

    @FindBy (xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li")
    public List<WebElement> actionDropdown;

    @FindBy (xpath = "(//table[@id='filestable'])[3]//tbody//tr[1]")
    public WebElement firstFavoriteFile;

    @FindBy (xpath = "//div[@id = 'app-navigation']//li")
    public List<WebElement> appNavigition;

    public void selectFromListOfElements(List<WebElement> listOfElement, String string){
        for (WebElement each: listOfElement){
            if (each.getText().equalsIgnoreCase(string)){
                each.click();
                break;
            }
        }
    }




    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> files;


@FindBy(xpath = "(//div[@class=\"fileActionsMenu popovermenu bubble open menu\"]//li/following-sibling::li)[2]")
    public WebElement AddFavorties;

@FindBy(xpath = "//div[@id=\"app-navigation-toggle\"]")
public WebElement tab;

@FindBy (xpath = "//li[@data-id='favorites']")
public WebElement tabFavorites;

@FindBy(xpath = "//tr[@data-tags='_$!<Favorite>!$_']")
public List<WebElement> filesUnderFavorites;

@FindBy(xpath = "//ul[@class='with-icon']/li")
public List<WebElement> allTabOptions;

@FindBy(xpath = "//tr[@data-id='32071']")
public  WebElement file123Chosen;

@FindBy(xpath = "(//table)[3]//tbody//tr[@data-file='133']")
public WebElement File133;


    @FindBy(xpath = "//div[@class='fileActionsMenu popovermenu bubble open menu']//li")
    public List<WebElement> choseOptionFromActionIcon;

    @FindBy (xpath = "(//span[@class='fileactions']/a[@data-action='menu'])")
    public List<WebElement> actionIcon;


    public List<String> actualFileText(){
    List<String> text=new ArrayList<>();

        for (int i = 0; i < filesUnderFavorites.size() ; i++) {
            text.add(filesUnderFavorites.get(i).getText());
        }


return text;
    }


    public void clickTheSubModules(String locatorName){
        for (int i = 0; i <allTabOptions.size() ; i++) {
            if(allTabOptions.get(i).getText().equals(locatorName)){
                allTabOptions.get(i).click();
            }
        }

    }

    public void clickFile(List<WebElement> webElements, String fileName){
        for (WebElement each: webElements) {
            if(each.getText().equals(fileName)){
                each.click();
                break;
            }
        }


    }


    public void clicKIconBtn(List<WebElement> webElements, String fileName, List<WebElement> webElements2){
        for (WebElement each: webElements) {
            if(each.getText().equals(fileName)){
                for (int i = 0; i < webElements2.size(); i++) {
                    webElements2.get(i).click();
                }

                break;
            }
        }


    }

}
