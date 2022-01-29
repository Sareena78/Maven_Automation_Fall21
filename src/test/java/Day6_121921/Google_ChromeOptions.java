package Day6_121921;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google_ChromeOptions {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need

        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        options.addArguments("headless");


        //define the webdriver
        WebDriver driver = new ChromeDriver(options);
        //navigate to google
        driver.navigate().to("https://www.google.com");
        System.out.println("Navigated to google");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        System.out.println("Entered keyword cars on google search");





    }//end of main
}//end of class
