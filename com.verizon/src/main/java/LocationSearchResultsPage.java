import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LocationSearchResultsPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/main/div/div/div/div/div/div[1]/div[2]/div/div/div/div[1]/div/ul/li[3]/div[1]/a[2]")
    public WebElement firstLocation;

    public String getInformationOnFirstLocation(){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"content\"]/main/div/div/div/div/div/div[1]/div[2]/div/div/div/div[1]/div/ul/li[3]/div[1]/a[2]")));
        return firstLocation.getAttribute("aria-label");
    }

    public LocationSearchResultsPage(){
        PageFactory.initElements(driver, this);
    }
}
