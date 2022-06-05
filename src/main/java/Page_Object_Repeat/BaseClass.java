package Page_Object_Repeat;


import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {
    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class

    //create static reference for google home page
    public static Google_Home_page googleHomePage(){
        Google_Home_page googleHomePage = new Google_Home_page(driver);
        return  googleHomePage;
    }//end of googleHomePage method

    //create static reference for google search result page
    public static GoogleSearchPage googleSearchResultPage(){
        GoogleSearchPage googleSearchResultPage = new GoogleSearchPage(driver);
        return  googleSearchResultPage;
    }//end of googleSearchResultPage method


}
