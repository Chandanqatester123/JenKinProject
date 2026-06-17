package Baseclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Shreekant { 
	@Test 
	public void M1() throws InterruptedException, IOException {
		System.out.println("Chandan");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Upload=wait.until(ExpectedConditions.elementToBeClickable((By.id("drag-drop-upload"))));
		Upload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\chand\\Music\\FileUploadPopup.exe");
		
		Thread.sleep(5000);
		
		
	}

}
