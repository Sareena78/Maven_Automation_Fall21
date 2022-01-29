package Day7_122521;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling_Mortgage_Calculator {
    public static void main(String[] args) throws InterruptedException {

        //Webdriver manager to open by driver (without worrying about updated chromedriver)
        WebDriverManager.chromedriver().setup();
        //Maximize page
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calc
        driver.navigate().to("https://www.mortgagecalculator.org/");
        Thread.sleep(2500);

        //Scroll to the window of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //Scroll down
        jse.executeScript("scroll(0,450)");


    }//end of main
}//end of class
