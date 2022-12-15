package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "DP1")
    public Object[][] getInValidCredentials() {
        return excel.readStringArrays("LogInWithInvalidCredentials");
    }
}
