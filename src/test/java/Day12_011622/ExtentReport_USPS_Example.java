package Day12_011622;

import Day9_010822.Reusable_Actions;
import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtentReport_USPS_Example {
    WebDriver driver;
    //your extentreport and extenttest command should be declared outside so it can be reusable among all annotations
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
        //set the path of the report once
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html",true);
    }//end of precondition

    @Test()
    public void uspsTest(){
        logger = reports.startTest("Track a package on USPS");//has to be there for all test cases
        //navigate to usps
        logger.log(LogStatus.INFO,"Navigate to USPS home page");
        driver.navigate().to("https://www.usps.com");
        //hover to the quick tool tab
        Reusable_Actions_Loggers.mouseHoverwithLogger(driver,"//*[text()='Quick Tools']",logger,"Quck tools");
        //click on track a package
        Reusable_Actions_Loggers.clickMethodwithLogger(driver,"//*[text()='Track a Package']",logger,"Track a Packgage");
        //enter your tracking number
        Reusable_Actions_Loggers.sendKeysMethodWithLogger(driver,"//*[@id='tracking-input']","1111111111",logger,"Track Field");
        //click on track button
        Reusable_Actions_Loggers.clickMethodwithLogger(driver,"//*[@class='button tracking-btn']",logger,"Track Button");

        //end the logger
        reports.endTest(logger);//has to be at the end of each test case
    }//end of test

    @AfterSuite
    public void endTest(){
        driver.quit();
        //write/log the informations back to the html report
        reports.flush();
    }//end of after suite

}//end of class
