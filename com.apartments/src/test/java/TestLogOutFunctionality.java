import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogOutFunctionality extends BasePage {

    @Test (dataProviderClass = data_providers.DataProviders.class, dataProvider = "DP1")
    public void testLogOut(String username, String password, String expected) throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickOnSignInButton();
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class = 'modalBody']//iframe")));
        homepage.switchToSignInFrame();
        homepage.enterUsername(username);
        homepage.enterPassword(password);
        homepage.clickOnAccountSignInButton();
        UserAccountPage userAccountPage = new UserAccountPage();
        userAccountPage.clickOnDropDownLogOut();
        webDriverWait.until(ExpectedConditions.visibilityOf(homepage.signInLink));
        Assert.assertTrue(homepage.signInLink.isDisplayed());


    }
}
