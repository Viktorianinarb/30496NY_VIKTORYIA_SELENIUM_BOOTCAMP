import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMortgageCalculator extends BasePage {

     String [] testData = excel.readStringArray("MortgageCalculator");
     String loanAmount = testData[0];
     String interestRate = testData[1];
     String amountOfYears = testData[2];
     String expected = testData[3];


    @Test
    public void testMortgageCalculator(){
        Homepage homepage = new Homepage();
        MortgageCalculatorPage mortgageCalculatorPage = homepage.goToMortgageCalculator();
        mortgageCalculatorPage.enterLoanAmount(loanAmount);
        mortgageCalculatorPage.enterInterestRate(interestRate);
        mortgageCalculatorPage.enterMortgageYearAmount(amountOfYears);
        mortgageCalculatorPage.calculateMortgageAmount();

        Assert.assertEquals(mortgageCalculatorPage.getMortgageMonthlyPayment(),expected);

    }
}
