import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task5Page {
    @FindBy(xpath = "//*[@href='/Links/go2.php?urlid=file-GanttChart365']")
    public WebElement ExcelBtn;
    @FindBy(xpath = "//*[@href='https://www.vertex42.com/Files/exclusive/gantt-chart_L.xlsx']")
    public WebElement DownloadBtn;
    @FindBy(xpath = "//*[@id='dismiss-button']//*[@fill='#5F6368']")
    public WebElement AdDismissBtn;
   @FindBy(id = "ad_position_box")
    public WebElement AdBtn;
   @FindBy(id = "dismiss-button")
    public WebElement AdBtn1;

    public Task5Page(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
