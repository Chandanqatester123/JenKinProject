package PageClases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPoliciesPage {

    WebDriver driver;
    WebDriverWait wait;

    public AlertPoliciesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By behaviourMenu = By.xpath("//i[@title='Behaviour']");
    private By alertPoliciesOption = By.xpath("//*[contains(text(),'Alert Policies')]");
    private By deletePolicyIcon = By.xpath("//*[@title='Delete Alerts Policies']/i");
    private By confirmDeleteButton = By.xpath("//button[contains(text(),'Yes')]");

    // Actions

    public void clickBehaviour() {
        wait.until(ExpectedConditions.elementToBeClickable(behaviourMenu)).click();
    }

    public void clickAlertPolicies() {
        wait.until(ExpectedConditions.elementToBeClickable(alertPoliciesOption)).click();
    }

    public void deleteAlertPolicy() {
        WebElement deleteIcon = wait.until(
                ExpectedConditions.elementToBeClickable(deletePolicyIcon));
        deleteIcon.click();

        // Handle confirmation popup (instead of Robot)
        wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
    }
}
