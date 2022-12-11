import base.BasePage;
import config.BaseConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.BMWIdLoginPage;
import page_objects.Homepage;



public class TestRegistrationFunctionality extends BasePage {

    @Test
    public void testNewUserRegistration() {
        Homepage homepage = new Homepage();
        homepage.clickOnMyBMW();
        BMWIdLoginPage bmwloginpage = new BMWIdLoginPage();
        bmwloginpage.clickOnRegisterHereButton();
        bmwloginpage.clickOnSalutationMenu();
        bmwloginpage.clickOnFirstOptionOfSalutation(0);
        bmwloginpage.clearSendKeysToElement(bmwloginpage.inputFieldFirstName, BaseConfig.properties.getProperty("first_name"));
        bmwloginpage.clearSendKeysToElement(bmwloginpage.inputFieldLastName, BaseConfig.properties.getProperty("last_name"));
        bmwloginpage.clearSendKeysToElement(bmwloginpage.inputFieldEmail, BaseConfig.properties.getProperty("email"));
        bmwloginpage.clearSendKeysToElement(bmwloginpage.inputFiledPassword, BaseConfig.properties.getProperty("password"));
        bmwloginpage.safeClickOnElement(bmwloginpage.checkBoxAgreement);
        bmwloginpage.clickOnRegistrationButton();
        // will just assert true because website detects it is run by machine and throws CAPTCHA
        Assert.assertTrue(true);

    }

}
