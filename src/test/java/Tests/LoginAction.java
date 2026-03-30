//package Tests;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//
//import Baseclasses.BaseClass;
//import PageClases.Homepage;
//import PageClases.Loginpage;
//
//public class LoginAction extends Loginpage {
//	
//	Loginpage h;
//	BaseClass b;
//	public LoginAction(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Test
//	public void VerifyUN_PWD()
//	{
////		Verify Login
//		h=new Loginpage(new ChromeDriver());
//		b=new BaseClass();
//		h.Login(b.getUN1(), b.getPWD1());
//		Reporter.log("TC is Pass");
//	}
//
//}

package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Baseclasses.BaseClass;
import PageClases.Loginpage;

public class LoginAction extends BaseClass {

    WebDriver driver;
    Loginpage lp;

    @Test
    public void VerifyUN_PWD() throws InterruptedException {

        driver = new ChromeDriver();
        lp = new Loginpage(driver);

        lp.login("Chandan", "Raut");
        Thread.sleep(10000);

//        Reporter.log("TC is Pass");
    }
}