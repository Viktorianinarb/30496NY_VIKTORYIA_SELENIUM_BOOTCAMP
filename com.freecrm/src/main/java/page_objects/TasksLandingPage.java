package page_objects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksLandingPage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createTaskButton;

    public CreateNewTaskPage clickOnCreateTaskButton(){
        safeClickOnElement(createTaskButton);
        return new CreateNewTaskPage();
    }
    public TasksLandingPage(){
        PageFactory.initElements(driver, this);
    }
}
