package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDefs {

    P03_Homepage sliders = new P03_Homepage();

    @When("user click on first slider Nokia Lumia")
    public void userClickOnFirstSliderNokiaLumia() {
        sliders.firstslider().click();
    }
    @Then("product Nokia Lumia  page open successfully")
    public void productNokiaLumiaPageOpenSuccessfully() {
        SoftAssert soft = new SoftAssert();
        String actualUrl =driver.getCurrentUrl();
        soft.assertEquals(actualUrl," https://demo.nopcommerce.com/nokia-lumia-1020");
        soft.assertAll();
    }

    @When("user click on second slider iPhone")
    public void userClickOnSecondSliderIPhone() {
        sliders.secondslider().click();}

    @Then("product iPhone page open successfully")
    public void productIPhonePageOpenSuccessfully() {
        SoftAssert soft = new SoftAssert();
        String actualUrl =driver.getCurrentUrl();
        soft.assertEquals(actualUrl,"https://demo.nopcommerce.com/iphone-6");
        soft.assertAll();}
}
