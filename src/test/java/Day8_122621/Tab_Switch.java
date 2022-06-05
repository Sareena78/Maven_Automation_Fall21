package Day8_122621;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Tab_Switch {
    public static void main(String[] args) throws InterruptedException {

        //call the webdrivermanager
        WebDriverManager.chromedriver().setup();
        //call chromeoptions
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        //disable pop ups
        options.addArguments("–disable-notifications");
        //set my webdriver
        WebDriver driver = new ChromeDriver(options);
        //navigate to UHC
        driver.navigate().to("https://www.uhc.com");
        Thread.sleep(2500);
        //click on find a doctor
        try  {
            driver.findElement(By.xpath("//*[text()='Find a doctor']")).click();
        }catch (Exception e){
            System.out.println("unable to click " +e);
        }
        Thread.sleep(2500);
        //pop up
        try {
            driver.findElement(By.xpath("//*[@id='ip-close']")).click();
        } catch (Exception e) {
            System.out.println("pop up did not show" + e);;
        }//end of try catch block

        //Scroll to the window of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //Scroll down
        jse.executeScript("scroll(0,450)");
        //click on select your plan dropdown and choose medicare as value
        try{
            driver.findElement(By.xpath("//*[contains(text(),'Sign in to find providers in your network')]")).click();
        }catch  (Exception e){
            System.out.println("unable to click on " + e);
        }

        //WebDriverWait wait = new WebDriverWait(driver, 15);
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Medicare plan']"))).click();

        try {
            driver.findElement(By.xpath("//*[text()='Medicare plan']")).click();
        }catch (Exception e){
            System.out.println("Unable to click on medicare plan" +e);
        }
        //click on dismiss
       try {
           driver.findElement(By.xpath("//*[@id='alert-sticky__dismiss-button']")).click();
       }catch (Exception e){
           System.out.println("dismiss didnt show" +e);
       }
        Thread.sleep(1000);

        //click on Sign In
        try {
            driver.findElement(By.xpath("//*[text()='Sign In']")).click();
        }catch (Exception e){
            System.out.println("unable to click on sign in " +e);
        }

        //to switch to new tab use arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(tabs.get(1));
        //Thread.sleep(1000);
        //driver.close();

    }//end of main
}//end of class
