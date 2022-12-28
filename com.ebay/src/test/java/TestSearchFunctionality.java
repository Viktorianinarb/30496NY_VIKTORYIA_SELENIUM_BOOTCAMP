import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFunctionality extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP1")
    public void testSearchByCategory(String searchTerm) throws InterruptedException {
    Homepage homepage = new Homepage();
    homepage.enterSearchCategory(searchTerm);
    homepage.pickSearchItemFromDropDown();
    SearchResultsPage searchResultsPage = homepage.clickOnSearchButton();
        Assert.assertTrue(searchResultsPage.getSearchResults(searchTerm));

    }
}
