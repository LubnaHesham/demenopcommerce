package org.example.stepDefs;
import static org.example.stepDefs.Hooks.driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDefs {
    P03_Homepage followUs = new P03_Homepage();
    @When("user click on  facebook icon at the end of page")
    public void userclickonfacebookicon(){followUs.Facebook().click();}

    @When("user click on twitter icon at the end of page")
    public void userClickOnTwitterIconAtTheEndOfPage() {followUs.Twitter().click();}

    @When("user click on rss icon at the end of page")
    public void userClickOnRssIconAtTheEndOfPage() {followUs.RSS().click();}

    @When("user click on youtube icon at the end of page")
    public void userClickOnYoutubeIconAtTheEndOfPage() {followUs.Youtube().click();}

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        WebDriverWait WAIT =  new WebDriverWait(driver, Duration.ofSeconds(10));
        WAIT.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String>tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    System.out.println(driver.getCurrentUrl());
    Assert.assertTrue(driver.getCurrentUrl().contains(arg0));}
    }
