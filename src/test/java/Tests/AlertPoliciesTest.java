package Tests;

import org.testng.annotations.Test;

import Baseclasses.BaseClass;
import PageClases.AlertPoliciesPage;
import PageClases.Loginpage;

public class AlertPoliciesTest extends BaseClass {

    @Test
    public void deleteAlertPolicyTest() throws InterruptedException {

        // Login (reuse your LoginPage)
        Loginpage login = new Loginpage(driver);
        login.login(getUN1(), getPWD1());

        // Navigate & Delete
        AlertPoliciesPage alertPage = new AlertPoliciesPage(driver);
        alertPage.clickBehaviour();
        alertPage.clickAlertPolicies();
        alertPage.deleteAlertPolicy();
    }
}
