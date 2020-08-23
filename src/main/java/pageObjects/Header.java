package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    MyAccountPage myAccountPage = new MyAccountPage();

    public Header(WebDriver driver){  // constructor
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="sli_search_1")
    public WebElement searchField;

    @FindBy(xpath="/html/body/header/div/section/section[4]/form/input[4]")
    public WebElement serchIcon;

    @FindBy(name="")
    public WebElement helpLink;

    @FindBy(name="")
    public WebElement storeLocator;

    @FindBy(xpath="")
    public WebElement myAccountLink;

    @FindBy(name="")
    public WebElement wishListIcon;

    @FindBy(xpath="")
    public WebElement bagIcon;

    public void enterSearchTerm(String searchText){


        searchField.sendKeys(searchText);

    }

    public void clickSearchIcon(){

        serchIcon.click();
        Assert.assertTrue(ProductPage.Product.isDisplayed());
    }

    public void clickHealp(){
        helpLink.click();

    }

    public void clickMyAccountLink(){
        myAccountLink.click();
        Assert.assertTrue(myAccountPage.existingCusLable.isDisplayed());
    }

}