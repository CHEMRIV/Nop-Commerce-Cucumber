package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegister();
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        String expectedMessage = "Register";
        String actualMessage = new RegisterPage().setVerifyRegisterMsg();
        Assert.assertEquals("Register page not displayed", expectedMessage, actualMessage);

    }


    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^verify mandatoryField$")
    public void verifyMandatoryField() {
    }


    @Then("^I am verify First name is required$")
    public void iAmVerifyFirstNameIsRequired() {
        String expectedMessage = "First name is required.";
        Assert.assertEquals("Not match Found",expectedMessage,new RegisterPage().firstNameErrorMsg());
    }

    @And("^I am verify last name is required$")
    public void iAmVerifyLastNameIsRequired() {
        String expectedMessage = "Last name is required.";
        Assert.assertEquals("Not match Found",expectedMessage,new RegisterPage().lastNameErrorMsg());
    }

    @And("^I am verify Email is required$")
    public void iAmVerifyEmailIsRequired() {
        String expectedMessage = "Email is required.";
        Assert.assertEquals("Not match Found",expectedMessage,new RegisterPage().emailErrorMsg());
    }

    @And("^I am verify Password is required$")
    public void iAmVerifyPasswordIsRequired() {
        String expectedMessage = "Password is required.";
        Assert.assertEquals("Not match Found",expectedMessage,new RegisterPage().passwordErrorMsg());
    }

    @And("^I am verify conformed Password is required$")
    public void iAmVerifyConformedPasswordIsRequired() {
        String expectedMessage = "Password is required.";
        Assert.assertEquals("Not match Found",expectedMessage,new RegisterPage().conformPasswordErrorMsg());
    }


    @And("^I am click on gender-female button$")
    public void iAmClickOnGenderFemaleButton() {
        new RegisterPage().clickOnGenderButton();
    }

    @And("^I am enter first name \"([^\"]*)\"$")
    public void iAmEnterFirstName(String name)  {
        new RegisterPage().enterFirstName(name);

    }

    @And("^I am enter last name \"([^\"]*)\"$")
    public void iAmEnterLastName(String lastName)  {
        new RegisterPage().enterLastName(lastName);

    }

    @And("^I am enter email id \"([^\"]*)\"$")
    public void iAmEnterEmailId(String email)  {
        new  RegisterPage().enterEmailAddress(email);

    }

    @And("^I am enter password \"([^\"]*)\"$")
    public void iAmEnterPassword(String password)  {
        new RegisterPage().enterPassword(password);


    }

    @And("^I am enter conformed password \"([^\"]*)\"$")
    public void iAmEnterConformedPassword(String conformedPassword)  {
        new RegisterPage().enterConformPassword(conformedPassword);

    }

    @Then("^I am register successfully$")
    public void iAmRegisterSuccessfully() {
        String expectedMsg="Your registration completed";
        Assert.assertEquals("No match found",expectedMsg,new RegisterPage().verifyMsgOfSuccessfullyRegister());
    }
}

