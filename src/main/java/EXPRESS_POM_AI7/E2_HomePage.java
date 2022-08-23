package EXPRESS_POM_AI7;


import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class E2_HomePage extends Reusable_Annotations {
    //Constructor is a helper method that allows you to identify objects in your POM so you can call on them in test class
    //Becuase you POM class is not static, also declare a local logger to your POM class

    ExtentTest logger;

    public E2_HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }//end of constructor method

    //define all the elements for this page  per use case
    //set up all the web element xpath locators you need for this page
    @FindBy(xpath = "//*[@id='closeModal']")
    WebElement closePopUp;

    @FindBy(xpath = "//*[@name='bluecoreCloseButton']")
    WebElement close2ndPopup;

    @FindBy(xpath = "//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']")
    WebElement womensTab;

    @FindBy(xpath = "//*[text()='Dresses']")
    WebElement clickOnDresses;

    //Close popup
    public void pupUp() {
        Reusable_Actions_Loggers_POM.PopUpClickMethod(driver, closePopUp, logger, "Close pup up");
    }

    //Close popup
    public void secondPupUp() {
        Reusable_Actions_Loggers_POM.PopUpClickMethod(driver, close2ndPopup, logger, "Close pup up");
    }
    //close pupup
    //driver.switchto.alert.accept.dismiss;

    //Hover over women tabs using actions
    public void womensTab() {
        Reusable_Actions_Loggers_POM.mouseHover(driver, womensTab, logger, "WOmen Tab");
    }

    //Click on Dresses
    public void dressTab() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, clickOnDresses, logger, "Dress Tab");
    }
}
