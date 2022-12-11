import base.BasePage;
import org.testng.annotations.Test;
import page_objects.CreateNewTaskPage;
import page_objects.Homepage;
import page_objects.LogInPage;
import page_objects.UserAccountPage;

public class TestNewTaskFunctionality extends BasePage {

    @Test
    public void testNewTaskCreationFunctionality() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickOnLoginLink();
        LogInPage loginpage = new LogInPage();
        loginpage.enterValidLoginCredentials();
        loginpage.clickOnLoginButton();
        UserAccountPage userAccountPage = new UserAccountPage();
        userAccountPage.clickOnTasksLink();
        CreateNewTaskPage createNewTaskPage = new CreateNewTaskPage();

    }
}
