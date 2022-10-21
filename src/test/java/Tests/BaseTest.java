package Tests;

import UserDefinedBinaries.DriverSetup;
import UserDefinedBinaries.ExtentReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class BaseTest {

    static RemoteWebDriver driver;
    static ExtentReports report;
    static ExtentTest test;
    //static ScreenShot screenShot=ScreenShot.getInstance();

//    @BeforeSuite
//    public void startReport() { report=ExtentReport.getReport("Extent Report"); }
//
//    @BeforeTest
//    public void setup() {
//        driver= DriverSetup.driverInstantiate("chrome1");
//    }
//
//    @AfterMethod
//    public void tearDown(ITestResult result) throws IOException {
//        if(result.getStatus()==ITestResult.FAILURE) {
//            test.log(Status.FAIL,"Validation Failed \r\n"+result.getThrowable().getMessage());
//            // TODO: Add Screenshot
//            // test.addScreenCaptureFromPath()
//        }
//        else if(result.getStatus()==ITestResult.SUCCESS)
//            test.log(Status.PASS,"Validation Passed ");//+test.addScreenCaptureFromPath(screenShot.takeScreenshot(driver)));
//
//        driver.quit();
//    }
//
//    @AfterSuite
//    public void endTest() {
//        report.flush();
//    }
}
