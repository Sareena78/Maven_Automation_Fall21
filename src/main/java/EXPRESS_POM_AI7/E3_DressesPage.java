package EXPRESS_POM_AI7;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E3_DressesPage extends Reusable_Annotations {

    //Constructor is a helper method that allows you to identify objects in your POM so you can call on them in test class
    //Because your POM class is not static, also declare a local logger to your POM class

    ExtentTest logger;

    public E3_DressesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }//End of constructor method
    //define all the elements for this page per use case
    //Set up all the WebElement xpath locaters you need for this page

    @FindBy(xpath = "//*[@class='_1vuRDTYH _3jxErwTw']")
    WebElement SecondDress;
    @FindBy(xpath = "//*[text()=' + size + ']")
    WebElement selectSize;
    @FindBy(xpath = "//*[text()='Add to Bag']")
    WebElement addToBag;
    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement viewBagPopUp;

    //Click on 2nd dress
    public void secondDress() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, SecondDress, logger, "select dress");
    }

    public void selectSize(String size) {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Clicking on element " + size);
        logger.log(LogStatus.INFO, "Clicking on element " + size);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + size + "']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on " + size + " Error:" + e);
            logger.log(LogStatus.FAIL, "Unable to click on " + size + " Error:" + e);
            Reusable_Actions_Loggers_POM.getScreenShotWithLogger(driver, size, logger);
        }
    }

    public void addTobag() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, addToBag, logger, "add to bag");
    }

    public void viewBag() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, viewBagPopUp, logger, "View bag");
    }


}
