package Day14_012322;

import Reusable_Library.Reusable_Annotations;
import USPS_Page_Object.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class USPS_Ship_A_Label_POM extends Reusable_Annotations {

    @Test
    public void USPS_Verify_Tabs_Then_Ship_A_Label(){

        //navigate to usps
        logger.log(LogStatus.INFO,"Navigating to USPS home page");
        driver.navigate().to("https://www.usps.com");

        //verify the tabs count
        BaseClass.homepage().getNavigationTabsCount();

        //click on Send tab
        BaseClass.homepage().clickOndSendTab();

        //click on Ship a Label
        BaseClass.sendMailAndPackages().clickOnPrintLabelButton();

        //to switch to new tab use arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(tabs.get(1));
        //Thread.sleep(1000);



    }



}
