package Tests;
// package Utils;

import org.testng.annotations.Test; // ✅ correct

import PageClases.Login_VS_Code;
import Utils.Config_reader;

public class Login_Action_Verify_Valid_Invalid extends Config_reader
{ 
    Login_VS_Code login;

    @Test
    public void Login_Action_Verify_Valid_Test() throws InterruptedException {

        login = new Login_VS_Code(driver); // ✅ after driver init
        login.Login_Action_With_PWD(getUN1(), getPWD1());

        System.out.println("Valid Test PASS");
    }

    @Test
    public void Login_Action_Verify_Invalid_Test() throws InterruptedException {

        login = new Login_VS_Code(driver); // ✅ again fresh
        login.Get_Error_Message(getInvalid_UN(), getInvalid_PWD());

        System.out.println("Invalid Test PASS");
        // System.out.println("TC is PASS");
    }

    
}
