package pageObjects.pages.google;

import io.appium.java_client.AppiumDriver;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.WebPageObject;

public class GoogleHomePage extends WebPageObject {

    WebDriver driver;

    private final static String GOOGLE_URL = "https://www.google.com";

    public GoogleHomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    @FindBy(xpath = "//form[@name='gs']/div[1]/div[1]/div[2]/div/div[2]")
    private List<WebElement> suggestResults;

    public void openGoogleHomePage(String url){
        driver.get(url);
    }

    public void fillSearchField(String request){
        searchField.sendKeys(request);
    }

    public List<WebElement> getSuggestResults(){
        return suggestResults;
    }

}
