import net.bytebuddy.asm.Advice;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class Task5 extends BaseTest {
    Task5Page task5Page;

    @BeforeClass
    public void inital() {

        task5Page = new Task5Page(driver);
    }

    @BeforeMethod
    public void navigateToPage() {
        driver.get("https://www.vertex42.com/ExcelTemplates/excel-gantt-chart.html");
    }

    @Test
    public void File() throws InterruptedException, IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", task5Page.ExcelBtn);
        try {

            task5Page.ExcelBtn.click();
        } catch (WebDriverException e) {
            driver.navigate().to("https://www.vertex42.com/Files/download2/themed.php?file=gantt-chart_L.xlsx");
            //js.executeScript("document.querySelector(\"html > ins\").style.display='none'");
            JavascriptExecutor js1 = (JavascriptExecutor) driver;
            js1.executeScript("arguments[0].click();", task5Page.DownloadBtn);
        }
        try {

            task5Page.DownloadBtn.click();
        } catch (WebDriverException e) {

            File sourceFile = new File("C:\\Users\\Hend\\Z2dataTasks\\src\\main\\resources\\gantt-chart_L.xlsx");
            FileInputStream fis = new FileInputStream(sourceFile);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
          //  int TotalNumberOfRows = (sheet.getLastRowNum() + 1 - 9);
            int sum=0;
            for(int i=9;i<=sheet.getLastRowNum();i++)
            {
                 sum= sum+1;
            }
            Assert.assertEquals(sum,"35");
            driver.quit();
        }
    }
}