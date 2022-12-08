package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Homepage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_CurrenciesStepDefs {

    P03_Homepage home = new P03_Homepage();

    @Then("first option is dollar")
    public void firstoptionisdollar() {
        Select Currlist = new Select(home.currencylist());
        String firstoption = Currlist.getFirstSelectedOption().getText();
        Assert.assertEquals(firstoption, "US Dollar");
    }

    @When("user select Euro option")
    public void userSelectEuroOption() {
        Select Currlist = new Select(home.currencylist());
        Currlist.selectByVisibleText("Euro");
    }

    @Then("Prices changed successfully")
    public void pricesChangedSuccessfully() {
        for (int x = 0; x < 4; x++) {
            String Price = home.Prices().get(x).getText();
            System.out.println(x);
            System.out.println(Price);
            Assert.assertTrue(Price.contains("€"));
        }
    }

}
