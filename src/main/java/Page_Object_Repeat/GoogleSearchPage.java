package Page_Object_Repeat;


import Reusable_Library.Reusable_Annotations;
import Reusable_Library.Reusable_POM_Logger_Repeat;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchPage extends Reusable_Annotations {
    //Declare the ExtentTest for each page object class
    ExtentTest logger;

    //create a constructor method that will reference the same name as your class, you can make your
    //page object class methods static when you call it in your test class
    public GoogleSearchPage(WebDriver driver){
        //page factory function for page object
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of constructor


    //define all the webelements using @find by concept
    @FindBy(xpath = "//*[@id='result-stats']")
    WebElement searchResult;


    public void CaptureSearchNumberAndPrintIt(){
        String result = Reusable_POM_Logger_Repeat.getTextAction(driver,searchResult,logger,"Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("My search number is " + arrayResult[1]);
        logger.log(LogStatus.INFO,"My search number is " + arrayResult[1]);
    }//end of google search button

}//end of class
