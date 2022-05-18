package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement desktop;
    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Desktops')]")
    WebElement desktopText;
    @CacheLookup
    @FindBy(tagName = "Build your own computer")
    WebElement buildYourOwnComputer;



    public void clickOnDesktop(){
        log.info("click on desktop tab"+desktop.toString());
        clickOnElement(desktop);
    }

    public String verifyTextDesktop(){
        log.info("Verify the Desktop text :"+desktop.toString());
        return getTextFromElement(desktopText);
    }
    public void clickOnBuildYourOwnComputer(){
        log.info("Click on build your own computer product :"+buildYourOwnComputer.toString());
        clickOnElement(buildYourOwnComputer);

    }
}



