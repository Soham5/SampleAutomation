package Tests;

import PageFunctions.HomePageFunctions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileTest extends BaseTest{

    //@Test
    public void googleSearch() {
        HomePageFunctions.enterText(driver,"Selenium");
        Assert.assertEquals(HomePageFunctions.getResultText(driver),"Selenium","Results didn't match");
    }

}
