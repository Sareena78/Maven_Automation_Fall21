package Day5_121821;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Google_Automation {
    public static void main(String[] args) throws InterruptedException {
        //Set the property of the chromedrier we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();
        //Naviage to google.
        driver.navigate().to ("https://www.google.com/");
        //maximize the browser
        driver.manage().window().maximize();
        //add wait time
        Thread.sleep(2000);

        //Type cars
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@value='Google Search']")).submit();
        Thread.sleep(3000);

        //Capture the result and store it as a variable, e.g. variable name result
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //declaring the array variable to split the result
        String[] arrayResult = result.split(" ");
        //Now print the search number only
        System.out.println("My search result is "+arrayResult[1]);

        //close the browser
        driver.quit();


    }//end of main
}//end of class
