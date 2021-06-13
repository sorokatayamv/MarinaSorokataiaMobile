package pageObjects.pages.epamapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import pageObjects.NativePageObject;

public class BudgetActivityPage extends NativePageObject {

    public BudgetActivityPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "platkovsky.alexey.epamtestapp:id/add_new_expense")
    private WebElement addNewExpenseButton;

    public boolean checkAddNewExpenseButtonIsDisplayed(){
        return addNewExpenseButton.isDisplayed();
    }
}
