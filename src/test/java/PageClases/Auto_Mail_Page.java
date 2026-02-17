package PageClases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Auto_Mail_Page {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public Auto_Mail_Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By Setting_Button =By.xpath("//span[text()='Settings']");
    private By reportsMenu = By.xpath("//span[text()='Reports']");
    private By autoEmailReports = By.xpath("//a[@title='Auto Email Reports']");
    private By showEntriesDropdown = By.id("ShowEntriesList");
    private By deleteIcon = By.xpath("//i[@title='Delete Report']");
    private By confirmDeleteBtn = By.xpath("//button[text()='Yes, delete it!']");

    
    // Actions

    public void ClickSetting()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(Setting_Button)).click();
    }
    public void clickReports() {
        wait.until(ExpectedConditions.elementToBeClickable(reportsMenu)).click();
    }

    public void clickAutoEmailReports() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(autoEmailReports)).click();
    }

    public void selectEntries(String value) throws InterruptedException {
        Select select = new Select(wait.until(
                ExpectedConditions.visibilityOfElementLocated(showEntriesDropdown)));
        select.selectByVisibleText(value);
    }

    public void deleteAllReports() throws InterruptedException {

    	boolean value=true;
        while (value) {
        	
            List<WebElement> deleteButtons = driver.findElements(deleteIcon);

            if (deleteButtons.size() == 0) {
                System.out.println("No more reports to delete.");
                break;
            }

            wait.until(ExpectedConditions.elementToBeClickable(deleteButtons.get(0))).click();

            wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteBtn)).click();

            wait.until(ExpectedConditions.invisibilityOfElementLocated(confirmDeleteBtn));
        }
    }
}
