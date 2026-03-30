//
//package PageClases;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//
//public class Loginpage {
//
//    WebDriver driver;
//
//    // Constructor
//    public Loginpage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);  // 🔥 VERY IMPORTANT
//    }
//    @FindBy(id = "amember-login")
//    private WebElement UN;
//
//    @FindBy(id = "amember-pass")
//    private WebElement PWD;
//
//    @FindBy(xpath = "//input[@value='Login']")
//    private WebElement Loginbutton;
//
//    public void login(String username, String password) throws InterruptedException {
//        UN.sendKeys(username);
//        PWD.sendKeys(password);
//        Loginbutton.click();
//    }
//}
