package com.cybertek.tests.HW;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Optional;

public class HW_day_16 extends TestBase {


    @Test
    public void test1() {

        //1. Go to “https://qa1.vytrack.com/"
        //2. Login as a store manager
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();

       // 3. Navigate to “Activities -> Calendar Events”
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");

        //4. Verify that page subtitle "Options" is displayed
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        Assert.assertTrue(calendarEventsPage.optionsLink.isDisplayed());

    }
    @Test
    public void test2(){
        //1. Go to “https://qa1.vytrack.com/"
        //2. Login as a store manager
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();

        // 3. Navigate to “Activities -> Calendar Events”
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities","Calendar Events");

        // 4. Verify that page number is equals to "1"
        CalendarEventsPage pageNumber = new CalendarEventsPage();


        Assert.assertEquals(pageNumber.pageNumber.getAttribute("value"),"1","verify page number");



    }

}
