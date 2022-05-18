package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class ComputerSteps {
    @When("^I click on computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputer();
    }

    @Then("^I am navigate to computer page$")
    public void iAmNavigateToComputerPage() {
        String expectedMsg="Computers";
        Assert.assertEquals("No match found",expectedMsg,new ComputerPage().verifyComputer());
    }

    @And("^I click on Desktop tab$")
    public void iClickOnDesktopTab() {
        new DesktopsPage().clickOnDesktop();
    }

    @Then("^I am navigate to desktop page$")
    public void iAmNavigateToDesktopPage() {
        String expectedMsg="Desktops";
        Assert.assertEquals("No match found",expectedMsg,new DesktopsPage().verifyTextDesktop());

    }
    @Then("^I should navigate to Desktops Page successfully$")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        String expectedText = "Desktops";
        Assert.assertEquals("Desktops page not displayed", expectedText, new ComputerPage().getPageTitleText());
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^I select ram \"([^\"]*)\"$")
    public void iSelectRam(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^I select hdd \"([^\"]*)\"$")
    public void iSelectHdd(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^I should see product has been added to your shopping cart confirmation message$")
    public void iShouldSeeProductHasBeenAddedToYourShoppingCartConfirmationMessage() {
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals("Product does not added to cart", expectedMessage, new BuildYourOwnComputerPage().getProductAddedMessage());
    }

    @And("^I click on product name Build your own computer$")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new BuildYourOwnComputerPage().clickOnBuidYourComputer();

    }
}

