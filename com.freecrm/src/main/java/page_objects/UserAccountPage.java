package page_objects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserAccountPage extends BasePage {

    @FindBy(xpath = "//*[@class = 'user-display']")
    public WebElement userName;

    @FindBy(xpath = "//*[@class='home icon']")
    public WebElement mainMenu;

    @FindBy(xpath = "//div[@id='main-nav']//a")
    public List<WebElement> menuChoiceSelectionLinks;

    @FindBy(xpath = "//class[conatins(text(), 'Contacts']")
    public WebElement contactsButton;


    public UserAccountPage(){
        PageFactory.initElements(driver,this);
    }

    public void expandMainMenu(){
        hoverOverElement(mainMenu);
    }

    public void clickOnMenuChoiceSelectionLinks(String link){
        for(WebElement element : menuChoiceSelectionLinks){
                if(getTrimmedElementText(element).equals(link)){
                    safeClickOnElement(element);
                    break;
                }
        }
    }


    public ContactsPage clickOnContactsLink(){
        expandMainMenu();
        clickOnMenuChoiceSelectionLinks("Contacts");
        return new ContactsPage();
    }

    public CompaniesPage clickOnCompanyLink(){
        expandMainMenu();
        clickOnMenuChoiceSelectionLinks("Companies");
        return new CompaniesPage();
    }

    public TasksLandingPage clickOnTasksLink(){
        expandMainMenu();
        clickOnMenuChoiceSelectionLinks("Tasks");
        return new TasksLandingPage();
    }
}


