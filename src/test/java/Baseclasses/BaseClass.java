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
	
	
	private static String FN;
    private static String LN;
    private static String MailID;
    private static String PWD;
    private static String Country_Code;
    private static String Mobile_no;
    private static String Employee_Code;
    private static String Location_Name;
    private static String Role_Name;
    private static String Department_name;
    private static String TimeZone_No;
    private static String Shift_Name;
    public static String getFN() {
		return FN;
	}
	public static String getLN() {
		return LN;
	}
	public static String getMailID() {
		return MailID;
	}
	public static String getPWD() {
		return PWD;
	}
	public static String getCountry_Code() {
		return Country_Code;
	}
	public static String getMobile_no() {
		return Mobile_no;
	}
	public static String getEmployee_Code() {
		return Employee_Code;
	}
	public static String getLocation_Name() {
		return Location_Name;
	}
	public static String getRole_Name() {
		return Role_Name;
	}
	public static String getDepartment_name() {
		return Department_name;
	}
	public static String getTimeZone_No() {
		return TimeZone_No;
	}
	public static String getShift_Name() {
		return Shift_Name;
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
	    FN=prop.getProperty("FN");
	    LN=prop.getProperty("LN");
	    MailID=prop.getProperty("Mail");
	    PWD=prop.getProperty("PWD");
	    Country_Code=prop.getProperty("CountryCode");
	    Mobile_no=prop.getProperty("Mobile_no");
	    Employee_Code=prop.getProperty("Employee_Code");
	    Location_Name=prop.getProperty("Location_Name");
	    Role_Name=prop.getProperty("Role_Name");
	    Department_name=prop.getProperty("Department_name");
	    TimeZone_No=prop.getProperty("TimeZone_No");
	    Shift_Name=prop.getProperty("Shift_Name");
	    
    }

    @BeforeMethod
    public void OpenApp() {
    	WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");   // headless mode
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
