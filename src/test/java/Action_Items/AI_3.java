package Action_Items;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.plaf.TableHeaderUI;

public class AI_3 {
    public static void main(String[] args) throws InterruptedException {
        //set the array
        String[] hobby = new String[6];
        hobby[0] = "cricket";
        hobby[1] = "badminton";
        hobby[2] = "hockey";
        hobby[3] = "tennis";
        hobby[4] = "basket ball";
        hobby[5] = "gaming";

        //set properties of the driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i <hobby.length; i++) {

            driver.navigate().to("https://www.bing.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobby[i]);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@name='q']")).submit();

            /*//printing the full result
            System.out.println("my test result for " + hobby[i] +  " is " + driver.findElement(By.xpath("//*[@class='sb_count']")).getText());

             */
            //printing the result using split command

            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            String[] arrayResult = result.split(" ");
            System.out.println("my test result for " + hobby[i] +  " is " +arrayResult[0]);


        }//end of loop
        driver.quit();

    }//end of main
}//end of class
