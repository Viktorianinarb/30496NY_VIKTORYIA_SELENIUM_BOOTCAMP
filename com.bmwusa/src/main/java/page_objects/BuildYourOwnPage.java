package page_objects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BuildYourOwnPage extends BasePage {

    @FindBy(xpath = "//nav[@id = \"SeriesNavigation\"]//ul//li[@class = \"btn-navbar\"]")
    public List<WebElement> carModelList;

    @FindBy(xpath = "//a[@aria-label='Select X1 Sports Activity Vehicle']")
    public WebElement selectModelX1;


    public void chooseSeries(int seriesIndex) throws InterruptedException {
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//nav[@id = \"SeriesNavigation\"]//ul//li[@class = \"btn-navbar\"]")));
        try {
            safeClickOnElement(carModelList.get(seriesIndex));
        } catch (IndexOutOfBoundsException e) {
            safeClickOnElement(carModelList.get(carModelList.size()-1));
        }
    }


    public BuildYourOwnPage(){
        PageFactory.initElements(driver,this);
    }
}
