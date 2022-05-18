package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegisterMsg;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordError;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement conformPasswordError;
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement conformPassword;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyMsgOfSuccessfullyRegister;



    public String setVerifyRegisterMsg() {
        log.info("Verify register text display :" + verifyRegisterMsg);
        return getTextFromElement(verifyRegisterMsg);
    }

    public void clickOnRegisterButton() {
        log.info("Click on register button :" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String firstNameErrorMsg() {
        log.info("Check mandatory error"+firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String lastNameErrorMsg() {
        log.info("Check mandatory error"+lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String emailErrorMsg() {
        log.info("Check mandatory error"+emailError.toString());
        return getTextFromElement(emailError);
    }

    public String passwordErrorMsg() {
        log.info("Check mandatory error"+passwordError.toString());
        return getTextFromElement(passwordError);
    }

    public String conformPasswordErrorMsg() {
        log.info("Check mandatory error"+conformPasswordError.toString());
        return getTextFromElement(conformPasswordError);
    }


    public void clickOnGenderButton() {
       clickOnElement(genderButton);
        log.info("Click on gender button :"+genderButton.toString());
    }

    public void enterFirstName(String name){
        sendTextToElement(firstName,name);
        log.info("Enter first name :"+firstName.toString());

    }
    public void enterLastName(String name1){
        sendTextToElement(lastName,name1);
        log.info("Enter last name :"+lastName.toString());

    }

    public void enterEmailAddress(String email1){
        sendTextToElement(email,email1);
        log.info("Enter email id :"+email.toString());

    }

    public void enterPassword(String password1){
        sendTextToElement(password,password1);
        log.info("Enter password:"+password.toString());

    }
    public void enterConformPassword(String confPassword){
        sendTextToElement(conformPassword,confPassword);
        log.info("Enter conformed password :"+conformPassword.toString());

    }
    public String verifyMsgOfSuccessfullyRegister(){
        log.info("verify Msg Of Successfully Register :"+verifyMsgOfSuccessfullyRegister.toString());
        return getTextFromElement(verifyMsgOfSuccessfullyRegister);


    }




}
