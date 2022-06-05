package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HR_Block {
    public static void main(String[] args) {
        //set up the driver
        WebDriverManager.chromedriver().setup();
        //define Chrome porperties/options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //Apply options to the driver
        WebDriver driver = new ChromeDriver(options);
        //navigate to hr block website
        driver.navigate().to("https://www.hrblock.com/");
        //verify page title
        String actualTitle = driver.getTitle();
        System.out.println("Actual title is " +actualTitle);
        String expectedTitle = " Tax Preparation Services Company | H&R Block®";
        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title Matched" + expectedTitle);
        else
            System.out.println("Title didn't match");

        }

    }

