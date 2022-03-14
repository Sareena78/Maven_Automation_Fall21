package EXPRESS_POM_AI7;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E4_CheckoutAsGuest extends Reusable_Annotations{
    //Constructor is a helper method that allows you to identify objects in your POM so you can call on them in test class
    //Becuase you POM class is not static, also declare a local logger to your POM class
    ExtentTest logger;

    public E4_CheckoutAsGuest(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger= Reusable_Annotations.logger;
    }//end of constructor method
    //define all the elements for this page  per use case
    //set up all the web element xpath locators you need for this page
    @FindBy (xpath = "//*[@id='qdd-0-quantity']")
    WebElement quantity;
    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement checkout;
    @FindBy (xpath = "//*[text()='Checkout as Guest']")
    WebElement CheckoutasGuest;


    public void quantity(String quantity1){
        Reusable_Actions_Loggers_POM.selectByvisibleTextwithLogger(driver,quantity,quantity1,logger,"select quatitiy");
    }
    public void checkOut(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,checkout,logger,"Click on Checkout");
    }

    public void CheckAsGuest(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,CheckoutasGuest,logger,"Check out as guest");
    }


}
