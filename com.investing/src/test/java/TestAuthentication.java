import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP1")
    public void testLogInInvalidCredentials(String email, String password, String expected){
        Homepage homepage = new Homepage();
        homepage.clickOnSignInLink();
        homepage.enterEmail(email);
        homepage.enterPassword(password);
        homepage.clickOnSignIn();
        Assert.assertEquals(homepage.getErrorMessage(email), expected);
    }
}
