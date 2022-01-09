package com.cybertek.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class ChercherTest {

    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");


    }

    @AfterMethod
    public void terDown(){
        driver.quit();

    }
    @Test
    public void alertPresentTest(){

        WebElement initiateAlert = driver.findElement(By.id("alert"));
        initiateAlert.click();

        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();
        alert.accept();



    }
    @Test
    public void disabledButtonTest(){

        WebElement button = driver.findElement(By.id("disable"));
        System.out.println("button.isEnabled() = " + button.isEnabled()); // false

        WebElement buttonInitiator = driver.findElement(By.id("enable-button"));
        buttonInitiator.click();

        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(button));

        System.out.println("button.isEnabled() = " + button.isEnabled()); // true
        Assert.assertTrue(button.isEnabled(),"Verify the Button is enabled");

    }




}
