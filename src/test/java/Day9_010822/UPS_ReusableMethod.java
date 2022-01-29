package Day9_010822;

import org.openqa.selenium.WebDriver;

public class UPS_ReusableMethod {
    public static void main(String[] args) {
        WebDriver driver = Reusable_Actions.setDriver();
        //navigate to UPS
        driver.navigate().to("https://www.ups.com/us");
        //click on Track
        Reusable_Actions.clickMethod(driver,"//*[text()='Tracking']", "Track");
        //click on track a page
        Reusable_Actions.clickMethod(driver,"//*[text()='Track a Package']","Track a package");
        //enter the value in search
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='stApp_trackingNumber']","111111111","Enter data");
        //Click on track again after entering the value
        Reusable_Actions.clickMethod(driver,"//*[@id='stApp_btnTrack']","click on track");
        //capture the error message and print out only 'We could not locate the shipment'
        String resultValue = Reusable_Actions.getTextMethod(driver,"//*[@id='stApp_error_alert_list0']","Error Message");
        //declare array and split
        String[] arrayResult = resultValue.split("details");
        System.out.println("My error says " + arrayResult[0]);


    }//end of main
}//end of class
