package Day4_121221;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Automation {
    public static void main(String[] args) {
        //set the property of chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        //simply open the google website
        driver.navigate().to("https://www.google.com/");

        //maximize the browser
        driver.manage().window().maximize(); //for windows
        //close it.
        //driver.close();

    }
}

