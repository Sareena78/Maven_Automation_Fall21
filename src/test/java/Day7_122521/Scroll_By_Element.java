package Day7_122521;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_By_Element {
    public static void main(String[] args) throws InterruptedException {
        //webdriver manager to open by driver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        //start maximized
        options.addArguments("start-maximized");
        //set the driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calc
        driver.navigate().to("https://www.mortgagecalculator.org");
        //driver.manage().window().fullscreen();
        Thread.sleep(2500);

        //scroll to the window of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll to the view by element 'Home Value' text
        //declare as webelement
        WebElement homeValueText = driver.findElement(By.xpath("//*[contains(text(),'Home Value:')]"));
        //To scroll down the page by the element  "Home Value" text visibility
        jse.executeScript("arguments[0].scrollIntoView(true);", homeValueText);
        //We can add methods to this homevalutex or declare another variable to enter the values in the box as well.
        WebElement enterHomeValue = driver.findElement(By.xpath("//*[@class='right-cell']"));
        enterHomeValue.click();
        //homeValueEntry.clear();
        enterHomeValue.sendKeys("456000");

        //driver.quit();
    }//end of main
}//end of class
