package Day12_Repeat;


import Page_Object_Repeat.BaseClass;
import Reusable_Library.Reusable_Annotations;
import org.testng.annotations.Test;

public class GoogleSearch_POM_Repeat extends Reusable_Annotations {

    @Test
    public void SearchForAKeywordOnGoogleHome(){
        driver.navigate().to("https://www.google.com");
        BaseClass.googleHomePage().searchUserValue("BMW");
        BaseClass.googleHomePage().submitOnGoogleSearch();
    }

    @Test(dependsOnMethods = "SearchForAKeywordOnGoogleHome")
    public void CaptureSearchNumberFromGoogle(){
        BaseClass.googleSearchResultPage().CaptureSearchNumberAndPrintIt();
    }

}
