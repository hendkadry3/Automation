import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1Page {

    @FindBy(xpath = "//*[@name='q']")
    public WebElement GoogleSearch;
    @FindBy(xpath = "//*[@href='https://www.javatpoint.com/selenium-tutorial']")
    public WebElement SecondLink;
    @FindBy(xpath = "//*[@href='https://www.tutorialspoint.com/selenium/index.htm']")
    public WebElement ThirdLink;

    public Task1Page(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
}
