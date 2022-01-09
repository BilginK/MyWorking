package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class DropDownTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


    }

    @AfterMethod
    public void terDown(){
        driver.quit();

    }
    @Test
    public void test() throws InterruptedException {
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginbutton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        Thread.sleep(2000);
        loginbutton.click();

        WebElement orderButton = driver.findElement(By.linkText("Order"));
        orderButton.click();

        String expectedSelectedOption = "MyMoney";
        WebElement productDropdownElement = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select productDropDown = new Select(productDropdownElement);
        String actualSelectedOption = productDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualSelectedOption,expectedSelectedOption,"First option selected is NOT as expected");

        //Then select FamilyAlbum, make quantity 2, and click Calculate
        productDropDown.selectByVisibleText("FamilyAlbum");
        WebElement quatityBox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quatityBox.sendKeys("2");

        WebElement calculateButton = driver.findElement(By.cssSelector("input[type='submit']"));
        calculateButton.click();
// Then verify Total is equal to Quantity*PricePerUnit
        int expectedPrice = 160;

        WebElement totalPriceElement = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal"));

        //    System.out.println("totalPriceElement.getText() = " + totalPriceElement.getText());
        // will return nothing
        int actualPrice = Integer.parseInt(totalPriceElement.getAttribute("value"));

        Assert.assertEquals(actualPrice,expectedPrice,"Price is NOT as expected");


    }
}
