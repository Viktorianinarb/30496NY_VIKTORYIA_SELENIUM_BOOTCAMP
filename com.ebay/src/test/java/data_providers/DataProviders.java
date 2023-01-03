package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {
    @DataProvider(name = "DP1")
    public Object[][] getData() {
        return excel.readStringArrays("SearchItems");
    }


    @DataProvider(name = "DP2")
    public Object[][] getDataMentoring() {
        return excel.readStringArrays("SearchItem");}
    }




