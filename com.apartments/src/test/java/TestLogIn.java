import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogIn extends BasePage {

    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP1")
    public void testLogInWithValidCredentials(String username, String password, String expected) throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickOnSignInButton();
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class = 'modalBody']//iframe")));
        homepage.switchToSignInFrame();
        homepage.enterUsername(username);
        homepage.enterPassword(password);
        homepage.clickOnAccountSignInButton();

        UserAccountPage userAccountPage = new UserAccountPage();
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class = 'username']//button[@class = 'btn btn-md btn-text']/span")));

        Assert.assertEquals(userAccountPage.userNameShown.getText(),expected);

    }

    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP2")
    public void testLogInWithInvalidCredentials(String username, String password, String expected){
        Homepage homepage = new Homepage();
        homepage.clickOnSignInButton();
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class = 'modalBody']//iframe")));
        homepage.switchToSignInFrame();
        homepage.enterUsername(username);
        homepage.enterPassword(password);
        homepage.clickOnAccountSignInButton();
        Assert.assertEquals(homepage.chooseErrorMessage(username), expected);
    }

}
