package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Config_reader {

    protected WebDriver driver;
    static Properties p;
    private static String Valid_UN;
    private static String Valid_PWD;
    private static String Invalid_UN;
    private static String Invalid_PWD;

    
    // Static block (runs automatically)
    @BeforeSuite
    public void Before_Suite() {
        try {
            FileInputStream fis = new FileInputStream("src\\test\\resources\\Chandan_New_Test_Data.properties");
            p = new Properties();
            p.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @BeforeMethod
    public void Before_Method() {
        driver=new ChromeDriver();
        driver.get(("https://app.empmonitor.com/amember/member"));
    }

    @AfterMethod
    public void After_Method() 
    {
        driver.quit();
    }

    public String getUN1() {
        return p.getProperty("Valid_UN");
    }
}
