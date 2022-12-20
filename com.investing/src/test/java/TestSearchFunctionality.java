import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFunctionality extends BasePage {
    String searchTerm = "Candlestick Patterns Explained";
    @Test
    public void testArticleSearch() throws InterruptedException {
        Homepage homepage = new Homepage();
        AcademyPage academyPage = homepage.switchToAcademy();
        academyPage.enterSearchTextIntoSearchField(searchTerm);
        SearchResultsPage searchResultsPage = academyPage.clickOnSearchOption();

        Assert.assertEquals(searchResultsPage.getSerachResultsTitle(),searchTerm);

    }
}
