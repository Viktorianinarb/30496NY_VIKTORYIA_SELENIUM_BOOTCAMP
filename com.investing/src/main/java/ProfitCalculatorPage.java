import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfitCalculatorPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'forexSearchText']")
    public WebElement currencyPairInputField;

    @FindBy(xpath = "//input[@id = 'forex_OTP']")
    public WebElement openingTradePriceInputField;

    @FindBy(xpath = "//input[@id = 'CTP']")
    public WebElement closingTradePriceInputField;

    @FindBy(xpath = "//a[@id = 'forexCalculateButton']")
    public WebElement calculateButton;

    @FindBy(xpath = "//i[@style = 'display: block; opacity: 1;']")
    public WebElement calculationResult;

    public String getCalculationResult(){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//i[@style = 'display: block; opacity: 1;']")));
        return getTrimmedElementText(calculationResult);
    }

    public void enterClosingTradePrice(String closingPrice){
        clearSendKeysToElement(closingTradePriceInputField, closingPrice );
    }

    public void calculateAmount(){
        safeClickOnElement(calculateButton);
    }

    public void enterOpeningTradePrice(String tradePrice){
        clearSendKeysToElement(openingTradePriceInputField, tradePrice);
    }

    public void enterCurrencyPair(String currencyPair){
        clearSendKeysToElement(currencyPairInputField, currencyPair);
    }
    public ProfitCalculatorPage(){
        PageFactory.initElements(driver, this);
    }
}
