//package PageClases;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeSuite;
//
//import Baseclasses.BaseClass;
//
//public class Loginpage extends BaseClass{
////	Login Page UN
//	@FindBy(id="amember-login") private WebElement UN;
////	LoginPage PWD
//	@FindBy (id="amember-pass") private WebElement PWD;
//	
////	LoginButton
//	@FindBy(xpath="//input[@value='Login']") private WebElement Loginbutton;
//	
//    
//	public Loginpage (WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
//
//	public WebElement getUN() {
//		return UN;
//	}
//
//	public void setUN(WebElement uN) {
//		UN = uN;
//	}
//
//	public WebElement getPWD() {
//		return PWD;
//	}
//
//	public void setPWD(WebElement pWD) {
//		PWD = pWD;
//	}
//	public void Login(String Username , String Password)
//	{
//		UN.sendKeys(Username);
//		PWD.sendKeys(Password);
//		Loginbutton.click();	
//	}
//}

package PageClases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

    @FindBy(id = "amember-login")
    private WebElement UN;

    @FindBy(id = "amember-pass")
    private WebElement PWD;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement Loginbutton;

    public Loginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) throws InterruptedException {
        UN.sendKeys(username);
        PWD.sendKeys(password);
        Thread.sleep(10000);
        Loginbutton.click();
    }
}
