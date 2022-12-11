import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreditCardComparisonFunctionality extends BasePage {

    String[] creditCardNames = excel.readStringArray("CreditCardNames");
    String firstCardName = creditCardNames[0];
    String secondCardName = creditCardNames[1];
    @Test
    public void testCreditCardComparison() throws InterruptedException {
        Homepage homepage = new Homepage();
        CreditCardsPage creditCardsPage = homepage.clickOnLinkToCreditCardsPage();
        CreditCardComparisonPage creditCardComparisonPage = creditCardsPage.getRedirectedToCreditCardComparison();
        creditCardComparisonPage.chooseTwoCardsToCompare();
        ComparisonResultPage comparisonResultPage = new ComparisonResultPage();

        Assert.assertTrue(comparisonResultPage.compareResultWithExpected(firstCardName,secondCardName));
    }
}
