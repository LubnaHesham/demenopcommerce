package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D04_searchDefs {

    P03_Homepage search = new P03_Homepage();

    @Given("user enter {string} in Search field")
    public void userEnterInSearchField(String arg0) {
        search.searchstore().sendKeys(arg0);
    }


    @When("user press on SEARCH button")
    public void userPressOnSEARCHButton() {
        search.searchbutton().click();
    }

    @Then("user go to search results page {string}")
    public void userGoToSearchResultsPage(String arg0) {
        SoftAssert soft = new SoftAssert();
        String actualUrl = driver.getCurrentUrl();
        soft.assertTrue(actualUrl.contains("https://demo.nopcommerce.com/search?q="));
        for (int x = 0; x < search.review().size(); x++) {
            String name = search.review().get(x).getText();
            System.out.println(x);
            System.out.println(name);
            soft.assertTrue(name.toLowerCase().contains(arg0));
            soft.assertAll();
        }
    }

    @Then("sku is displayed in product detail page {string}")
    public void skuIsDisplayedInProductDetailPage(String arg0) {
        SoftAssert soft = new SoftAssert();
        String actualUrl = driver.getCurrentUrl();
        soft.assertTrue(actualUrl.contains("https://demo.nopcommerce.com/search?q="));
        soft.assertEquals(search.review().size(),1);

        search.review().get(0).click();

        String sku =  search.sku().getText();

        soft.assertEquals(sku,arg0);

    }
}
