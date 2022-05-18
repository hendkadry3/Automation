import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task3Page {

    @FindBy(xpath = "//*[@id='customers']/tbody/tr[4]/td[1]")
    public WebElement CompanyErnst;
    @FindBy(xpath = "//*[@id='customers']/tbody/tr[4]/td[3]")
    public WebElement CompanyCountry;


    public Task3Page(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
