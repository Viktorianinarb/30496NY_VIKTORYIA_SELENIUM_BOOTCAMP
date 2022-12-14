import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestSearchFunctionality extends BasePage {

    String[] testData = excel.readStringArray("SelectedCharger");
    String expectedCharger = testData[1];

    @Test
    public void testSearchFunctionality() throws InterruptedException, AWTException {
        Homepage homepage = new Homepage();
        homepage.clickOnMainSearchButton();
        SearchPage searchPage = homepage.enterItemForSearch(expectedCharger);

        Assert.assertEquals(searchPage.getTitleFromSearchItems(0), expectedCharger);

    }
}
