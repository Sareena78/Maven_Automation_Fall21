package Day10_010922;

import Day9_010822.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.ArrayList;

public class TestNG_With_ForLoop {



    public class TestNG_Annotations {
/*
   precondition - set the driver and navigate to google website
   test 1 - verify the google title and search for google keyword and hit submit
   test 2 - capture search result and only print out the search number
   post condition - quit your driver
 */

        //declare the webdriver outside of the annotation methods so it can be called on all the methods
        WebDriver driver;

        @BeforeSuite
        public void SetTheDriver(){
            driver = Reusable_Actions.setDriver();
            //navigate google page
            driver.navigate().to("https://www.google.com");
        }//end of precondition

        //Test Case 1
        @Test(priority = 1)
        public void SearchForAKeyword(){
            //verify the title says 'Google'
            String actualTitle = driver.getTitle();
            if(actualTitle.equals("Google")){
                System.out.println("Title matches as 'Google'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }

            //enter a keyword on search field
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='q']","Cars","Google Search");
            //submit the go button
            Reusable_Actions.submitMethod(driver,"//*[@name='btnK']","Submit Button");

        }//end of test 1
        //@Test(dependsOnMethods="HuluSignupLoop") (adding the dependency).
//Test Case 2
        @Test(priority = 2)
        public void CaptureSearchNumber(){
            ArrayList<String> cars = new ArrayList<>();
            cars.add("BMW");
            cars.add("Toyota");
            cars.add("Sudon");
            for (int i=0; i<cars.size(); i++) {
                //enter a keyword on search field
                Reusable_Actions.sendKeysMethod(driver, "//*[@name='q']", cars.get(i), "Google Search");
                //submit the go button
                Reusable_Actions.submitMethod(driver, "//*[@name='btnK']", "Submit Button");
                //Capture search result
                String result = Reusable_Actions.getTextMethod(driver, "//*[@id='result-stats']", "Search Result");
                //split the result by single space and print out the search result
                String[] arrayResult = result.split(" ");
                System.out.println("My search number for cars is " + cars.get(i) + "is" + arrayResult[1]);
            }
        }//end of test 2

        @AfterSuite
        public void quitSession(){
            driver.quit();
        }

        @BeforeMethod
        public void beforeTest(){
            System.out.println("This executes before each test and its just the beginiing");
        }

        @AfterMethod
        public void afterTest(){
            System.out.println("This executes after each test and its the end");
        }





    }//end of class

}
