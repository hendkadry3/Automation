import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task4 extends BaseTest{
    Task4Page task4Page;

    @BeforeClass
    public void inital(){

        task4Page=new Task4Page(driver);
    }

    @BeforeMethod
    public void navigateToPage() {
        driver.get("http://the-internet.herokuapp.com/upload");
    }
    @Test
    public void UploadFile(){

        task4Page.ChooseFileBtn.sendKeys("C:\\Users\\Hend\\Z2dataTasks\\src\\main\\resources\\Google_web_search.png");
        task4Page.UploadFileBtn.click();
        Assert.assertEquals(task4Page.SuccessMessage.getText(),"File Uploaded!");
        driver.quit();
    }
}
