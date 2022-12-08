package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;
public class P03_Homepage {
    public static WebElement currencylist(){return driver.findElement(By.name("customerCurrency"));}
    public List<WebElement> Prices(){return driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));}
    //Search
    public  WebElement searchstore(){return driver.findElement(By.cssSelector("input[type=\"text\"]"));}
    public WebElement searchbutton(){return driver.findElement(By.xpath("//button[@type=\"submit\"]"));}
    public List<WebElement> review(){return driver.findElements(By.cssSelector("div[class=\"product-item\"]"));}

    public WebElement sku(){return driver.findElement(By.cssSelector("div[class=\"sku\"] span[id*=\"sku\"]"));}

    public List<WebElement>mainLinks(){return driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));}

    public List<WebElement>subCateLinks(int cateNum){return driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li:nth-child("+cateNum+")>ul[class=\"sublist first-level\"]>li"));}

    public WebElement pageTitle() {return driver.findElement(By.cssSelector("div[class=\"page-title\"] h1"));}
    public WebElement firstslider(){return driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg\"]"));}
    public WebElement secondslider(){return driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.jpg\"]"));}
    public WebElement Facebook(){return driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));}
    public WebElement Twitter(){return driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));}
    public WebElement RSS(){return driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));}
    public WebElement Youtube(){return driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));}

    public List<WebElement> wishlistbutton(){return driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));}

    public WebElement successMsg(){return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));}

    public WebElement closicon(){return driver.findElement(By.cssSelector("span[class=\"close\"]"));}
    public  WebElement WishlistTop(){return driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));}

    //Dynamic locator
    public WebElement Qtyvalue(){return driver.findElement(By.cssSelector("input[name*=\"itemquantity\"]"));}

}