package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P01_Register {

    public WebElement regLike() {return driver.findElement(By.className("ico-register"));}
    public WebElement Gender (){return driver.findElement(By.id("gender-female"));}
    public WebElement FirstName(){return driver.findElement(By.name("FirstName"));}
    public WebElement LastName(){return driver.findElement(By.id("LastName"));}
    public WebElement DayList(){return driver.findElement(By.name("DateOfBirthDay"));}
    public WebElement MonthList(){return driver.findElement(By.name("DateOfBirthMonth"));}
    public WebElement YearList(){return driver.findElement(By.name("DateOfBirthYear"));}
    public WebElement Email(){return driver.findElement(By.id("Email"));}
    // Your Password
    public WebElement Password(){return driver.findElement(By.id("Password"));}
    public WebElement ConfirmPassword(){return driver.findElement(By.id("ConfirmPassword"));}
    // Register Button
    public WebElement RegisterButton(){return driver.findElement(By.id("register-button"));}
    // Success Register
    public WebElement SuccessMSG(){return driver.findElement(By.className("result"));}
    public WebElement Continue(){return driver.findElement(By.className("register-continue-button"));}
}
