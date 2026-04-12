package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import org.testng.annotations.Test; // ✅ correct
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
    private static String URL;


    // Static block (runs automatically)
    @BeforeSuite
    public void Before_Suite() {
        try {
//            FileInputStream fis = new FileInputStream("src\\test\\resources\\Chandan_New_Test_Data.properties");
            InputStream fis = getClass().getClassLoader().getResourceAsStream("src\\\\test\\\\resources\\\\Chandan_New_Test_Data.properties");
            p = new Properties();
            p.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @BeforeMethod
    public void Before_Method() {
        driver=new ChromeDriver();
        URL=p.getProperty("URL");
        driver.get((URL));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    
    @AfterMethod
    public void After_Method() 
    {
        driver.quit();
    }

    public String getUN1() {
        Valid_UN=p.getProperty("Valid_UN");
        return Valid_UN;
    }
    public String getPWD1() {
        Valid_PWD=p.getProperty("Valid_PWD");
        return Valid_PWD;
    }
    public String getInvalid_UN() {
        Invalid_UN=p.getProperty("Invalid_UN");
        return Invalid_UN;
    }
    public String getInvalid_PWD() {
        Invalid_PWD=p.getProperty("Invalid_PWD");
        return Invalid_PWD;
    }

}
