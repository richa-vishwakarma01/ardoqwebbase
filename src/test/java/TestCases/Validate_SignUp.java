package TestCases;

import CustomeReports.CustomeReporter;
import Executor.BaseTest;
import PageActions.LoginPage.LoginPageActions;
import org.testng.annotations.Test;

public class Validate_SignUp extends BaseTest {


    @Test
    public void Validate_SignUp(){

//        String usr=TestDataReader.getTestData("validate_broken_links_on_Home_Page", "userName");
        LoginPageActions.getInstance(driver).validateLinkIsVisible("Home");
        CustomeReporter.report_Status_Pass("Home Links is  Validated Sucessfully");

        LoginPageActions.getInstance(driver).validateLinkIsVisible("SignIn");
        CustomeReporter.report_Status_Pass("Sign in Links is  Validated Sucessfully");

        LoginPageActions.getInstance(driver).validateLinkIsVisible("SignUp");

        CustomeReporter.report_Status_Pass("Sign up Links is  Validated Sucessfully");

    }



}
