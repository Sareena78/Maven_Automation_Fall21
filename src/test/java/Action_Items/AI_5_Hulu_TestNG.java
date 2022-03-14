package Action_Items;

import Day9_010822.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.sql.Driver;
import java.util.ArrayList;

public class AI_5_Hulu_TestNG {
    //Define the driver
    WebDriver driver;
    //Set pre condition
    @BeforeSuite
    public void setDriver() {
        driver = Reusable_Actions.setDriver();
    } // end of beforesuite

    @Test(priority = 1)
    public void HuluSearchLoop() throws InterruptedException {
        ArrayList<String> email = new ArrayList<>();
        email.add("mooddnavid@yahoo.com");
        email.add("mooknavidd@gmail.com");

        ArrayList<String> password = new ArrayList<>();
        password.add("1111111");
        password.add("2222211");

        ArrayList<String> name = new ArrayList<>();
        name.add("Aqila");
        name.add("Jameel");

        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("January");
        birthMonth.add("October");

        ArrayList<String> birthDay = new ArrayList<>();
        birthDay.add("4");
        birthDay.add("6");

        ArrayList<String> birthYear = new ArrayList<>();
        birthYear.add("1960");
        birthYear.add("1989");

        ArrayList<String> Gender = new ArrayList<>();
        Gender.add("Male");
        Gender.add("Female");

        for (int i = 0; i < email.size(); i++) {
            driver.navigate().to("https://www.hulu.com/welcome");
            //Verify the title
            var actualTitle = driver.getTitle();
            if (actualTitle.contains("Stream TV and Movies Live and Online")) {
                System.out.println(" Title Matches as " + actualTitle);
            } else {
                System.out.println(" Tilte does not mathc, Actual title is " + actualTitle);
            }//end of if/else
            //Scroll down use Jse Executer
            Reusable_Actions.scrollMethod(driver, "0", "3000");
            //Under most popular, click on 30 day free trial
            Reusable_Actions.clickMethod(driver, "//*[@class='plan-card__button-wrapper']", "select plan");
            //entering a unique keyword from array list
            //select value from email
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='email']", email.get(i), "Enter email");
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='password']", password.get(i), "Enter email");
            //select value from name
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='firstName']", name.get(i), "Enter email");
            Reusable_Actions.clickMethod(driver, "//*[@aria-live='polite']", "clink on month");
            Thread.sleep(1000);
            //select value from birth month after clicking on month
            Reusable_Actions.clickMethod(driver, "//*[text()='" + birthMonth.get(i) + "']", "birth month ");
            Reusable_Actions.clickMethod(driver, "//*[text()='Day']", "Birth Day");
            Reusable_Actions.clickMethod(driver, "//*[text()='" + birthDay.get(i) + "']", "Birth Day");
            Thread.sleep(1000);
            //select value from Birth Year after clicking on Birth Year
            Reusable_Actions.clickMethod(driver, "//*[text()='Year']", "Birth Year");
            Reusable_Actions.clickMethod(driver, "//*[text()='" + birthYear.get(i) + "']", "Birth Year");
            Thread.sleep(1000);
            //Select Gender
            Reusable_Actions.clickMethod(driver, "//*[text()='Select']", "Select Gender");
            Reusable_Actions.clickMethod(driver, "//*[text()='" + Gender.get(i) + "']", "Select Gender");
            Thread.sleep(1000);
            //Click on Continue after all values are entered and print out the Month subscription and amount due
            Reusable_Actions.clickMethod(driver, "//*[contains(@class,'button button--continue ')]", "Continue button");
            System.out.println(Reusable_Actions.getTextMethod(driver, "//*[@class='ledger__content']", "Capture text"));
            System.out.println(Reusable_Actions.getTextMethod(driver, "//*[@class='ledger__summary']", "Capture Total Due today"));
            //delete the entered values to avoid error in code
            driver.manage().deleteAllCookies();
        }//end of loop

    }//end of test 1
    //2nd test that depends on Test 1
    @Test (dependsOnMethods = "HuluSearchLoop")
    public void Login() {
        //Navigate to hulu
        driver.navigate().to("https://www.hulu.com/welcome");
        //Click on login
        Reusable_Actions.clickMethod(driver,"//*[text()='Log In']","click on login");
        //enter you email
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='email_id']","mooddnavid@yahoo.com", "Email ID");
        //enter you password
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='password_id']","1111111","Enter Password");
        //click on login button
        Reusable_Actions.clickMethod(driver,"//*[text()='LOG IN']","Click on login");
        //Verify you are logged in by verifying your username and password and print it out
        System.out.println(Reusable_Actions.getTextMethod(driver,"//*[text()='Aqila']","Account verified as Aqila"));
    }//end of @Test2
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }
}//end of class
