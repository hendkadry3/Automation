import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task3 extends BaseTest{
    Task3Page task3Page;

    @BeforeClass
    public void inital(){

        task3Page=new Task3Page(driver);
    }

    @BeforeMethod
    public void navigateToPage() {
        driver.get("https://www.w3schools.com/html/html_tables.asp");
    }
    @Test
    public void  Task3(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", task3Page.CompanyErnst);
       String CompanyText=task3Page.CompanyErnst.getText();
       String CompanyCountryText=task3Page.CompanyCountry.getText();
        Assert.assertEquals(CompanyText.equals("Ernst Handel"),CompanyCountryText.equals("Austria"));
     driver.quit();
    }

}
