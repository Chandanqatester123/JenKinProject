package PageClases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import org.testng.Assert;


public class Login_VS_Code {
    
    private WebDriver driver;
    private WebDriverWait wait;
    private SoftAssert s;

     public Login_VS_Code(WebDriver driver) 
    {
        this.driver = driver;
        s=new SoftAssert();
        wait=new WebDriverWait(driver,java.time. Duration.ofSeconds(10));
    }

    private By UN = By.xpath("//input[@id='amember-login']");
    private By PWD = By.xpath("//input[@id='amember-pass']");
    private By Login_Button = By.xpath("//input[@value='Login']");
    private By Error_Message = By.xpath("//div[@class='am-error']");

    public void Login_Action_With_PWD(String UN1, String PWD1) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(UN)).sendKeys(UN1);
        wait.until(ExpectedConditions.elementToBeClickable(PWD)).sendKeys(PWD1);
        wait.until(ExpectedConditions.elementToBeClickable(Login_Button)).click();
        Thread.sleep(5000);
        try
        {
        String title = driver.getTitle();
        System.out.println("Title:- "+title);
        s.assertTrue(title.contains("Empmonitor"));
        s.assertAll();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	System.out.println(e);
        }
    }
    
     public void Get_Error_Message(String UN1, String PWD1) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(UN)).sendKeys(UN1);
        wait.until(ExpectedConditions.elementToBeClickable(PWD)).sendKeys(PWD1);
        wait.until(ExpectedConditions.elementToBeClickable(Login_Button)).click();
        Thread.sleep(1000);
        try
        {
        	
        	String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(Error_Message)).getText();
            s.assertEquals(msg, "The user name or password is incorrect");
            s.assertAll();	
            System.out.println(msg);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
//        	System.out.println(e);
        }
    }   
}