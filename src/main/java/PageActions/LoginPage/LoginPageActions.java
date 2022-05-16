package PageActions.LoginPage;

import CommonUtils.CommonFunctions;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.TagName;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ResourceBundle;

public class LoginPageActions {


    WebDriver driver ;
    ResourceBundle resourceBundle;
    public LoginPageActions(WebDriver driver){
        this.driver=driver;
        String packageName= getClass().getPackage().getName().replace("Actions","_OR");;
        String resourceName= getClass().getSimpleName().replace("Actions","_OR");
        resourceBundle= ResourceBundle.getBundle(packageName+"."+resourceName);

    }

    public static LoginPageActions getInstance(WebDriver driver){
      return new LoginPageActions(driver);
    }
    public void validateLinkIsVisible(String LinkName ){
        String linkLocator= resourceBundle.getString(LinkName);
        Assert.assertTrue(CommonFunctions.getInstance(driver).isPresent(linkLocator));
    }
    public void enterUserName(String userName ){
        String userNameLocator= resourceBundle.getString("loginEmail");
        CommonFunctions.getInstance(driver).getElement(userNameLocator).sendKeys(userName);

}
    public void enterPassword(String password ){
        String pwdLocator= resourceBundle.getString("loginPassword");
        CommonFunctions.getInstance(driver).getElement(pwdLocator).sendKeys(password);

    }
    public void clickLogin( ){
        String submittButtonLocator= resourceBundle.getString("loginSubmit");
        CommonFunctions.getInstance(driver).getElement(submittButtonLocator).click();

    }

    public void enterSignUserName(String usrname ){
        String userNameLocator= resourceBundle.getString("signUpName");
        CommonFunctions.getInstance(driver).getElement(userNameLocator).sendKeys(usrname);

    }
    public void enterSignUpEmail(String email ){
        String enterSignUpEmailLocator= resourceBundle.getString("signUpEmail");
        CommonFunctions.getInstance(driver).getElement(enterSignUpEmailLocator).sendKeys(email);

    }
    public void clickSignUp( ){
        String signUpButtonLocator= resourceBundle.getString("signUpSubmit");
        CommonFunctions.getInstance(driver).getElement(signUpButtonLocator).click();

    }


}
