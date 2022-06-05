package Day3_121121;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Methods {
    //create a void method that will add two numbers
    public static void add(int x, int y){
        System.out.println("Result of addition is " +(x+y));
    }//end of add method

    //create a void method that will subtract two numbers
    public static void subtract(int x, int y){
        System.out.println("Result of subtraction is " +(x-y));
    }//end of add method

    //create a return method that will add two numbers and return the result of it
    public static int addReturn(int x, int y){
        //declare and define a new int variable to store x+y
        int result = x+y;
        System.out.println("Result of addition is " + result);
        //returning the variable result which is storing x+y values
        return  result;
    }//end of addReturn method

    public int addTwoIntegers( int a, int b) {
        int result = a+b;
        System.out.println("Result of addition is " + result);
        return  result;
    }
    //create a getText method
    public static String getTextAction(WebDriver driver, String xpath, String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        String result = null;
        try{
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            result = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to capture text on element " + elementName + " " + e);
        }
        return result;
    }//end of getTextAction method


    //Method to get text or get title.
   /* public string getPageTtitle(){

        String title = driver.findelemnt.By.xpath(pageTtitleXpath).getText();

        System.out.println("Title of the page is: " + title);

        return title;
    }
    //get title method posted by Kibria
    String actualTitle = driver.getTitle();
        if (actualTitle.equals("xyz")){
            System.out.println("Title matches as 'xyz'");
        }else {
            System.out.println("Title does not match. Actual title is " + actualTitle);
        }//End of if else

    */



}
