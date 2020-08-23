package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {


    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "")
    public static WebElement sortByDropdown;

    @FindBy(xpath = "")
    public  static WebElement sortOptions;

    @FindBy(name = "")
    public static WebElement newInChkBox;

    @FindBy(xpath = "")
    public static WebElement Product;



    public void chooseSortByOption(){
        sortByDropdown.click();
        sortOptions.click();

    }

    public void chooseProduct(){
        Product.click();
    }


}
