package FunctionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CommonFunctions {

    public  static WebDriver driver;

    public void  openBrowser() throws  Exception{

        String browser = readProperityFile("browser");
        Dimension dimension = new Dimension(1024, 1366); // Ipad resulation

        switch (browser)
        {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().setSize(dimension);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver= new EdgeDriver();
                break;
            default:
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                break;
        }
    }

    public void  closeBrowser(){
        driver.quit();
    }

    public String readProperityFile(String key) throws Exception
    {
        // Setting to read file path
        FileInputStream inputStream = new FileInputStream(FilePaths.configFilePath);

        Properties properties = new Properties();
        properties.load(inputStream);
        String value = properties.getProperty(key);

        return value;
    }

}
