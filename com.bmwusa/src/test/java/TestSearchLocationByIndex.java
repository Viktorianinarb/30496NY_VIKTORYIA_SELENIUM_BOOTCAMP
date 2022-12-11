import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.DealerMapPage;
import page_objects.Homepage;

public class TestSearchLocationByIndex extends BasePage {

    @Test
    public void testSearchLocationByZipCode(){
        Homepage homepage = new Homepage();
        DealerMapPage dealerMapPage = homepage.clickOnYourLocalCenterButton();
        dealerMapPage.inputZipCode();
        dealerMapPage.clickOnSearchButton();

       Assert.assertTrue(dealerMapPage.isElementVisible(dealerMapPage.locationFirst));
    }
}
