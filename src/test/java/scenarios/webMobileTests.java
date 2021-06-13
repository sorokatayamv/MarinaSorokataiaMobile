package scenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.pages.google.GoogleHomePage;
import setup.BaseTest;
import testdata.DataProviders;

public class webMobileTests extends BaseTest {

    @Test(enabled = true, groups = {"web"}, description = "Check if {expression} is in google search suggestion",
          dataProvider = "dataForWebTest", dataProviderClass = DataProviders.class)
    public void googleSearchTest(String url, String searchRequest){
        GoogleHomePage googleHomePage = new GoogleHomePage(getDriver());
        getDriver().get(url);
        googleHomePage.fillSearchField(searchRequest);

        Assert.assertTrue(googleHomePage.getSuggestResults().size() > 0);

        System.out.println("Google search test done");
    }

    @Test(enabled = false,groups = {"web"}, description = "Make sure that we've opened IANA homepage")
    public void simpleWebTest() throws InterruptedException {
        getDriver().get("http://iana.org"); // open IANA homepage

        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 10).until(
            wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );

        // Check IANA homepage title
        assert ((WebDriver) getDriver()).getTitle().equals("Internet Assigned Numbers Authority") : "This is not IANA homepage";

        // Log that test finished
        System.out.println("Site opening done");
    }

}
