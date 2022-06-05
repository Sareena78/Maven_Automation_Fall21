package Reusable_Library;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.util.UUID;
//Set all global variables here with public static so you can call into other classes
public class Reusable_Annotations {
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;

//Set before Suite for report path and set driver
    @BeforeSuite
    public void SetChromeDriverAndReport(){
        driver = Reusable_Actions_Loggers.setDriver();
        //define the path to report
        reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report"+ Reusable_Actions_Loggers.getDateTime()+".html",true);
    }//end of before suite

//set before metho to capture name for each test so it can be added to html report later
    @BeforeMethod
    public void captureTestName(Method methodName){
        logger = reports.startTest(methodName.getName());
    }//end of before method

    @AfterMethod
    public void endTest(){
        reports.endTest(logger);
    }//end of after method
//after suite to flush the reports and quit the driver.
    @AfterSuite
    public void endOfTestSuite(){
        //driver.quit();
        reports.flush();
    }//end of after suite
}
