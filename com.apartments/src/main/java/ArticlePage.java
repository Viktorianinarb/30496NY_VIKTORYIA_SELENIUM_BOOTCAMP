import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticlePage extends BasePage {

    @FindBy(xpath = "//span[@class = 'banner-text']/h1")
    public WebElement articleName;

    public String getTextFromArticleTitle(){
      String articleNameShown =  articleName.getText();
      return articleNameShown;
    }

    public ArticlePage(){
        PageFactory.initElements(driver, this);
    }
}
