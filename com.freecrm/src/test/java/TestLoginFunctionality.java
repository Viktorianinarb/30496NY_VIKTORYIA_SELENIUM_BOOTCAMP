import base.BasePage;
import config.BaseConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.Homepage;
import page_objects.LogInPage;
import page_objects.UserAccountPage;

public class TestLoginFunctionality extends BasePage {

    @Test
    public void testLoginFunctionality(){
        Homepage homepage = new Homepage();
        homepage.clickOnLoginLink();
        LogInPage loginpage = new LogInPage();
        loginpage.enterValidLoginCredentials();
        loginpage.clickOnLoginButton();
        UserAccountPage useraccountpage = new UserAccountPage();
        String name = "Viktoryia Nina";
        Assert.assertEquals(getTrimmedElementText(useraccountpage.userName), name);

    }
}
