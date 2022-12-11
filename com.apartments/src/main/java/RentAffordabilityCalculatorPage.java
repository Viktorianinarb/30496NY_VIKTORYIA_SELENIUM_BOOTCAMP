import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RentAffordabilityCalculatorPage extends BasePage {

    @FindBy(id = "monthlyIncome")
    public WebElement monthlyIncomeInputFiled;

    @FindBy(xpath = "//input[@id = 'sliderInput']")
    public WebElement sliderPercentageValue;

    @FindBy(xpath = "//span[@id = 'result' and @class = 'rent-value']")
    public WebElement calculatedRentValueText;

    public void enterAnnualIncome(String annualSalary){
        clearSendKeysToElement(monthlyIncomeInputFiled,annualSalary);
    }

    public void setSliderValue(int percentagevalue) {

        Actions action= new Actions(driver);
        action.click(sliderPercentageValue).build().perform();
        action.clickAndHold(sliderPercentageValue).moveByOffset(-(sliderPercentageValue.getSize().width), 0).build().perform();
        for (int i = 10; i < percentagevalue; i++)
        {
            action.sendKeys(Keys.ARROW_RIGHT).build().perform();
        }
    }

    public String calculatedRentalValue(){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@id = 'result' and @class = 'rent-value']")));
        String actual = calculatedRentValueText.getText();
        actual = actual.replace(",","");
        return actual;
    }






    public RentAffordabilityCalculatorPage(){
        PageFactory.initElements(driver,this);
    }
}
