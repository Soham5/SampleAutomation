package Tests;

import UserDefinedBinaries.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {

    static WebDriver driver;

    @BeforeTest
    public void setup() {
        driver= DriverSetup.driverInstantiate("chrome");

    }

    @Test
    public void googleSearch() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }


    public void tearDown(){}
}
