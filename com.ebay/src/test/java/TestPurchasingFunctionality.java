import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPurchasingFunctionality extends BasePage {
    @Test
    public void testAddItemToCart() throws InterruptedException {
        Homepage homepage = new Homepage();
        ToysPage toysPage = homepage.getToysPage();
        toysPage.clickOnDollsCategory();
        toysPage.goToBarbieSection();
        FinalResultPage finalResultPage = toysPage.goToFirstSearchResult(1);
        finalResultPage.addItemToCart();
        Assert.assertTrue(finalResultPage.isItemIncart());



        Thread.sleep(10000);
    }
}
