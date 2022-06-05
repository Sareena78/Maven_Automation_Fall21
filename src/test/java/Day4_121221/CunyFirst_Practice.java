package Day4_121221;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CunyFirst_Practice {
    public static void main(String[] args) {
        //set up with WebDriverManager which webdriver(browser) you are going to use
        WebDriverManager.chromedriver().setup();

        //or you can also use the chrome options to edit your browser such and start-maximized, incognito or headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        // options.addArguments("incognito");
        //options.addArguments("headless"); //head less means you wont see the browser opening and conduction search, it will take place in background.

        //define which browser (driver) you are going to use
        WebDriver driver = new ChromeDriver();
        //navigate to CUNY FIRST Website
        driver.navigate().to("https://ssologin.cuny.edu/cuny.html?resource_url=https%3A%2F%2Fhome.cunyfirst.cuny.edu%252Fpsp%252Fcnyihprd%252FEMPLOYEE%252FEMPL%252Fc%252FNUI_FRAMEWORK.PT_LANDINGPAGE.GBL");
        //Maximize the window.
        driver.manage().window().maximize();
        //enter the user name and password in to login
        driver.findElement(By.xpath("//*[@name='usernameH']")).sendKeys("Hamza.shah");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Ghost");
        //click on login
        driver.findElement(By.xpath("//*[@id='submit']")).submit();
        //quit the driver
        //driver.quit();
    }//end of main
}//end of class
