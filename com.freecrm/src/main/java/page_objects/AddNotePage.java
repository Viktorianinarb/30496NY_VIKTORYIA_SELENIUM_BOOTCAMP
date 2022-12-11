package page_objects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Iterator;
import java.util.Set;

public class AddNotePage extends BasePage {

    @FindBy(xpath = "//textarea")
    public WebElement noteTextInputField;

    @FindBy(xpath = "//button[@class = 'ui green button']")
    public WebElement saveButtonOnNotesPage;

    public void addCompanyNote(String notetext){
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//textarea")));
        clearSendKeysToElement(noteTextInputField,notetext);
    }

    public AddNotePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnSaveNoteButton(){
        safeClickOnElement(saveButtonOnNotesPage);

    }

}
