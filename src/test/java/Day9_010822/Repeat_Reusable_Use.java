package Day9_010822;


import Reusable_Library.Repeat_Reusable_Methods;
import org.openqa.selenium.WebDriver;

public class Repeat_Reusable_Use {
    public static void main(String[] args) {
        //setting the local driver to reusable setDriver method
        WebDriver driver = Reusable_Actions.setDriver();

        //navigate to uspsv
        driver.navigate().to("https://www.usps.com");

        //hovering to the quick tools
        Repeat_Reusable_Methods.mouseHover(driver, "//*[text()='Quick Tools']", "Quick Tools");

        //hover to send tab
        Repeat_Reusable_Methods.mouseHover(driver, "//*[@id='mail-ship-width']", "Send Tab");

        //click on calculate a price
        Repeat_Reusable_Methods.clickAction(driver, "//*[@class='tool-calc']", "Calculate a Price");

        //enter the zip code
        Repeat_Reusable_Methods.sendKeysAction(driver, "//*[@id='Origin']", "11218", "Zip Code");

        //print out header text info
        String result = Repeat_Reusable_Methods.getTextAction(driver, "//*[@class='header-usps row']", "Header Info");
        System.out.println("My header info is " + result);

    }

}



