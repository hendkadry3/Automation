import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;
import java.util.HashMap;

public class BaseTest {


    public static WebDriver driver;

    @BeforeSuite
    public void initializeDriver()
    {
        HashMap<String, Object> chromePref = new HashMap<String, Object>();
        chromePref.put("profile.default_content_settings.popups", 0);
        chromePref.put("download.default_directory", "C:\\Users\\Hend\\Z2dataTasks\\src\\main\\resources");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", chromePref);
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


}
