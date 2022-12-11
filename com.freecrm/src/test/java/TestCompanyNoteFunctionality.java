import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.*;

public class TestCompanyNoteFunctionality extends BasePage {

    String noteText = "Hey guys, I will be out of the office on December 25th";

    @Test
    public void testCompanyNoteCreation() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickOnLoginLink();
        LogInPage loginpage = new LogInPage();
        loginpage.enterValidLoginCredentials();
        loginpage.clickOnLoginButton();

        UserAccountPage userAccountPage = new UserAccountPage();
        userAccountPage.clickOnCompanyLink();
        CompaniesPage companiesPage = new CompaniesPage();
        companiesPage.chooseFirstCompany();
        CompanyInformationPage companyInformationPage = new CompanyInformationPage();
        companyInformationPage.clickOnAddNote();
        AddNotePage addNotePage = new AddNotePage();
        addNotePage.addCompanyNote(noteText);
        addNotePage.clickOnSaveNoteButton();

        Assert.assertEquals(getTrimmedElementText(companyInformationPage.noteMessage),noteText);


        companyInformationPage.eraseNote();

    }

}
