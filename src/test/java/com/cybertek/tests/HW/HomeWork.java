package com.cybertek.tests.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cybertek.utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class HomeWork {

    WebDriver driver;
    WebDriver wait;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registration_form = driver.findElement(By.linkText("Registration Form"));
        registration_form.click();

        WebElement element = driver.findElement(By.xpath("(//input[@class='form-control'])[7]"));
        element.sendKeys("wrong_dob");

        Thread.sleep(2000);

        String expectedMessage = "The date of birth is not valid";

        WebElement element1 = driver.findElement(By.xpath("//small[@data-bv-validator='date']"));

        String actualMessage = element1.getText();

        Assert.assertTrue(element1.isDisplayed(), "The date of birth is not valid IS DISPLAYED");


        if (expectedMessage.equals(actualMessage)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registration_form = driver.findElement(By.linkText("Registration Form"));
        registration_form.click();

        WebElement elementC = driver.findElement(By.xpath("//label[@for='inlineCheckbox1']"));
        Thread.sleep(1000);
        Assert.assertTrue(elementC.isDisplayed(), "C++ is display");

        WebElement elementJava = driver.findElement(By.xpath("//label[@for='inlineCheckbox2']"));
        Thread.sleep(1000);
        Assert.assertTrue(elementJava.isDisplayed(), "Java");

        WebElement elementJavaSc = driver.findElement(By.xpath("//label[@for='inlineCheckbox3']"));
        Thread.sleep(1000);
        Assert.assertTrue(elementJavaSc.isDisplayed(), "Java");

    }

    @Test
    public void test3() {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registration_form = driver.findElement(By.linkText("Registration Form"));
        registration_form.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("a");

        WebElement element = driver.findElement(By.xpath("(//small[@data-bv-validator='stringLength'])[1]"));
        Assert.assertTrue(element.isDisplayed(), "first name must be more than 2 and less than 64 " +
                "characters long IS DISPLAY");

    }
    @Test
    public void test4(){
        driver.get("https://practice-cybertekschool.herokuapp.com");
        WebElement registration_form = driver.findElement(By.linkText("Registration Form"));
        registration_form.click();

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("k");
        WebElement element = driver.findElement(By.xpath("(//small[@data-bv-validator='stringLength'])[2]"));
        Assert.assertTrue(element.isDisplayed(), "first name must be more than 2 and less than 64 " +
                "characters long IS DISPLAY");


    }
    @Test
    public void test5() throws InterruptedException {
        //click registration form
        driver.get("https://practice-cybertekschool.herokuapp.com");


        Thread.sleep(1000);
        WebElement registration_form = driver.findElement(By.linkText("Registration Form"));
        registration_form.click();


        //click valid first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Bilgin");

        //click valid last name
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Kalmis");

        //click valid username
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("username");

        //Enter any valid e mail
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("silversamina@gmail.com");

        //Enter any valid password.
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("12345678");

        //Enter any valid phone number.
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("571-000-0000");

        //Select gender
        WebElement gender = driver.findElement(By.xpath("//input[@name='gender']"));
        gender.click();

        //Enter any valid date of birth
        WebElement dateOfBirth = driver.findElement(By.xpath("//input[@name='birthday']"));
        dateOfBirth.sendKeys("11/20/1978");

        //Select any department
    //1. locate your dropdown just like any other webelement with unique locator
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='department']"));

        //2. create Select object by passing that element as a constructor
        Select stateDropdown = new Select(dropdownElement);

        //Select using visible text

        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Department of Engineering");

        String expectedOption = "Department of Engineering";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");

        //Enter any job title
        WebElement jobTitle = driver.findElement(By.xpath("//select[@name='job_title']"));
        stateDropdown = new Select(jobTitle);
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Designer");

        expectedOption = "Designer";
        actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");

        //Select java as a programming language.
        WebElement clickJava = driver.findElement(By.xpath("//label[@for='inlineCheckbox2']"));
        clickJava.click();
        Thread.sleep(1000);

        //Click Sign up.
        WebElement wooden_spoon = driver.findElement(By.id("wooden_spoon"));
        wooden_spoon.click();
        Thread.sleep(1000);

        //Verify that following success message is displayed


        String expectedMessage = "You've successfully completed registration!";
        WebElement message = driver.findElement(By.xpath("//div[@role='alert']/p"));
        String actualMessage = message.getText();
        Assert.assertTrue(message.isDisplayed(), "You've successfully completed registration!");



    }
    @Test
    public void test6(){
        //1. Go to "https://www.tempmailaddress.com/"
        driver.get("https://www.tempmailaddress.com/");

        //2. Copy and save email as a string.
        WebElement copyElement = driver.findElement(By.xpath("//a[@data-clipboard-action='copy'][2]"));
        copyElement.click();

//        wait.until(ExpectedConditions.elementToBeClickable(copyElement));
//         System.out.println("copyElement.getText() = " + copyElement.getText());


        //3.Then go to “https://practice-cybertekschool.herokuapp.com”
//        driver.get("https://practice-cybertekschool.herokuapp.com");
//        copyElement.click();

    }

}


