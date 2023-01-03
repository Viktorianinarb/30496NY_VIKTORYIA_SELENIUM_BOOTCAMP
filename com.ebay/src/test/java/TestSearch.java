import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP2")
    public void testSearch(String searchTerm) throws InterruptedException {
        HomepageMentoring homepageMentoring = new HomepageMentoring();
        homepageMentoring.enterSearchTermIntoSearchField(searchTerm);
        SearchResultsMentoring searchResultsMentoring = homepageMentoring.pickSearchOption();

        Assert.assertTrue(searchResultsMentoring.getSearchResultText(searchTerm));

    }
}
