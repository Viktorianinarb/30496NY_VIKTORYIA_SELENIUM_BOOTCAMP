import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {
    String searchTerm = "Who Is Responsible for Pest Control?";
    String searchPropertyLocation = "11209";
    @Test
    public void testArticleSearch() throws InterruptedException {

        Homepage homepage = new Homepage();
        homepage.clickOnMenuDropDown();
        homepage.clickOnManageRentalButton();
        RentalManagerPage rentalManagerPage = new RentalManagerPage();
        rentalManagerPage.clickOnResourcesDropDown();
        rentalManagerPage.clickOnResourceOverview();
        ResourcesPage resourcesPage = new ResourcesPage();
        resourcesPage.inputSearchTermInSearchField(searchTerm);
        resourcesPage.clickOnSearchButton();
        ArticlePage articlePage = new ArticlePage();

        Assert.assertEquals(articlePage.getTextFromArticleTitle(),searchTerm);


    }

    @Test
    public void testMainSearch() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.inputInfoInSearchField(searchPropertyLocation);
        homepage.clickOnSearchButton();
        SearchPropertyResultPage searchPropertyResultPage = new SearchPropertyResultPage();
        Assert.assertTrue(searchPropertyResultPage.isSearchResultCorrect(searchPropertyLocation));
    }
}
