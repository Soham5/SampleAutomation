package Tests;

import PageFunctions.HomePageFunctions;
import UserDefinedBinaries.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SampleTest {

    static WebDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        driver= DriverSetup.driverInstantiate("chrome1");
    }

    @Test
    public void googleSearch() {
        HomePageFunctions.enterText(driver,"Selenium");
        Assert.assertEquals(HomePageFunctions.getResultText(driver),"Selenium","Results didn't match");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
