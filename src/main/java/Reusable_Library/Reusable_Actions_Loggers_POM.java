package Reusable_Library;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class  Reusable_Actions_Loggers_POM {
    //create a reusable method for WebDriver and chromeoptions
    public static WebDriver setDriver(){
        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //options.addArguments("fullscreen"); //for mac users
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);
        return  driver;
    }//end of webdriver method

    //method to hover on any web element
    public static void mouseHover(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Hovering on element " + elementName);
        logger.log(LogStatus.INFO,"Hovering on element " + elementName);
        try {
            Actions actions = new Actions(driver);
            WebElement element = wait.until(ExpectedConditions.visibilityOf((xpath)));
            actions.moveToElement(element).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover on " + elementName + " Error:" + e);
            logger.log(LogStatus.FAIL,"Unable to hover on " + elementName + " Error:" + e);
            getScreenShotWithLogger(driver,elementName,logger);
        }
    }//end of hover method


    //creating void click method for any web element
    public static void clickMethod(WebDriver driver, WebElement xpath, ExtentTest logger,String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Clicking on element " + elementName);
        logger.log(LogStatus.INFO,"Clicking on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOf((xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " Error:" + e);
            logger.log(LogStatus.FAIL,"Unable to click on " + elementName + " Error:" + e);
            getScreenShotWithLogger(driver,elementName,logger);
        }
    }//end of click method

    //creating void submit method for any web element
    public static void submitMethod(WebDriver driver, WebElement xpath, ExtentTest logger,String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Submitting on element " + elementName);
        logger.log(LogStatus.INFO,"Submitting on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOf((xpath))).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on " + elementName + " Error:" + e);
            logger.log(LogStatus.FAIL,"Unable to submit on " + elementName + " Error:" + e);
            getScreenShotWithLogger(driver,elementName,logger);
        }
    }//end of submit method


    //creating void sendkeys method for any web element
    public static void sendKeysMethod(WebDriver driver, WebElement xpath, String userData, ExtentTest logger,String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Typing on element " + elementName);
        logger.log(LogStatus.INFO,"Typing on element " + elementName);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf((xpath)));
            //clear first
            element.clear();
            //enter user data
            element.sendKeys(userData);
        } catch (Exception e) {
            System.out.println("Unable to type on " + elementName + " Error:" + e);
            logger.log(LogStatus.FAIL,"Unable to type on " + elementName + " Error:" + e);
            getScreenShotWithLogger(driver,elementName,logger);
        }
    }//end of click sendKeysMethod

    //creating return getText method for any text web element
    public static String getTextMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Capturing text on element " + elementName);
        //declare a global variable to capture the text so I can return it
        String result = null;
        logger.log(LogStatus.INFO,"Capturing text on element " + elementName);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf((xpath)));
            //capture text
            result = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to capture text on " + elementName + " Error:" + e);
            logger.log(LogStatus.FAIL,"Unable to capture text on " + elementName + " Error:" + e);
            getScreenShotWithLogger(driver,elementName,logger);
        }
        return result;
    }//end of click getTextMethod

    //creating return getText method for any text web element
    public static String getTextMethodwithLogger(WebDriver driver, WebElement xpath, ExtentTest Logger, String elementName) {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        System.out.println("Capturing text on element " + elementName);
        Logger.log(LogStatus.INFO, "Typing on element " + elementName);
        //declare a global variable to capture the text so I can return it
        String result = " "; //or write null instead of double quotes
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            //capture text
            result = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to capture text on " + elementName + " Error:" + e);
            Logger.log(LogStatus.FAIL, " unable to capture text on " + elementName + " Error is " +e);
        }
        return result;
    }//end of click getTextMethod

    //creating a clickmethod for any pop up web element
    public  static void PopUpClickMethod (WebDriver driver , WebElement xpath ,ExtentTest logger , String elementName) {
        //declcare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        System.out.println("Click on Pop Up element " + elementName);
        logger.log(LogStatus.INFO, "Clicking on Pop Up element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOf((xpath))).click();
        } catch (Exception e) {
            System.out.println("Pop up did not show up " + elementName + " " + e);
            logger.log(LogStatus.PASS, " Pop up did not show up moving to the next step " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of try catch
    }//end of popup click method

    public static void selectByvisibleTextwithLogger(WebDriver driver, WebElement xpath, String userValue, ExtentTest logger, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = null;
        logger.log(LogStatus.INFO,"Selection element " + elementName);
        try{
            System.out.println("Selecting value " + userValue + " from element " + elementName);
            element = wait.until(ExpectedConditions.visibilityOf(xpath));
            Select dDown = new Select(element);
            dDown.selectByVisibleText(userValue);
        } catch (Exception err) {
            System.out.println("Unable to select value from element " + elementName + "Error" + err);
            logger.log(LogStatus.FAIL,"Unable to select " + elementName + "error" + err);
            getScreenShotWithLogger(driver,elementName,logger);
        }
    }//end of Select by text method
    //method to capture screenshot when logger fails
    public static void getScreenShotWithLogger(WebDriver driver,String imageName,ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots/";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occured while taking SCREENSHOT!!!");

            e.printStackTrace();
        }

        }
        public static void scrollByPixelMethod(WebDriver driver, String x, String y, String scroll) {
            System.out.println("Able to " + scroll);
            try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeAsyncScript("scroll" + x + "," + y + ")");
            } catch (Exception e) {
                System.out.println("Unable to " + scroll + "Error:" + e);
            }
        }
    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver driver,String imageName,ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occured while taking SCREENSHOT!!!");
            e.printStackTrace();

        }
    }//end of getScreenshot method

}//end of java class
