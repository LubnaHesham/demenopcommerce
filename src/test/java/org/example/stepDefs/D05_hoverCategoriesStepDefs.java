package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDefs {
    P03_Homepage hover = new P03_Homepage();
    int cateNum;
    int subCateNum;
    String subCat;
    String pageTitle;

    @Given("user hover on random category")
    public void thereAreMainCategoriesContainsSubCategoriesComputersElectronicsApparel() {

        //Step 1- user hover on random category
        cateNum = new Random().nextInt(3);
        System.out.println(cateNum);
        Actions action = new Actions(driver);
        action.moveToElement(hover.mainLinks().get(cateNum)).perform();

    }

    @When("user select random subcategory")
    public void userSelectRandomSubcategory() {

        //Step 2- user select random subcategory
        subCateNum = new Random().nextInt(3);
        System.out.println(subCateNum);

        cateNum = cateNum + 1;
        subCat = hover.subCateLinks(cateNum).get(subCateNum).getText();
        System.out.println(subCat);

    }


    @And("user click on selected sub category")
    public void userClickOnSelectedSubCategory() {
        //Step 3 - user click on selected sub category
        hover.subCateLinks(cateNum).get(subCateNum).click();

    }

    @And("gettext for page title")
    public void gettextForPageTitle() {
        //Step 4- gettext for page title
        pageTitle = hover.pageTitle().getText();

    }

    @Then("sub-category page open successfully")
    public void subCategoryPageOpenSuccessfully() {
        //Step 5- compare subcategory text with pagetitle text
        Assert.assertEquals(subCat.toLowerCase().trim(), pageTitle.toLowerCase().trim());
    }
}