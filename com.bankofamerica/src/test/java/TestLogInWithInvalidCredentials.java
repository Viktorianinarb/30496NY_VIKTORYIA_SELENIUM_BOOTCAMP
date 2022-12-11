import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogInWithInvalidCredentials extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP3")
    public void testLoginInvalidCredentials(String username, String password){
        Homepage homepage = new Homepage();
        homepage.inputUsername(username);
        homepage.inputPassword(password);
        homepage.pressOnSignInButton();
        LogInPage logInPage = new LogInPage();

        Assert.assertTrue(logInPage.isElementVisible(logInPage.errorMessage));

    }
}
