import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestProfitCalculator extends BasePage {

    String [] testData = excel.readStringArray("CalculatorCurrency");
    String currencyPair = testData[0];
    String openingTradePrice = testData[1];
    String closingTradePrice = testData[2];
    String expected = testData[3];
    @Test
    public void testProfitCalculator() throws InterruptedException {
        Homepage homepage = new Homepage();
       ToolsPage toolsPage = homepage.clickOnToolsMenu();
       ProfitCalculatorPage profitCalculatorPage = toolsPage.clickOnProfitCalculator();
       profitCalculatorPage.enterCurrencyPair(currencyPair);
       profitCalculatorPage.enterOpeningTradePrice(openingTradePrice);
       profitCalculatorPage.enterClosingTradePrice(closingTradePrice);
       profitCalculatorPage.calculateAmount();

        Assert.assertEquals(profitCalculatorPage.getCalculationResult(), expected);

       Thread.sleep(2000);

    }
}
