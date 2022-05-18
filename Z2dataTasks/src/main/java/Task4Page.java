import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task4Page {

    @FindBy(id = "file-upload")
        public WebElement ChooseFileBtn;
    @FindBy(id = "file-submit")
        public WebElement UploadFileBtn;
    @FindBy(xpath = "//*[@id='content']/div/h3")
        public WebElement SuccessMessage;

    public Task4Page(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
