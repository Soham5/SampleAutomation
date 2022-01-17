package UserDefinedBinaries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverSetup {

    private static WebDriver driver;
    private static String exePath;
    private static Properties prop=PropertiesFile.getPropertiesInstance();
    private static String url=prop.getProperty("websiteURL");
    private static String browserType;

    public static WebDriver driverInstantiate(String browser) {
        browserType=browser.toLowerCase(Locale.ROOT);

        switch (browserType) {
            case "chrome":
                exePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", exePath);
                driver= new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        return driver;
    }
}
