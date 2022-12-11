import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRentalCalculator extends BasePage {
    @Test
    public void testRentalCalculator() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickOnMenuDropDown();
        homepage.clickOnRenterToolsMenu();
        RentAffordabilityCalculatorPage rentAffordabilityCalculatorPage = homepage.clickOnLinkToRentalCalculator();
        rentAffordabilityCalculatorPage.enterAnnualIncome("90000");
        rentAffordabilityCalculatorPage.setSliderValue(40);
        int value = 90000/100*40;
        String expectedValue = Integer.toString(value);

        Assert.assertEquals(rentAffordabilityCalculatorPage.calculatedRentalValue(), "$" + expectedValue);

    }
}
