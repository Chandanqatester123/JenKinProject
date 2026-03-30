//package Tests;
//
//import org.testng.annotations.Test;
//
//import Baseclasses.BaseClass;
//import PageClases.Employee_Details_Page;
//import PageClases.Loginpage;
//
//public class Employee_Register_Action extends BaseClass{
//	@Test
//	public void Register_Employee() throws InterruptedException
//	{
//		LoginAction l=new LoginAction(driver);
//		l.VerifyUN_PWD();
//        
//		Employee_Details_Page EDP=new Employee_Details_Page(driver);
//		EDP.Employee_Click();
//		EDP.Employee_Details_Button();
//		EDP.Register_Employee_Option_Button();
//		EDP.First_Name_TextBox_Click(getFN());
//		EDP.Last_Name_TextBox_Click(getLN());
//		EDP.Mail_ID_TextBox_Click(getMailID());
//		EDP.Pasword_Field_Click(getPWD());
//		EDP.Confirm_Password_Field_Click(getPWD());
//		EDP.Employee_Code_Click(getEmployee_Code());
//		EDP.Select_Location_Dropdown(getLocation_Name());
//		EDP.Select_Role(getRole_Name());
//		EDP.Select_Department_Dropdown(getDepartment_name());
//		EDP.Select_Timezone_Dropdown(getTimeZone_No());
//		
//		Thread.sleep(5000);
//		EDP.Register_Employee_Button_Click();
//		
//		Thread.sleep(10000);
//		
//	}
//	
//	
//
//}
