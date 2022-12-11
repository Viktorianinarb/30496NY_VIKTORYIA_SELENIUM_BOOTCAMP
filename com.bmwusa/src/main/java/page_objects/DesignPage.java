package page_objects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DesignPage extends BasePage {

    @FindBy (xpath = "//a[@class='button-next byo-core-type label-1 theme-core']")
    public WebElement nextColorLink;

    @FindBy (xpath = "//*[@title='Standard']")
    public WebElement standardDesign;

    @FindBy (xpath = "//div[@class='byo-rail-option-base']")
    public List<WebElement> colorChoiceList;

    @FindBy (xpath = "//*[@class='button-next byo-core-type label-1 theme-core']")
    public WebElement nextWheelLink;

    @FindBy (xpath = "//*[@class='byo-rail-option-selector']")
    public List<WebElement> wheelChoiceList;

    @FindBy (xpath = "//*[@class='button-next byo-core-type label-1 theme-core']")
    public WebElement nextUpholsteryLink;

    @FindBy (xpath = "//*[@class='byo-rail-option-selector']")
    public List<WebElement> upholsteryChoiceList;

    @FindBy (xpath = "//*[@class='button-next byo-core-type label-1 theme-core']")
    public WebElement nextLink;

    @FindBy (xpath = "//*[@class='byo-core-type byo-dock__link theme-gkl label-1']")
    public WebElement goToSummaryLink;

    @FindBy (xpath = "//span[contains(text(),\"Alpine White\")]")
    public WebElement actualTextElement;


    public void chooseStandardDesign(){
        safeClickOnElement(standardDesign);
    }

    public void clickOnNextColorLink(){
        safeClickOnElement(nextColorLink);
    }

    public void clickOnNextUpholsteryLink(){
        safeClickOnElement(nextUpholsteryLink);
    }
    public void clickOnNextWheelLink(){
        safeClickOnElement(nextWheelLink);
    }

    public void clickOnNextLink(){
        safeClickOnElement(nextLink);
    }

    public void clickOnGoToSummary(){
        safeClickOnElement(goToSummaryLink);
    }
    public void chooseColorFromList(int colorIndex) throws InterruptedException {
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='byo-rail-option-base']")));
        try {
            safeClickOnElement(colorChoiceList.get(colorIndex));
        } catch (IndexOutOfBoundsException e) {
            safeClickOnElement(colorChoiceList.get(colorChoiceList.size()-1));
        }
    }

    public void chooseWheelFromList(int wheelIndex) throws InterruptedException {
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='byo-rail-option-selector']")));
        try {
            safeClickOnElement(wheelChoiceList.get(wheelIndex));
        } catch (IndexOutOfBoundsException e) {
            safeClickOnElement(wheelChoiceList.get(wheelChoiceList.size()-1));
        }
    }

    public void chooseUpholsteryFromList(int upholsteryIndex) throws InterruptedException {
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@class='byo-rail-option-selector']")));
        try {
            safeClickOnElement(upholsteryChoiceList.get(upholsteryIndex));
        } catch (IndexOutOfBoundsException e) {
            safeClickOnElement(upholsteryChoiceList.get(upholsteryChoiceList.size()-1));
        }
    }
    public DesignPage(){
        PageFactory.initElements(driver,this);
    }
}
