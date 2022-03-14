package EXPRESS_POM_AI7;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E5_View_BagPage extends Reusable_Annotations {
    //Constructor is a helper method that allows you to identify objects in your POM so you can call on them in test class
    //Becuase you POM class is not static, also declare a local logger to your POM class
    ExtentTest logger;

    public E5_View_BagPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Reusable_Annotations.logger;
    }//end of constructor method

    //define all the elements for this page  per use case
    //set up all the web element xpath locators you need for this page
    @FindBy(xpath = "//*[@id='contact-information-firstname']")
    WebElement firstName;
    @FindBy(xpath = "//*[@name='lastname']")
    WebElement lastName;
    @FindBy(xpath = "//*[@name='email']")
    WebElement email;
    @FindBy(xpath = "//*[@name='confirmEmail']")
    WebElement reEnterEmail;
    @FindBy(xpath = "//*[@name='phone']")
    WebElement phoneNumber;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement clickOnContinue;
    @FindBy(xpath = "//*[@name='shipping.line1']")
    WebElement address;
    @FindBy(xpath = "//*[@name='shipping.postalCode']")
    WebElement zipCode;
    @FindBy(xpath = "//*[@name='shipping.city']")
    WebElement City;
    @FindBy(xpath = "//*[@name='shipping.state']")
    WebElement State;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement clickContinue;
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement shipToHome;
    @FindBy(xpath = "//*[@id='creditCardNumberInput']")
    WebElement CreditCardInfo;
    @FindBy(xpath = "//*[@name='expMonth']")
    WebElement expirationMonth;
    @FindBy(xpath = "//*[@name='expYear']")
    WebElement ExpYear;
    @FindBy(xpath = "//*[@name='cvv']")
    WebElement cVV;
    @FindBy(xpath = "//*[text()='Place Order']")
    WebElement placeOrder;
    @FindBy(xpath = "//*[@class='_18MKSBxx labelError']")
    WebElement captureErrorMessage;

    //enter first name
    public void FirstName(String fname) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, firstName, fname, logger, "first name");
    }

    // enter last name
    public void LastName(String lname) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, lastName, lname, logger, "enter last name");
    }

    //enter email
    public void enteremail(String Eemail) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, email, Eemail, logger, "enter email address");
    }

    //re enter email
    public void setReEnterEmail(String Remail) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, reEnterEmail, Remail, logger, "re-enter email");
    }

    //enter phone number
    public void setPhoneNumber(String Pnumber) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, phoneNumber, Pnumber, logger, "enter phone number");
    }

    //click on continue
    public void setClickOnContinue() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, clickOnContinue, logger, "click on continue");
    }

    //enter address
    public void setAddress(String Address) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, address, Address, logger, "enter address");
    }

    //enter zip code
    public void setZipCode(String Zcode) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, zipCode, Zcode, logger, "enter zip code");
    }

    //enter city
    public void setCity(String Seety) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, City, Seety, logger, "enter city");
    }

    //enter state
    public void setState(String state) {
        Reusable_Actions_Loggers_POM.selectByvisibleTextwithLogger(driver, State, state, logger, "Enter state");
    }

    //click on continue
    public void setClickContinue() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, clickContinue, logger, "click on continue");
    }

    //clcik on ship to home
    public void setShipToHome() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, shipToHome, logger, "click on ship to home");
    }

    //enter on credit card number
    public void setCreditCardInfo(String CcNumber) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, CreditCardInfo, CcNumber, logger, "enter credit card info");
    }

    //select expiration month
    public void setExpirationMonth(String expMonth) {
        Reusable_Actions_Loggers_POM.selectByvisibleTextwithLogger(driver, expirationMonth, expMonth, logger, "Enter exp month");
    }

    //select expiration year
    public void setExpYear(String expYear) {
        Reusable_Actions_Loggers_POM.selectByvisibleTextwithLogger(driver, ExpYear, expYear, logger, "Exp year");
    }

    //enter cvv
    public void setcVV(String CVV) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, cVV, CVV, logger, "cvv");
    }

    //click on place order
    public void setPlaceOrder() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, placeOrder, logger, "Place order");

    }

    //Capture the error message for card # and send it back to error message column in excel
    public String setCaptureErrorMessage() {
        String result = Reusable_Actions_Loggers_POM.getTextMethodwithLogger(driver, captureErrorMessage, logger, "capture error message");
        System.out.println("The error message is " + result);
        return result;
    }


}

