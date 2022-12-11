import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.Homepage;
import page_objects.PaymentEstimationPage;
import page_objects.PaymentEstimatorResultPage;
import page_objects.ShoppingPage;

public class TestPaymentEstimation extends BasePage {
        String [] testData = excel.readStringArray("TestLocations");
        String zipCodeProvided = testData[0];
    @Test
    public void testPaymentEstimatorFunctionality() throws InterruptedException {
        Homepage homepage = new Homepage();
        ShoppingPage shoppingPage = homepage.clickOnShoppingButton();
        PaymentEstimationPage paymentEstimationPage = shoppingPage.openPaymentEstimator();
        paymentEstimationPage.clickOnSeriesDropDown();
        paymentEstimationPage.clickOnMseriesOption();
        paymentEstimationPage.clickOnModelDropDownMenu();
        paymentEstimationPage.chooseRequiredModel();
        paymentEstimationPage.enterZipCode(zipCodeProvided);
        paymentEstimationPage.clickOnEstimatePaymentButton();
        PaymentEstimatorResultPage paymentEstimatorResultPage = new PaymentEstimatorResultPage();
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class= 'pe-payment-options-card__lease sub-panel']/h4/span")));
        Assert.assertTrue(paymentEstimatorResultPage.result.isDisplayed());

    }
}
