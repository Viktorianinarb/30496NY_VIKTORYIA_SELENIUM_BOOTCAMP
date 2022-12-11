import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutoLoanCalculatorPage extends BasePage {
    @FindBy(xpath = "//input[@id = 'totalLoanAmountField']")
    public WebElement loanAmountInputField;

    @FindBy(id = "stateSelectModal")
    public WebElement stateOptionDropDown;

    @FindBy(xpath = "//a[@id = 'stateSelectorSubmit']")
    public WebElement stateEnterButton;

    @FindBy(xpath = "//input[@id = 'term']")
    public WebElement termInputField;

    @FindBy(xpath = "//input[@id = 'interestRateField']")
    public WebElement interestInputField;

    @FindBy(xpath = "//a[@id = 'calculateButton']")
    public WebElement calculateButton;

    @FindBy(xpath = "//span[@id='amount']")
    public WebElement calculatedAmount;

    public String getCalculatedAmount(){
        return getTrimmedElementText(calculatedAmount);
    }

    public void confirmStateButton(){
        safeClickOnElement(stateEnterButton);
    }
    public void clickOnStateOptions(String state){
        selectFromDropdownByVisibleText(stateOptionDropDown,state);
    }

    public void enterLoanAmount(String loanAmount){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@id = 'totalLoanAmountField']")));
        loanAmountInputField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        sendKeysToElement(loanAmountInputField,loanAmount);
    }

    public void enterTerm(String termMonths){
        termInputField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        sendKeysToElement(termInputField,termMonths);
    }

    public void enterInterest(String interest){
        interestInputField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        sendKeysToElement(interestInputField,interest);
    }

    public void clickOnResultCalculation(){
        safeClickOnElement(calculateButton);
    }
    public AutoLoanCalculatorPage(){
        PageFactory.initElements(driver, this);
    }
}
