import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Task2 extends BaseTest{
    Task2Page task2Page;

    @BeforeClass
    public void inital(){

        task2Page=new Task2Page(driver);
    }

    @BeforeMethod
    public void navigateToCheckboxPage() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
    }

    @Test
    public void Checkbox(){
        task2Page.FirstCheckbox.click();
        ArrayList<WebElement> checkboxList= new ArrayList<WebElement>();
        checkboxList.add(task2Page.FirstCheckbox);
        checkboxList.add(task2Page.SecondCheckbox);
        for(WebElement e:checkboxList)
        {

            Assert.assertTrue(e.isSelected());
        }
        driver.quit();
}
}
