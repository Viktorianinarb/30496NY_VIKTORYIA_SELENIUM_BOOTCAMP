import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.*;

public class TestCreateContactFunctionality extends BasePage {

    String [] inputData = excel.readStringArray("ContactData");
    String firstname = inputData[0];
    String lastname = inputData[1];
    String companyName = inputData[2];
    String email = inputData[3];
    String category = inputData[4];
    String streetname = inputData[5];
    String city = inputData[6];
    String state = inputData[7];
    String zip = inputData[8];


    @Test
    public void testCreateContactFunctionality() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickOnLoginLink();
        LogInPage loginpage = new LogInPage();
        loginpage.enterValidLoginCredentials();
        loginpage.clickOnLoginButton();
        UserAccountPage userAccountPage = new UserAccountPage();
        userAccountPage.clickOnContactsLink();
        ContactsPage contactsPage = new ContactsPage();
        contactsPage.clickOnCreateContactButton();
        CreateNewContactPage createNewContactPage = new CreateNewContactPage();
        createNewContactPage.enterFirstName(firstname);
        createNewContactPage.enterLastName(lastname);
        createNewContactPage.enterCompanyName(companyName);
        createNewContactPage.chooseCompany();
        createNewContactPage.enterEmail(email);
        createNewContactPage.pressOnCategoryChoices();
        createNewContactPage.selectCategory(category);
        createNewContactPage.enterStreetName(streetname);
        createNewContactPage.enterCity(city);
        createNewContactPage.enterState(state);
        createNewContactPage.enterZip(zip);
        createNewContactPage.pressOnDoNotCall();
        ContactDetailsPage contactDetailsPage = createNewContactPage.clickOnSaveContactButton();

        Assert.assertEquals(contactDetailsPage.getTextFromHeaderName(),firstname + " " + lastname);
        

    }


}

