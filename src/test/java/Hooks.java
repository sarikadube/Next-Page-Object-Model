import FunctionLibrary.CommonFunctions;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    CommonFunctions commonFunctions = new CommonFunctions();
    @Before
    public void beforeTest() throws Exception{
        commonFunctions.openBrowser();
    }

    @After
    public void afterTest(){
       // commonFunctions.closeBrowser();

    }
}
