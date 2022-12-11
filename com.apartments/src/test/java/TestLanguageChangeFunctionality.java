import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLanguageChangeFunctionality extends BasePage {

    @Test
    public void testLanguageChangeENGtoESP(){
        Homepage homepage = new Homepage();
        homepage.clickOnLanguageMenu();
        homepage.chooseLanguage();
        Assert.assertTrue(homepage.isLanguageChangedSuccessfully());

    }
}
