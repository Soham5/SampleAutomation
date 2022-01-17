package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    private static By inputBox=By.name("q");
    private static By result=By.xpath("//h3[contains(text(),'Selenium')]");

    public static WebElement getInputBox(WebDriver driver){
        return driver.findElement(inputBox);
    }

    public static WebElement getResult(WebDriver driver){
        List<WebElement> elements=driver.findElements(result);
        return elements.get(0);
    }
}
