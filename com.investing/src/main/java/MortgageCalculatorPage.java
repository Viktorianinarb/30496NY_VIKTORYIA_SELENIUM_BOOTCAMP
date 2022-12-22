import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MortgageCalculatorPage extends BasePage {


    @FindBy(xpath = "//input[@id = 'mortgage_amount']")
    public WebElement loanAmountInputField;

    @FindBy(xpath = "//input[@id = 'mortgage_annual_interest']")
    public WebElement interestInputField;

    @FindBy(xpath = "//input[@id = 'mortgage_number_of_years']")
    public WebElement mortgageYears;

    @FindBy(xpath = "//a[@id = 'mortgage-calculator-submit']")
    public WebElement calculateButton;

    @FindBy(xpath = "//span[@class = 'float_lang_base_2 bold']//i[@class = 'js-_estimated_monthly_payment']")
    public WebElement mortgageCalculationResult;

    public String getMortgageMonthlyPayment() {
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class = 'float_lang_base_2 bold']//i[@class = 'js-_estimated_monthly_payment']")));
        return getTrimmedElementText(mortgageCalculationResult);
    }

    public void calculateMortgageAmount() {
        safeClickOnElement(calculateButton);
    }

    public void enterMortgageYearAmount(String years) {
        clearSendKeysToElement(mortgageYears, years);
    }

    public void enterInterestRate(String interestRate) {
        clearSendKeysToElement(interestInputField, interestRate);
    }

    public void enterLoanAmount(String loanAmount) {
        clearSendKeysToElement(loanAmountInputField, loanAmount);
    }

    public MortgageCalculatorPage() {
        PageFactory.initElements(driver, this);
    }
}
