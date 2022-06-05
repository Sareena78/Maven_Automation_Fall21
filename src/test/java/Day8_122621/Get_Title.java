package Day8_122621;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Get_Title {
    public static void main(String[] args) {
        //set up the driver
        WebDriverManager.chromedriver().setup();
        //navigate to google
        WebDriver driver = new ChromeDriver();
        //navigate to google
        driver.navigate().to("https://www.google.com");
        //verify the title of the page
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Google")){
            System.out.println("The title matches " +actualTitle);
        } else {
            System.out.println("The title does not match" +actualTitle);
        }//end of if else statement

    }//end of main
}//end of class
