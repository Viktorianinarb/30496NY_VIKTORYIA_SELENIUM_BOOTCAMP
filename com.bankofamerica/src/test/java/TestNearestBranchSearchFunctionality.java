import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNearestBranchSearchFunctionality extends BasePage {

    String [] inputData = excel.readStringArray("ZipCode");
    String zipcode = inputData[0];
    String expectedText = inputData[1];
    String expectedText2 = inputData[2];
    @Test
    public void testNearestBranchSearch(){
        Homepage homepage = new Homepage();
        BranchLocatorPage branchLocatorPage = homepage.clickOnLinkRedirectingToBranchSearch();
        branchLocatorPage.enterZipCode(zipcode);
        branchLocatorPage.clickOnSearchButton();
        Assert.assertEquals(branchLocatorPage.getTextFromBranchSearchResults(),expectedText);

    }

    @Test
    public void testFilterInLocationSearch() throws InterruptedException {
        Homepage homepage = new Homepage();
        BranchLocatorPage branchLocatorPage = homepage.clickOnLinkRedirectingToBranchSearch();
        branchLocatorPage.enterZipCode(zipcode);
        branchLocatorPage.clickOnSearchButton();
        branchLocatorPage.expandFilterMenu();
        branchLocatorPage.chooseDriveThroughFilterOption();
        branchLocatorPage.clickOnApplyFilterButton();
        Assert.assertEquals(branchLocatorPage.getTextFromBranchFilteredResults(),expectedText2);

    }
}
