package PageClases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Employee_Details_Page {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Employee_Details_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
//	Employee
	@FindBy (xpath="//*[@id='sidebar_menus']/li[2]/a/span") private WebElement Employee ;
	public void Employee_Click() throws InterruptedException
	{
		Thread.sleep(10);
		wait.until(ExpectedConditions.elementToBeClickable(Employee)).click();
	}
	
//	Employee_Details
	@FindBy (xpath="//span[@title='Employee-Details']") private WebElement Employee_Details;
	public void Employee_Details_Button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Employee_Details)).click();
	}
	
//	Register_Employee_Option
	@FindBy (id="add_btn") private WebElement Register_Employee_Option ;  
	public void Register_Employee_Option_Button()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Register_Employee_Button)).click();
	}
	
//	First_Name_TextBox
	@FindBy (css="[placeholder='Enter First Name']") private WebElement First_Name_TextBox; 
	public void First_Name_TextBox_Click(String First_Name)
	{
		wait.until(ExpectedConditions.elementToBeClickable(First_Name_TextBox)).sendKeys(First_Name);
	}
	
//	Last_Name_TextBox
	@FindBy (css="[placeholder='Enter Last Name']") private WebElement Last_Name_TextBox;   
	public void Last_Name_TextBox_Click(String Last_Name)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Last_Name_TextBox)).sendKeys(Last_Name);
	}
	
//	Mail_ID_TextBox 
	@FindBy (xpath="//input[@id='emp_email']") private WebElement Mail_ID_TextBox;     
	public void Mail_ID_TextBox_Click(String Mail_ID)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Mail_ID_TextBox)).sendKeys(Mail_ID);
	}
	
//	Password_Field
	@FindBy (xpath="//input[@id='passwd']") private WebElement Password_Field;   
	public void Pasword_Field_Click(String Password)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Password_Field)).sendKeys(Password);
	}
	
//	Confirm_Password_Field
	@FindBy (xpath ="//input[@id='c_passwd']") private WebElement Confirm_Password_Field;    
	public void Confirm_Password_Field_Click(String Password)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Confirm_Password_Field)).sendKeys(Password);
	}
	
//	Mobile_No_Code 
	@FindBy(xpath="(//div[@class='flag-container'])[1]") private WebElement mobileNoCode; // dropdown opener
	public void selectCountryByCode(String code)
	{
	    // Step 1: open dropdown
	    mobileNoCode.click();

	    // Step 2: dynamic xpath
	    String DD = "//li[@data-dial-code='" + code + "']";
//	    WebElement Country_Code_select=driver.findElement(By.xpath(DD));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(DD))).click();
	}
	
//	Mobile_No_TextBox
	@FindBy (xpath ="(//input[@onkeypress='return numbersOnly(event);'])[1]") private WebElement Mobile_No_TextBox; 
	public void Mobile_No_TextBox_Click(String Mobile_No)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Mobile_No_TextBox)).sendKeys(Mobile_No);
	}
	
//	Employee_code
	@FindBy (xpath="(//b[contains(text(),'Employee Code')]/../../input)[1]") private WebElement Employee_Code_Element;   
	public void Employee_Code_Click(String Employee_Code)
	{
		wait.until(ExpectedConditions.elementToBeClickable(Employee_Code_Element)).sendKeys(Employee_Code);
	}
	
	
//	Location_Dropdown 
	@FindBy (id="locations-addEmp") private WebElement Location_Dropdown;                  
	public void Select_Location_Dropdown(String Location_Name)
	{
		Select s=new Select(Location_Dropdown);
		s.selectByVisibleText(Location_Name);
	}
	
//	Select the Role
	@FindBy (xpath="//*[@id=\"emp-register\"]/div[1]/div/div[9]/div/span[1]/span[1]/span/ul") private List<WebElement> Role;
	public void Select_Role(String Role_Name) { 
		for(WebElement Single_Role:Role)
		{
			String Single_role_Text=Single_Role.getText();
			if(Single_role_Text.contains(Role_Name) || Single_role_Text.equals(Role_Name))
			{
				Single_Role.click();
				break;
			}
		}
	}
	
//	Select The Department
	@FindBy (name="departement_name") private WebElement Department_Dropdown;
	public void Select_Department_Dropdown(String Department_Name)
	{
		Select s=new Select(Department_Dropdown);
		s.selectByVisibleText(Department_Name);
	}
	
//	Select TimeZone
	@FindBy (id="timeZoneAppend") private WebElement TimeZone_Dropdown;
	public void Select_Timezone_Dropdown(String Timezone_Name)
	{
		Select s=new Select(TimeZone_Dropdown);
		s.selectByVisibleText(Timezone_Name);
	}
	
//	Select Shift
	@FindBy (id="Shiftfilteradd") private WebElement Shift_Dropdown;
	public void Select_Shift_Dropdown(String Shift_Name)
	{
		Select s=new Select(Shift_Dropdown);
		s.selectByVisibleText(Shift_Name);
	}
	
//	Click Register Employee
	@FindBy (id="EmpReg_departments") private WebElement Register_Employee_Button;
	public void Register_Employee_Button_Click()
	{
		wait.until(ExpectedConditions.elementToBeClickable(Register_Employee_Button)).click();
	}
}
