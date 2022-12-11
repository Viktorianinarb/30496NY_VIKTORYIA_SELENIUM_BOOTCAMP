import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ComparisonResultPage extends BasePage {

@FindBy(xpath = "//div[@class = 'card-name']/sup")
public List<WebElement> listOfResultsShown;

public boolean compareResultWithExpected(String expected1, String expected2) {
    webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class = 'card-name']/sup")));
    if (getTrimmedElementText(listOfResultsShown.get(0)) == expected1 && getTrimmedElementText(listOfResultsShown.get(1)) == expected2){
    } return true;
}

    public ComparisonResultPage(){
        PageFactory.initElements(driver,this);
    }
}
