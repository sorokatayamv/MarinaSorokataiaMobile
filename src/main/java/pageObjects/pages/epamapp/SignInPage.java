package pageObjects.pages.epamapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import pageObjects.NativePageObject;

public class SignInPage extends NativePageObject {

    public SignInPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_email")
    private WebElement loginField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/login_pwd")
    private WebElement passwordField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/email_sign_in_button")
    private WebElement signInButton;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_button")
    private WebElement registrationButton;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_email")
    private WebElement registrationEmailField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_password")
    private WebElement registrationPasswordField;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_confirm_password")
    private WebElement registrationPasswordConfirm;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/register_new_account_button")
    private WebElement registrationNewAccountButton;

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/registration_username")
    private WebElement usernameRegistrationField;

    public void fillLoginField(String email){
        loginField.sendKeys(email);
    }

    public void fillPasswordField(String pass){
        passwordField.sendKeys(pass);
    }

    public void clickRegistrationButton(){
        registrationButton.click();
    }

    public void clickSightInButton(){
        signInButton.click();
    }

    public void fillRegistrationEmailField(String email){
        registrationEmailField.sendKeys(email);
    }

    public void fillRegistrationUsernameField(String username){
        usernameRegistrationField.sendKeys(username);
    }

    public void fillRegistrationPasswordField(String password){
        registrationPasswordField.sendKeys(password);
    }

    public void confirmPassword(String password){
        registrationPasswordConfirm.sendKeys(password);
    }

    public void clickRegistrationNewAccountButton(){
        registrationNewAccountButton.click();
    }
}
