package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Hotels_Incomplete_AI {
    public static void main(String[] args) throws InterruptedException {
        //Set the driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //navigate to  Hotels.com

        driver.navigate().to("https://www.hotels.com/");
        //add wait time
        Thread.sleep(2000);
        //Array list for going to search
        ArrayList<String> Locations = new ArrayList<>();
        Locations.add("California");
        Locations.add("Chicago");
        Locations.add("NewYork");

        for (int i = 0; i <Locations.size();i++) {

            try{
                WebElement searchBox = driver.findElement(By.xpath("//*[@aria-label='Going to']"));
                searchBox.click();
                Thread.sleep(2000);
                WebElement searchInput = driver.findElement(By.xpath("//*[@id='location-field-destination']"));
                searchInput.click();
                searchInput.sendKeys(Locations.get(i));
                Thread.sleep(2000);

            }catch (Exception e){
                System.out.println(" " + e);
            }//end of try catch

            try {
                WebElement searchOption1 = driver.findElements(By.xpath("//*[@class='uitk-typeahead-button-label truncate']")).get(0);
                searchOption1.click();
            }catch (Exception e){
                System.out.println("" + e);
            }//end of try catch

            try {
                driver.findElement(By.xpath("//*[@id='d1-btn']")).click();
            }catch (Exception e) {
                System.out.println("Unable to find element " + e);
            }//end of try catch
                //select date
            try {
                driver.findElement(By.xpath("//*[@aria-label='Jun 17, 2022']")).click();
            }catch (Exception e) {
                System.out.println("Unable to click on date" + e);
            }//end of try catch
                //select return date
            try {
                driver.findElement(By.xpath("//*[@aria-label='Jun 24, 2022']")).click();
            }catch (Exception e) {
                System.out.println("unable to select return date" + e);
            }//end of try catch
                //click on done
            try {
                driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']")).click();
            }catch (Exception e) {
                System.out.println("unable to click on done " + e);
            }//end of try catch
                //click on travelers aria-label="1 room, 2 travelers"
            try {
                WebElement Travelers = driver.findElement(By.xpath("//*[@aria-label=1 room, 2 travelers']"));

                Travelers.click();
                Travelers.click();
                Thread.sleep(1000);
            }catch (Exception e) {
                System.out.println("unable to clikc on traverls" + e);
            }//end of try catch
                //click on done
                try {
                    driver.findElement(By.xpath("//*[@data-testid='guests-done-button']")).click();
                }catch (Exception e){
                    System.out.println("unable to click on done" +e);
                }
                //click on search  data-testid="submit-button"
                try {
                    driver.findElement(By.xpath("//*[@data-testid='submit-button']")).click();
                }catch (Exception e){
                    System.out.println("unable to click on search" +e);
                }//end of try catch


                }//end of loop
    }//end of main
}//end of class
/*//click on Travelers
                driver.findElement(By.xpath("//*[@aria-label='1 room, 2 travelers']")).click();

                //click + adult twice
                WebElement adults = driver.findElement(By.xpath("//*[@aria-label='Increase adults in room 1']"));
                adults.click();
                adults.click();
                Thread.sleep(1000);
//click done
                driver.findElement(By.xpath("//*[@data-testid='guests-done-button']")).click();
                Thread.sleep(1000);

                //click search
                driver.findElement(By.xpath("//*[@data-testid='submit-button']")).click();

                // store the different options as web element
                WebElement hotels = driver.findElement(By.xpath("//*[@data-stid='open-hotel-information]"));
                if (locations.get(i) == locations.get(0)) {
                    hotels.click();

 */
