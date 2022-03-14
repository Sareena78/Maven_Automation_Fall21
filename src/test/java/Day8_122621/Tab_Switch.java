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
        driver.findElement(By.xpath("//*[text()='Find a doctor']")).click();
        Thread.sleep(2500);
        //pop up
        driver.findElement(By.xpath("//*[@id='ip-close']")).click();
        //Scroll to the window of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //Scroll down
        jse.executeScript("scroll(0,450)");
        //click on select your plan dropdown and choose medicare as value
        driver.findElement(By.xpath("//*[contains(text(),'Sign in to find providers in your network')]")).click();

        //WebDriverWait wait = new WebDriverWait(driver, 15);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Medicare plan']"))).click();

        driver.findElement(By.xpath("//*[text()='Medicare plan']")).click();

        //to switch to new tab use arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(tabs.get(1));
       //Thread.sleep(1000);
        //click on dismiss
        driver.findElement(By.xpath("//*[@id='alert-sticky__dismiss-button']")).click();
        //Thread.sleep(1000);
        //click on Sign In
        driver.findElement(By.xpath("//*[text()='Sign In']")).click();

    }//end of main
}//end of class
