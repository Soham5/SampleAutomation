package PageFunctions;

import Pages.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePageFunctions {

    public static void enterText(WebDriver driver,String text){
        HomePage.getInputBox(driver).sendKeys(text);
        HomePage.getInputBox(driver).sendKeys(Keys.ENTER);
    }

    public static String getResultText(WebDriver driver){
        return HomePage.getResult(driver).getText();
    }

}
