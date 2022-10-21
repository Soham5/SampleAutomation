package UserDefinedBinaries;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverSetup {

    private static RemoteWebDriver driver;
    private static String exePath;
    private static Properties prop=PropertiesFile.getPropertiesInstance();
    private static String url=prop.getProperty("websiteURL");
    private static Boolean useRemoteDriver= Boolean.valueOf(prop.getProperty("useRemoteDriver"));
    private static String browserType;

    public static WebDriver driverInstantiate(String browser) throws MalformedURLException {
        browserType=browser.toLowerCase(Locale.ROOT);
        DesiredCapabilities capabilities=new DesiredCapabilities();

        if(useRemoteDriver) {
            switch (browserType) {
                case "chrome":
                    exePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe";
                    System.setProperty("webdriver.chrome.driver", exePath);
                    driver = new ChromeDriver();
                    break;
            }
        }
        else {
            switch (browserType) {
                case "chrome":
                    exePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe";
                    System.setProperty("webdriver.chrome.driver", exePath);
                    driver= new ChromeDriver();
                    break;
            }
        }

        switch (browserType) {
            case "chrome":
                exePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", exePath);
                driver= new ChromeDriver();
                break;

            case "chrome1":
                capabilities.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
                URL url=new URL("http://localhost:4444/wd/hub");
                driver=new RemoteWebDriver(url,capabilities);
                break;

            case "android":
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
                capabilities.setCapability(MobileCapabilityType.VERSION,"");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"");
                capabilities.setCapability(MobileCapabilityType.UDID,"");
                capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
                capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        return driver;
    }
}
