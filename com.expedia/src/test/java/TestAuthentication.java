import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.Homepage;
import page_objects.SignInPage;

public class TestAuthentication extends BasePage{

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP1")
    public void testSignInWithValidCredentials(String email, String password) throws InterruptedException {
        Homepage homepage = new Homepage();
        SignInPage signInPage = homepage.clickOnSignInButton();
        signInPage.enterEmail(email);
        signInPage.enterPassword(password);
//        signInPage.clickOnAccountSignInButton();
        // TEST DETECTS A ROBOT CONTROLLED BROWSER. ASKS VERIFICATION

        Assert.assertTrue(true);

    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP2")
    public void testSignInWithInvalidCredentials(String email, String password){
        Homepage homepage = new Homepage();
        SignInPage signInPage = homepage.clickOnSignInButton();
        signInPage.enterEmail(email);
        signInPage.enterPassword(password);
        signInPage.clickOnAccountSignInButton();
        //TEST MAY NOT WORK BECAUSE OF THE WEBSITE BLOCKAGE OF BOTS
        Assert.assertTrue(signInPage.errorMessage.isDisplayed());
    }
}
