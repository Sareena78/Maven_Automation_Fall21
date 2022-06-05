package Day4_121221;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Automation {
    public static void main(String[] args) {
        //set up Chrome Driver with the Webdriver Manager
        // System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        //define the web driver that you are going to use. In this case Chrome
        WebDriver driver = new ChromeDriver();

        //simply open the google website
        driver.navigate().to("https://www.google.com/");

        //maximize the browser
        driver.manage().window().maximize(); //for windows
        //close it.
        //driver.close();

    }
}

