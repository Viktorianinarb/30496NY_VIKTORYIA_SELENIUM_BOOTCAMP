package page_objects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentEstimationPage extends BasePage {

    @FindBy(xpath = "//select[@id= 'series']")
    public WebElement seriesDropDown;

    @FindBy(xpath = "//select[@id= 'series']//option[contains(@value, \"M\")]")
    public WebElement mseriesOption;

    @FindBy(xpath = "//select[@name= 'model']")
    public WebElement modelDropDown;

    @FindBy(xpath = "//select[@name= 'model']//option[contains(@value, \"23XK\")]")
    public WebElement selectedModel;

    @FindBy(xpath = "//input[@name= 'zipCode']")
    public WebElement zipCodeInputField;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div/div[1]/div/section/div[2]/div[2]/div[2]/button")
    public WebElement estimatePaymentButton;

    @FindBy(xpath = "//iframe[@id = 'usabilla_live_button_container_iframe362648933']")
    public WebElement iframeEstimateCalculatorButton;

    public PaymentEstimatorResultPage clickOnEstimatePaymentButton(){
//        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class = 'vehicle-display-image-container']")));
        safeClickOnElement(estimatePaymentButton);
        return new PaymentEstimatorResultPage();
    }

    public void enterZipCode(String zipCode){
        clearSendKeysToElement(zipCodeInputField, zipCode);
    }

    public void chooseRequiredModel(){
        safeClickOnElement(selectedModel);
    }

    public void clickOnModelDropDownMenu(){
        safeClickOnElement(modelDropDown);
    }

    public void clickOnMseriesOption(){
        safeClickOnElement(mseriesOption);
    }

    public void clickOnSeriesDropDown(){
        safeClickOnElement(seriesDropDown);
    }

    public PaymentEstimationPage(){
        PageFactory.initElements(driver, this);
    }
}
