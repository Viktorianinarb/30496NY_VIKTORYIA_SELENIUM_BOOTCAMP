import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.BuildYourOwnPage;
import page_objects.CoreModelsPage;
import page_objects.DesignPage;
import page_objects.Homepage;

public class TestBuildYourOwnCar extends BasePage {

    @Test
    public void testBuildYourCar() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickOnBuildCarButton();
        BuildYourOwnPage buildYourOwn = new BuildYourOwnPage();
        buildYourOwn.chooseSeries(3);
        buildYourOwn.safeClickOnElement(buildYourOwn.selectModelX1);
        CoreModelsPage coreModel = new CoreModelsPage();
        coreModel.clickOnDesignLink();
        DesignPage designPage = new DesignPage();
        designPage.chooseStandardDesign();
        designPage.clickOnNextColorLink();
        designPage.chooseColorFromList(3);
        designPage.clickOnNextWheelLink();
        designPage.clickOnNextUpholsteryLink();
        designPage.clickOnNextLink();
        designPage.clickOnNextLink();
        designPage.clickOnGoToSummary();
        Assert.assertEquals(getTrimmedElementText(designPage.actualTextElement),"Alpine White");

    }
}
