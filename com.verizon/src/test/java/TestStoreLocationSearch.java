import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStoreLocationSearch extends BasePage {

    String [] testData = excel.readStringArray("StoreLocator");
    String zipcode = testData[0];
    @Test
    public void testStoreLocationsSearch(){
        Homepage homepage = new Homepage();
        LocationSearchPage locationSearchPage = homepage.clickOnStoreLocationsLink();
        locationSearchPage.enterZipCode(zipcode);
        LocationSearchResultsPage locationSearchResultsPage = locationSearchPage.clickOnOption();
        Assert.assertTrue(locationSearchResultsPage.getInformationOnFirstLocation().endsWith(zipcode));

    }
}
