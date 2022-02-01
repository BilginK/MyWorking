package com.cybertek.tests.HW;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;

public class HWTest extends TestBaseForHW {

    @Test
    public void verifyOptionsTest(){
        extentLogger = report.createTest("Verify Options Link");
        extentLogger.info("Preconditions Loaded");
        extentLogger.info("Verify that Options Link is Displayed");
        Assert.assertTrue(page.optionsLink.isDisplayed(),"Link is NOT Displayed");
        extentLogger.pass("Options is Displayed");
    }
    @Test
    public void verifyPageNumber(){
        extentLogger = report.createTest("Verify Page Number");
        int pageNumber = Integer.parseInt(page.pageNumber.getAttribute("value"));
        extentLogger.info("verify page number");
        Assert.assertEquals(pageNumber,1,"Page Number is NOT equal to 1");
        extentLogger.pass("page number verified");
    }

    @Ignore
    @Test
    public void verifyViewPageTest(){

        extentLogger = report.createTest("Verify View Per Page Test");
        wait.until(ExpectedConditions.visibilityOf(page.viewPerPage));
        System.out.println("page.viewPerPage.getText() = " + page.viewPerPage.getText());
        int viewPerPage = Integer.parseInt(page.viewPerPage.getText().trim());
        extentLogger.info("Verify View Per Page is 25");
        Assert.assertEquals(viewPerPage,25,"View Per Page is NOT equal to 25 ");
        extentLogger.pass("Test PASSED");
    }

    @Test
    public void verifyRowsNumber() throws InterruptedException {
        extentLogger = report.createTest("Verify Number of Records");
        Thread.sleep(1000);
        page.viewPerPage.click();
        BrowserUtils.waitForClickablility(page.page100,5);
        page.page100.click();
        Thread.sleep(2000);

        List<WebElement> allRowsWithoutHeader = Driver.get().findElements(By.xpath("//tbody/tr"));
        System.out.println("allRowsWithoutHeader.size() = " + allRowsWithoutHeader.size());

        extentLogger.info("Verify Number Of Records is equals to number of records");
        Assert.assertEquals(allRowsWithoutHeader.size(),45,"Verify Number Of Recods is NOT equals to 45");
        extentLogger.pass("Test PASSED");
    }

    @Test
    public void test5() throws InterruptedException {
        extentLogger = report.createTest("Verify that all calender events were selected");
        Thread.sleep(2000);
        page.viewPerPage.click();
        BrowserUtils.waitForClickablility(page.page100,5);
        page.page100.click();
        Thread.sleep(1000);
        page.title.click();
        Thread.sleep(1000);

        extentLogger.info("Verify that all calender events were selected");
        for (int i = 1; i <= 45; i++) {
          String checkBox = "(//tbody/tr/td/input[@type='checkbox'])["+i+"]";
          Driver.get().findElement(By.xpath(checkBox));
          Thread.sleep(2000);


          Assert.assertTrue(driver.findElement(By.xpath(checkBox)).isSelected());

        }
        extentLogger.pass("Test PASSED");
    }

    @Test
    public void test6() throws InterruptedException {
        extentLogger = report.createTest("Verify that following data is displayed");
        page.testerMeeting.click();
        BrowserUtils.waitFor(2);


        List<WebElement> labels = Driver.get().findElements(By.xpath("//div[@class='control-label']"));
        System.out.println("labels.size() = " + labels.size());
        System.out.println(labels.get(0).getText());

        //Step 5
        extentLogger.info("Verify that desired data is displayed");
        Assert.assertEquals(labels.get(0).getText(),"Testers meeting");
        Assert.assertEquals(labels.get(1).getText(),"Nov 27, 2019, 9:30 AM");
        Assert.assertEquals(labels.get(2).getText(),"Nov 27, 2019, 10:30 AM");
        Assert.assertEquals(labels.get(3).getText(),"No");
        Assert.assertEquals(labels.get(5).getText(),"No");

        extentLogger.pass("Test Case6 is Passed");
    }

}
