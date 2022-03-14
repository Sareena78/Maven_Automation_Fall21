package Day9_010822;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);
        //declare and define your global implicit wait for all web elements
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //navigate to ups.com
        driver.navigate().to("https://www.ups.com/us/en/Home.page");
        //declaring explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);

        //click on Track
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Tracking']"))).click();

        } catch (Exception e) {
            System.out.println("Unable to click on Track " + e);
        }
        //click on track a package
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Track a Package " + e);
        }


        }//End of main
}//End of Class
