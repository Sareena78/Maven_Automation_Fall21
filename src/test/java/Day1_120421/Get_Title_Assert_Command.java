package Day1_120421;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Get_Title_Assert_Command {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.hrblock.com/");

        String actualTitle = driver.getTitle();
        System.out.println("Actual title is " + actualTitle);

        //String expectedTitle = "Tax Preparation Services Company | H&R Block®";
        //Assert.assertEquals("Condition true", actualTitle, expectedTitle);


        driver.close();
        driver.quit();
    }
}
