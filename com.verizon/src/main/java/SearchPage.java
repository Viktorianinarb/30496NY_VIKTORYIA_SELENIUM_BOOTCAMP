import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'newGridTileStyled__InnerDiv-bsQFXG eybXYa']/div[@style = 'margin: 8px 0px 12px;']//div")
    public List<WebElement> listOfSearchItems;

    public String getTitleFromSearchItems(int searchItemIndex){
      return listOfSearchItems.get(searchItemIndex).getAttribute("title");
        }

    public SearchPage(){
        PageFactory.initElements(driver, this);
    }
}
