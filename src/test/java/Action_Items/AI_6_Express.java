package Action_Items;

import Day9_010822.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class AI_6_Express {
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;
//test
    @BeforeSuite
    public void SetTheDriver() {
        //Set driver
        driver = Reusable_Actions.setDriver();
        //set the path to Extent reports
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html", true);
    }//End of pre condition

    @Test()
    public void ExpressTest() throws InterruptedException, BiffException, IOException, WriteException {
        //Read the date from excel sheet created
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/ActionItem 6 Express.xls"));
        //Locate the worksheet that you created for the workbook
        Sheet readableSheet = readableFile.getSheet(0);
        //Count rows present on sheet
        var rowCount = readableSheet.getRows();
        System.out.println(" My row count is " + rowCount);
        //Create a writeable file to mimic readable so that you can capture your results in it.
        WritableWorkbook writeableFile = Workbook.createWorkbook(new File("src/main/resources/ActionItem 6 Express_Results.xls"), readableFile);
        WritableSheet writableSheet = writeableFile.getSheet(0);
        //get count of rows from writable sheet
        var rowcount2 = writableSheet.getRows();
        System.out.println(" My row count is " + rowcount2);

        logger = reports.startTest("Purchase a dress from Express website"); //has to be there for all tests

        //generate the for/while loop, Column is hard coded, Rows are dynamic
        for (int i = 1; i < rowcount2; i++) {
            // put down all the variables
            var size = writableSheet.getCell(0, i).getContents();
            var Quantity = writableSheet.getCell(1, i).getContents();
            var firstName = writableSheet.getCell(2, i).getContents();
            var lastName = writableSheet.getCell(3, i).getContents();
            var email = writableSheet.getCell(4, i).getContents();
            var phoneNumber = writableSheet.getCell(5, i).getContents();
            var address = writableSheet.getCell(6, i).getContents();
            var zipcode = writableSheet.getCell(7, i).getContents();
            var city = writableSheet.getCell(8, i).getContents();
            var state = writableSheet.getCell(9, i).getContents();
            var cardNumber = writableSheet.getCell(10, i).getContents();
            var expMonth = writableSheet.getCell(11, i).getContents();
            var expYear = writableSheet.getCell(12, i).getContents();
            var cvc = writableSheet.getCell(13, i).getContents();
            //navigate to express website
            logger.log(LogStatus.INFO, "Navigate to Express");
            driver.navigate().to("https://www.express.com/");
            //verify page title
            driver.getTitle();
            if
            (driver.getTitle().contains("Express - Men's & Women's Clothing")) {
                System.out.println(" Page title matches");
            } else {
                System.out.println("Title does not match");
                logger.log(LogStatus.FAIL, "Title does not match");
            }//end of if else statement
            //Exit the popup
            //Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[@id='onetrust-accept-btn-handler']", logger, "close pop-up");
            // Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[@class='close_button-20856-button close_button-20856-button-d2 bluecoreCloseButton']", logger, "close popup");

            //Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[@id='onetrust-close-btn-container']", logger, "pop up");
            // On pop up to the right side, click on view bag then wait few seconds

            //Hover over women tabs using actions  //Use contains href property
            Reusable_Actions_Loggers.mouseHoverwithLogger(driver, "//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']", logger, "Women's tab");

            //Click on dresses link // Use contains href or text property
            Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[text()='Dresses']", logger, "Dresses link ");

            //Wait few seconds using sleep and scroll about 400 to 500
            //Thread.sleep(15);
            Reusable_Actions_Loggers.scrollMethodwithLogger(driver, "0", "500");

            Reusable_Actions_Loggers.PopUpClickMethod(driver, "//*[@name='bluecoreCloseButton']", logger, "popup");
            //Click on 2nd image, using @class property with index 1, use clickByIndex from reusable
            Reusable_Actions_Loggers.cilckByIndexmethodWithLogger(driver, "//*[@class='_1vuRDTYH _3jxErwTw']", 1, logger, " Select dress by index");

            // Click on specific size using excel data, pass value as locater using text or value
            Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[text()='" + size + "']", logger, "size");

            //Click on add to bag button
            Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[text()='Add to Bag']", logger, "Add to bag");

            // On pop up to the right side, click on view bag then wait few seconds
            Reusable_Actions_Loggers.PopUpClickMethod(driver, "//*[text()='View Bag']", logger, "popup");

            //Select a quantity
            Reusable_Actions_Loggers.dropDownByTextwithLogger(driver, "//*[@id='qdd-0-quantity']", Quantity, logger, "quantity");

            //Click on Check out button then wait a few seconds
            Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[text()='Checkout']", logger, "check out");

            //click checkout as a guest, then wait a few seconds
            Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[text()='Checkout as Guest']", logger, "Checkout");

            //Enter first name
            Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver, "//*[@id='contact-information-firstname']", firstName, logger, "First Name");

            //Enter last name
            Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver, "//*[@name='lastname']", lastName, logger, "Last Name");

            //Enter Email
            Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver, "//*[@name='email']", email, logger, "Email");

            //Re-enter Email
            Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver, "//*[@name='confirmEmail']", email, logger, "Re-enter email");

            //Enter phone #
            Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver, "//*[@name='phone']", phoneNumber, logger, "phone no");

            //Click on continue
            Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[text()='Continue']", logger, "Continue");

            //Enter Address
            Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver, "//*[@name='shipping.line1']", address, logger, "Address");

            //Enter ZipCode
            Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver, "//*[@name='shipping.postalCode']", zipcode, logger, "ZipCode");

            //Enter City
            Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver, "//*[@name='shipping.city']", city, logger, "city");

            //Select State
            Reusable_Actions_Loggers.dropDownByTextwithLogger(driver, "//*[@name='shipping.state']", state, logger, "state");

            //Click on continue
            Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[text()='Continue']", logger, "continue");

            //Click continue after selecting ship to home
            Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[text()='Continue']", logger, "continue again");

            //Click and Enter card no
            Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver, "//*[@id='creditCardNumberInput']", cardNumber, logger, "card no");

            //pop up if needed
            //Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='NO, THANK YOU']", logger, "pop up");

            //Enter exp month
            Reusable_Actions_Loggers.dropDownByTextwithLogger(driver, "//*[@name='expMonth']", expMonth, logger, "expMonth");

            //Enter exp year
            Reusable_Actions_Loggers.dropDownByTextwithLogger(driver, "//*[@name='expYear']", expYear, logger, "expYear");

            //Enter CVV
            Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver, "//*[@name='cvv']", cvc, logger, "CVV");

            //Click on place order
            Reusable_Actions_Loggers.clickMethodwithLogger(driver, "//*[text()='Place Order']", logger, "place order");

            //Capture the error message for card # and send it back to error message column in excel
            String result = Reusable_Actions_Loggers.getTextMethodwithLogger(driver, "//*[@class='_18MKSBxx labelError']", logger, "error");
            System.out.println("The error message is " + result);

            //storing the values to the writable sheet
            Label label = new Label(14, i, result);

            // need to write back to the writable sheet
            writableSheet.addCell(label);

            //delete cookies
            driver.manage().deleteAllCookies();
        }//end of loop

        //writing back to the writable file to see
        writeableFile.write();
        writeableFile.close();

        //end the logger
        reports.endTest(logger);
    }//end of test

    @AfterSuite
    public void endTest() {
        driver.quit();
        //write/log the information back to the html report
        reports.flush();
    }//end of after suite
}//end of class
