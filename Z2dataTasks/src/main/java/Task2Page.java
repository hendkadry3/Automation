import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class Task2Page {

    @FindBy(xpath = "//*[@id='checkboxes']/input[1]")
    public WebElement FirstCheckbox;
    @FindBy(xpath = "//*[@id='checkboxes']/input[2]")
    public WebElement SecondCheckbox;

    public Task2Page(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
}
