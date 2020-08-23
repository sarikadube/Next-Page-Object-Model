package stepDefinitions;

import FunctionLibrary.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pageObjects.Header;
import pageObjects.ProductPage;

public class BasketSteps extends CommonFunctions {

    public  static  String expectedProduct;

    Header header = new Header(driver); // Creaded object for the Header class
    ProductPage productPage = new ProductPage(driver);

    @Given("^I'm on basket page$")
    public void i_m_on_basket_page() throws  Exception{
      //  driver.get("http://next.co.uk");
        driver.get(readProperityFile("url"));
}

    @When("^I search for the product \"([^\"]*)\"$")
    public void i_search_for_the_product(String searchTerm) throws Exception{
        //driver.findElement(By.name("")).sendKeys(searchTerm); // for this case search term is from .feature file.

        //driver.findElement(By.name("")).sendKeys(readProperityFile("searchTerm")); // This is commented duce to called Header class search key.
     //   System.out.println("This is working");


//        driver.findElement(By.id("sli_search_1")).sendKeys(readProperityFile("searchTerm"));
//        driver.findElement(By.xpath("/html/body/header/div/section/section[4]/form/input[4]")).click();
        header.enterSearchTerm("T-shirt");
        header.clickSearchIcon();

}


    @When("^I choose a product \"([^\"]*)\"$")
    public void i_choose_a_product(String productName){
       // driver.findElement(By.name("")).click();
       // expectedProduct = productName;

        productPage.chooseProduct();
}

    @When("^I select size \"([^\"]*)\"$")
    public void i_select_size(String size)
    {
       // new Select(driver.findElement(By.name(""))).selectByVisibleText(size);

}

    @When("^I click add to basket button$")
    public void i_click_add_to_basket_button(){

        // driver.findElement(By.name("")).click();
}

    @Then("^I should see the product in the basket$")
    public void i_should_see_the_product_in_the_basket(){
     //   String expectedDescription = "Details about product";
      //  String activalProduct = driver.findElement(By.name("")).getText();
       // Assert.assertEquals(expectedProduct, activalProduct);
}

}
