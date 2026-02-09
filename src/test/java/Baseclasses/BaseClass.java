//package Baseclasses;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//
//public class BaseClass {
//	
//	WebDriver driver=new ChromeDriver();
//	@BeforeMethod
//	public void OpenApp()
//	{
//		driver.manage().window().maximize();
//		driver.get("http://app.empmonitor.com");
//		
//	}
//	@AfterMethod
//	public void CloseAll()
//	{
//		driver.quit();
//	}
//	
////	Testdat Fetching
//	private static String UN1;
//	private static String PWD1;
//	public static String getUN1() {
//		return UN1;
//	}
//	public static String getPWD1() {
//		return PWD1;
//		
//	}
//	
//	@BeforeSuite
//	public void TestDataIntialization() throws IOException
//	{
//		FileInputStream fis=new FileInputStream("C:\\Users\\GBSBHL1372\\eclipse-workspace\\JenKinProject\\src\\test\\resources\\TestData.properties");
//		Properties prop =new Properties();
//	    prop.load(fis);
//	    String UNValue=prop.getProperty("UN");
//	    String PWDvalue=prop.getProperty("PWD");
//	    UN1=UNValue;
//	    PWD1=PWDvalue;
//	}
//
//}


package Baseclasses;

import java.io.FileInputStream;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    protected  WebDriver driver;
    private static String UN1;
    private static String PWD1;

    public static String getUN1() {
		return UN1;
	}
	public static String getPWD1() {
		return PWD1;
	}
	

	@BeforeSuite
    public void TestDataInitialization() throws Exception {
    	FileInputStream fis=new FileInputStream("C:\\Users\\GBSBHL1372\\eclipse-workspace\\JenKinProject\\src\\test\\resources\\TestData.properties");
		Properties prop =new Properties();
	    prop.load(fis);
	    String UNValue=prop.getProperty("UN");
	    String PWDvalue=prop.getProperty("PWD");
	    UN1=UNValue;
	    PWD1=PWDvalue;
    }

    @BeforeMethod
    public void OpenApp() {
    	WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://app.empmonitor.com");
    }

    @AfterMethod
    public void CloseAll() {
        driver.quit();
    }
}
