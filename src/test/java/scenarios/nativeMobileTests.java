package scenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.pages.epamapp.BudgetActivityPage;
import pageObjects.pages.epamapp.SignInPage;
import setup.BaseTest;
import testdata.DataProviders;

public class nativeMobileTests extends BaseTest {

    @Test(enabled = true, groups = {"native"}, description = "Login test after registration new account",
          dataProvider = "dataForNativeTest", dataProviderClass = DataProviders.class)
    public void loginAfterRegistrationNewUserTest(String email, String username, String password){
        SignInPage signInPage =  new SignInPage(getDriver());
        signInPage.clickRegistrationButton();
        signInPage.fillRegistrationEmailField(email);
        signInPage.fillRegistrationUsernameField(username);
        signInPage.fillRegistrationPasswordField(password);
        signInPage.confirmPassword(password);
        signInPage.clickRegistrationNewAccountButton();
        signInPage.fillLoginField(email);
        signInPage.fillPasswordField(password);
        signInPage.clickSightInButton();

        Assert.assertTrue(new BudgetActivityPage(getDriver())
            .checkAddNewExpenseButtonIsDisplayed());

        System.out.println("Registration new account and login test done");
    }


    @Test(enabled = false, groups = {"native"}, description = "This simple test just click on the Sign In button")
    public void simpleNativeTest() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        getPo().getWelement("signInBtn").click();
        System.out.println("Simplest Android native test done");

    }

}
