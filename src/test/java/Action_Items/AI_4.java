package Action_Items;

import Day8_122621.Try_Catch_Exception;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class AI_4 {
    public static void main(String[] args) throws InterruptedException {
        //set driver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.weightwatchers.com/us/");
        Thread.sleep(2000);
        ArrayList<String> zipcode = new ArrayList<String>();
        zipcode.add("11218");
        zipcode.add("11220");
        zipcode.add("11219");


        for (int i = 0; i < zipcode.size(); i++) {


            try {
                driver.findElement(By.xpath("//*[text()='Attend']")).click();
            } catch (Exception e) {
                System.out.println(" Unable to click on Attend " + e);
            }
            //Click on Unlimited workshops
            try {
                driver.findElement(By.xpath("//*[@data-e2e-name='unlimited_workshops']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Unlimited workshops" + e);
            }
            //Click on Studio
            try {
                driver.findElement(By.xpath("//*[text()='Studio']")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on Studio " + e);
            }
            //Enter the zip code in search
            try {
                driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(zipcode.get(i));
            } catch (Exception e) {
                System.out.println("unable to enter the zip code" + e);
            }
            // Click on search arrow/submit
            try {
                driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            } catch (Exception e) {
                System.out.println("Unable to hit submit" + e);
            }
            Thread.sleep(2000);
            //Click on specific link for studios (using array list since similar code)
            try {
                List<WebElement> specificLink = driver.findElements(By.xpath("//*[@class='heading-3yCF-']"));

                System.out.println();
                specificLink.get(i).click();
                //print the location name and address
                System.out.println(driver.findElement(By.xpath("//*[@class='infoContainer-12kv1']")).getText());

            } catch (Exception e) {
                System.out.println("unable to click on " +i + "link" + e);
            }
            Thread.sleep(2000);
            try {
                //scroll down to business hours
                JavascriptExecutor jse = (JavascriptExecutor)driver;
                jse.executeScript("scroll(0,700)");
                Thread.sleep(2000);
                //print business hours table
                var businessHours = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
                System.out.println(businessHours);
            }catch (Exception e){
                System.out.printf("Unable to capture business hours" +e);
            }//end of try catch

        }//end of for loop
    }//end of main
}//end of class
