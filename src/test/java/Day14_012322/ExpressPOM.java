package Day14_012322;


import EXPRESS_POM_AI7.E1_BaseClass;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class ExpressPOM extends Reusable_Annotations {

    @Test
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
            Thread.sleep(15);
            driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']"));

            E1_BaseClass.homepage().womensTab();
            E1_BaseClass.homepage().dressTab();
            Reusable_Actions_Loggers.scrollMethodwithLogger(driver, "0", "500");
            E1_BaseClass.dressesPage().secondDress();
            E1_BaseClass.dressesPage().selectSize(size);
            E1_BaseClass.dressesPage().addTobag();
            E1_BaseClass.dressesPage().viewBag();
            E1_BaseClass.checkoutAsGuest().quantity(Quantity);
            E1_BaseClass.checkoutAsGuest().checkOut();
            E1_BaseClass.checkoutAsGuest().CheckAsGuest();
            E1_BaseClass.viewBagPage().FirstName(firstName);
            E1_BaseClass.viewBagPage().LastName(lastName);
            E1_BaseClass.viewBagPage().enteremail(email);
            E1_BaseClass.viewBagPage().setReEnterEmail(email);
            E1_BaseClass.viewBagPage().setPhoneNumber(phoneNumber);
            E1_BaseClass.viewBagPage().setClickOnContinue();
            E1_BaseClass.viewBagPage().setAddress(address);
            E1_BaseClass.viewBagPage().setZipCode(zipcode);
            E1_BaseClass.viewBagPage().setCity(city);
            E1_BaseClass.viewBagPage().setState(state);
            E1_BaseClass.viewBagPage().setClickContinue();
            E1_BaseClass.viewBagPage().setShipToHome();
            E1_BaseClass.viewBagPage().setCreditCardInfo(cardNumber);
            E1_BaseClass.viewBagPage().setExpirationMonth(expMonth);
            E1_BaseClass.viewBagPage().setExpYear(expYear);
            E1_BaseClass.viewBagPage().setcVV(cvc);
            E1_BaseClass.viewBagPage().setPlaceOrder();
            String result = E1_BaseClass.viewBagPage().setCaptureErrorMessage();

            //storing the values to the writable sheet
            Label label = new Label(14, i, result);

            // need to write back to the writable sheet
            writableSheet.addCell(label);

            //delete cookies
            driver.manage().deleteAllCookies();
        }
        //writing back to the writable file to see
        writeableFile.write();
        writeableFile.close();
    }//end of @test
}//end of class