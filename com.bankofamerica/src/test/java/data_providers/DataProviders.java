package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "DP3")
    public Object[][] getData(){
        return excel.readStringArrays("LoginWithInvalidCredentials");
    }

    @DataProvider(name = "DP4")
    public Object[][] getDataForCalculator(){
        return excel.readStringArrays("AutoLoanCalculator");
    }
}
