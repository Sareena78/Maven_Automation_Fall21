package Day5_121821;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.LinkedTransferQueue;

public class Goole_Array_test {
    public static void main(String[] args) throws InterruptedException {
        //Search multiple cities and each time capture and print the result (we will use Dynamic array and loop
        //for this

        //Set the array
        String[] cities = new String[4];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Bronx";
        //set the driver outside the loop
        //set the property of chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();



        for (int i = 0; i<cities.length; i++){
            //simply open the google website
            driver.navigate().to("https://www.google.com/");

            //maximize the browser
            driver.manage().window().maximize(); //for windows
            //Type cars
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities[i]);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@value='Google Search']")).submit();
            Thread.sleep(3000);

            //Capture the result and store it as a string variable, e.g. variable name result
            String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //declaring the array variable to split the result
            String[] arrayResult = result.split(" ");
            //Now print the search number only
            System.out.println("My search result for  " + cities[i] + " is " +arrayResult[1]);
        }//end of loop

        //Close the driver outside of loop
        //close the browser
        driver.quit();

    }//end of main
}//end of class
