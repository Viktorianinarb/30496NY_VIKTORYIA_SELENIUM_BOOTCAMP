import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthenticationFunctionality extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP1")
    public void testLogInWithInvalidCredentials(String userId, String password, String expected) {
        Homepage homepage = new Homepage();
        BusinessLogInPage businessLogInPage = homepage.clickOnLogInLink();
        businessLogInPage.enterUserId(userId);
        businessLogInPage.enterPassword(password);
        businessLogInPage.clickOnLogInButton();

        Assert.assertEquals(businessLogInPage.getActualErrorMessage(), expected);

    }
}
