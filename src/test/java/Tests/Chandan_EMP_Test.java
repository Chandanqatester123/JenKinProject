package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Baseclasses.BaseClass;

public class Chandan_EMP_Test extends BaseClass {
	@Test
	public void Login_Action_Test() throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
////		options.addArguments("--headless=new"); // IMPORTANT
////		options.addArguments("--no-sandbox");
////		options.addArguments("--disable-dev-shm-usage");
//
//		WebDriver driver = new ChromeDriver(options);
////		WebDriver driver=new ChromeDriver();
//		driver.get("https://app.empmonitor.com/amember/member");
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ID=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='amember-login']"))));
		WebElement PWD=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='amember-pass']"))));
		WebElement Login_Button=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='Login']"))));
		ID.sendKeys(getUN1());
		PWD.sendKeys(getPWD1());
		
		Login_Button.click();
		
		Thread.sleep(5000);
		
		
		
		driver.quit();
		System.out.println("TC is PASS");
	}

}
