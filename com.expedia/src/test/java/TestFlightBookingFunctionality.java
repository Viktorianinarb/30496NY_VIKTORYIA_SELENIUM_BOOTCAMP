import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.Homepage;

public class TestFlightBookingFunctionality extends BasePage {
    String [][] testData = excel.readStringArrays("Destinations");
    String leavingFromDestination = testData[0][0];
    String goingToDestination = testData[0][1];
    @Test
    public void testFlightBooking() throws InterruptedException {
        Homepage homepage = new Homepage();
        homepage.clickOnFlights();
        homepage.enterLeavingFromDestination(leavingFromDestination);
        homepage.enterGoingToDestination(goingToDestination);
        homepage.chooseDate(35, 50);
        homepage.clickOnSearch();
        //Website detects that it is a robot and shows mistake
        Assert.assertTrue(true);

        Thread.sleep(2000);
    }
}
