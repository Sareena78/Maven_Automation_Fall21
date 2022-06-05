package Day5_121821;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Google_Automation {
    public static void main(String[] args) throws InterruptedException {
        //Set the property of the chromedrier we are using
       // System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();
        //Navigate to google.
        driver.navigate().to ("https://www.google.com/");
        //maximize the browser
        driver.manage().window().maximize();
        //add wait time
        Thread.sleep(2000);

        //locate element for search field and Type the worked  cars
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        Thread.sleep(2000);

        //hit enter
        driver.findElement(By.xpath("//*[@value='Google Search']")).submit();
        Thread.sleep(3000);

        //Capture the result and store it as a variable, e.g. variable name result
        var result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //declaring the array variable to split the result
        String[] arrayResult = result.split(" ");
        //Now print the search number only
        System.out.println("My search result is "+arrayResult[1]);

        //close the browser
        driver.quit();


    }//end of main
}//end of class
