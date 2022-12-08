package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_loginPage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDefs {

    P02_loginPage login = new P02_loginPage();

    @Given("user go to login page")
    public void openLogin(){
        login.Loginpage().click();
    }
    @When("user login with valid Email and password")
    public void userLoginWithEmailAndPassword() {
        login.Email().sendKeys("test@example.com");
        login.Password().sendKeys("P@ssw0rd");}

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.LoginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        String actualUrl =driver.getCurrentUrl();
        soft.assertEquals(actualUrl,"https://demo.nopcommerce.com/");
        boolean statusbtn =login.MyaccountButton().isDisplayed();
        soft.assertTrue(statusbtn);
        soft.assertAll();}

    @When("user login with invalid Email and password")
    public void userLoginWithInvalidEmailAndPassword() {
        login.email().sendKeys("wrong@example.com");
        login.password().sendKeys("P@ssw0rd");}

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        String msg = login.errormessage().getText();
        soft.assertEquals(msg,"Login was unsuccessful.");
        String actualcolor = login.errormessage().getCssValue("color");
        actualcolor = Color.fromString(actualcolor).asHex();
        soft.assertEquals(actualcolor,"#e4434b");
        soft.assertAll();
    }

}
