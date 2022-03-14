package EXPRESS_POM_AI7;

import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class E1_BaseClass extends Reusable_Annotations {
    public E1_BaseClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    } //end of constructor class

    //Create static reference for Express HomePage
    public static E2_HomePage homepage() {
        E2_HomePage homePage = new E2_HomePage(driver);
        return homePage;
    }

    //Create Static reference for Dresses page
    public static E3_DressesPage dressesPage() {
        E3_DressesPage dressesPage = new E3_DressesPage(driver);
        return dressesPage;
    }//end of dress page reference

    //Create static reference for Check out a guest
    public static E4_CheckoutAsGuest checkoutAsGuest() {
        E4_CheckoutAsGuest checkoutAsGuest = new E4_CheckoutAsGuest(driver);
        return checkoutAsGuest;

    }//end of

    //Create static reference for View Bage page
    public static E5_View_BagPage viewBagPage() {
        E5_View_BagPage viewBagPage = new E5_View_BagPage(driver);
        return viewBagPage;

    }


}
