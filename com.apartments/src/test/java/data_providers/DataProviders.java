package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;


public class DataProviders extends BasePage {

    @DataProvider(name = "DP1")
    public Object[][] getValidCredentials() {
        return excel.readStringArrays("LogInValidCredentials");
    }

    @DataProvider(name = "DP2")
    public Object[][] getInvalidCredentials(){
        return excel.readStringArrays("LogInWithInvalidCredentials");
    }
}

