import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchWithWrongInput extends BasePage {

    String [] dataFromExcel = excel.readStringArray("SearchInput");
    String testData = dataFromExcel[0];
    String errorMessage = dataFromExcel[1];

    @Test
    public void testSearchWithInvalidInput(){
        Homepage homepage = new Homepage();
        homepage.clickOnSearch();
        homepage.enterInvalidInformation(testData);
        homepage.clickOnSearch();
        Assert.assertEquals(homepage.getMessageFromSearchResult(), errorMessage);

    }
}
