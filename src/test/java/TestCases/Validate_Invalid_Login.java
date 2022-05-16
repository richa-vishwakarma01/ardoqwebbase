package TestCases;

import CustomeReports.CustomeReporter;
import Executor.BaseTest;
import Executor.TestDataReader;
import PageActions.LoginPage.LoginPageActions;
import org.testng.annotations.Test;

public class Validate_Invalid_Login extends BaseTest {


    @Test

    public void validate_invalid_login(){
        try {
            LoginPageActions.getInstance(driver).enterUserName(TestDataReader.getTestData("Validate_Invalid_Login", "UserName"));
            LoginPageActions.getInstance(driver).enterPassword(TestDataReader.getTestData("Validate_Invalid_Login", "Password"));
            CustomeReporter.report_Status_Pass("UserName and Password entered Sucessfully");

            LoginPageActions.getInstance(driver).clickLogin();
        }
        catch(Exception e){
            CustomeReporter.report_Status_Fail("UserName and Password not entered ");

        }

    }



}
