import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class Task1 extends BaseTest{

    Task1Page task1Page;

    @BeforeClass
    public void inital(){
        task1Page=new Task1Page(driver);
    }

    @BeforeMethod
    public void navigateToGooglePage() {
            driver.get("https://www.google.com/");
    }
    @Test
    public void Search(){
        task1Page.GoogleSearch.sendKeys("Selenium Tutorial");
        task1Page.GoogleSearch.sendKeys(Keys.ENTER);
        String Link =task1Page.SecondLink.getAttribute("href");
        Assert.assertTrue(Link.contains("https://www.javatpoint.com/selenium-tutorial"));
        driver.quit();
    }
    @Test
    public void SecondSearch(){
        task1Page.GoogleSearch.sendKeys("Selenium Tutorial");
        task1Page.GoogleSearch.sendKeys(Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", task1Page.ThirdLink);
        String Link =task1Page.ThirdLink.getAttribute("href");
        Assert.assertTrue(Link.contains("https://www.tutorialspoint.com/selenium/index.htm"));
    }
}
