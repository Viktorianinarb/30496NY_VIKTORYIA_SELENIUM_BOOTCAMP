import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenerateData;


public class TestAutoLoanCalculator extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP4")
    public void testAutoLoanCalculator(String loanAmount, String term, String percentage) throws InterruptedException {
        GenerateData faker = new GenerateData();
        String state = faker.state();
        Homepage homepage = new Homepage();
        AutoLoanPage autoLoanPage = homepage.clickOnAutoLoanLink();
        AutoLoanCalculatorPage autoLoanCalculatorPage = autoLoanPage.openAutoLoanCalculatorPage();
        autoLoanCalculatorPage.clickOnStateOptions(state);
        autoLoanCalculatorPage.confirmStateButton();
        autoLoanCalculatorPage.enterLoanAmount(loanAmount);
        autoLoanCalculatorPage.enterTerm(term);
        autoLoanCalculatorPage.enterInterest(percentage);
        autoLoanCalculatorPage.clickOnResultCalculation();
        String result = "783";
        Assert.assertTrue(autoLoanCalculatorPage.getCalculatedAmount().equals(result));

    }
}
