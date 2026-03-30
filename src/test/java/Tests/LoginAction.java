//
//package Tests;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//
//import Baseclasses.BaseClass;
//import PageClases.Loginpage;
//
//public class LoginAction extends BaseClass {
//
//    WebDriver driver;
//    Loginpage lp;
//
//    @Test
//    public void VerifyUN_PWD() throws InterruptedException {
//
//        driver = new ChromeDriver();
//        lp = new Loginpage(driver);
//
//        lp.login("Chandan", "Raut");
//        Thread.sleep(10000);
//
////        Reporter.log("TC is Pass");
//    }
//}