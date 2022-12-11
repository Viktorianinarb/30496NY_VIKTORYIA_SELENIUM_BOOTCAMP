package page_objects;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage extends BasePage {

    @FindBy(xpath = "//tbody//tr[1]//a[1]")
    public WebElement firstCompany;

    public CompanyInformationPage chooseFirstCompany(){
        safeClickOnElement(firstCompany);
        return new CompanyInformationPage();
    }



    public CompaniesPage(){

        PageFactory.initElements(driver, this);
    }


}
