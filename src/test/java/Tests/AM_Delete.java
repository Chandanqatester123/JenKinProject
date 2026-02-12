package Tests;

import org.testng.annotations.Test;

import Baseclasses.BaseClass;
import PageClases.Auto_Mail_Page;

public class AM_Delete extends BaseClass {

    @Test 
    public void autoMailDeleteTest() throws InterruptedException {
    	LoginAction l=new LoginAction();

    	l.VerifyUN_PWD();
    	Thread.sleep(10);
    	
    	Auto_Mail_Page autoMailPage = new Auto_Mail_Page(driver);

        autoMailPage.clickReports();
        autoMailPage.clickAutoEmailReports();
        autoMailPage.selectEntries("200");
        autoMailPage.deleteAllReports();
    }
}
