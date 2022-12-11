package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BMWIdLoginPage extends Homepage {

    @FindBy (id = "email")
    public WebElement inputEmailField;

    @FindBy (xpath = "//button[contains(text(),\"Register now\")]")
    public WebElement registerNowButton;

    @FindBy (xpath = "//input[@id = 'custom-select-plus-salutation']")
    public WebElement salutationDropDown;

    @FindBy (xpath = "//*[@class = 'form registration-form']")
    public WebElement registrationForm;

    @FindBy (id = "dr.")
    public WebElement dr;

    @FindBy (id = "firstName")
    public WebElement inputFieldFirstName;

    @FindBy (id = "lastName")
    public WebElement inputFieldLastName;

    @FindBy (id = "email")
    public WebElement inputFieldEmail;

    @FindBy (id = "password")
    public WebElement inputFiledPassword;

    @FindBy (xpath = "//*[@class = 'custom-input-checkbox __b']")
    public WebElement checkBoxAgreement;

    @FindBy(xpath = "//div[@id = 'dropdown-container']//div")
    public List<WebElement> salutationOptions;

    @FindBy (xpath = "//button[@class= 'custom-button __b primary']")
    public WebElement registerConfirmationButton;

    public void clickOnRegistrationButton(){
        safeClickOnElement(registerConfirmationButton);
    }

    public void clickOnSalutationMenu(){
        safeClickOnElement(salutationDropDown);
    }

    public void clickOnFirstOptionOfSalutation(int optionNumber){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id = 'dropdown-container']//div")));
        safeClickOnElement(salutationOptions.get(optionNumber));
    }

    public BMWIdLoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void switchToForm(){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class = 'form registration-form']")));
        driver.switchTo().frame(registrationForm);
    }

    public void clickOnRegisterHereButton(){
            safeClickOnElement(registerNowButton);

    }


//    public void clickOnSalutationDRopDown(){
//        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class = 'custom-select-arrow-down __b _error']")));
//        Select se = new Select(salutationDropDown);
//        se.getFirstSelectedOption();
//    }

    public void switchToRegistrationForm(){
        driver.switchTo().activeElement();
    }

    public RegistrationConfirmationPage clickOnRegisterButton(){
        safeClickOnElement(registerNowButton);
        return new RegistrationConfirmationPage();
    }
}
