import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCartFunctionality extends BasePage {

    String[] testData = excel.readStringArray("SelectedCharger");
    String expectedCharger = testData[0];

    @Test
    public void testAddToCartFunctionality() {
        Homepage homepage = new Homepage();
        homepage.clickOnShopButton();
        homepage.clickOnAccessoriesLink();
        BatteriesAndChargersPage batteriesAndChargersPage = homepage.clickOnChargersOption();
        ChargesPage chargesPage = batteriesAndChargersPage.clickOnChargers();
        chargesPage.selectChargerFromTheList(3);
        ShoppingCartPage shoppingCartPage = chargesPage.clickOnContinue();


        Assert.assertEquals(shoppingCartPage.getTextFromCartItem(), expectedCharger);
    }
}
