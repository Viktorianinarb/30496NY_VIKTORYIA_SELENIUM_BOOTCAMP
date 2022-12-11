package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealerMapPage extends Homepage {

    @FindBy(xpath = "//input[@class = 'inputfield-1 pac-target-input']")
    public WebElement indexLocationSearchBar;

    @FindBy (xpath = "//button[@name= 'location-search-submit']" )
            public WebElement searchButtonOnDealerLocationPage;

    @FindBy (xpath = "//ul[@class= 'filterable-list-view__dealer-list']//li[1]")
            public WebElement locationFirst;


   String keys = "11209";

    public void inputZipCode() {
        sendKeysToElement(indexLocationSearchBar, keys);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButtonOnDealerLocationPage);
    }

    public DealerMapPage() {
        PageFactory.initElements(driver, this);
    }

//    public void selectLocation(int locationIndex) {
//        try {
//            safeClickOnElement(locations.get(locationIndex));
//        } catch (IndexOutOfBoundsException e) {
//            safeClickOnElement(locations.get(locations.size() - 1));
//        }
//    }
}
