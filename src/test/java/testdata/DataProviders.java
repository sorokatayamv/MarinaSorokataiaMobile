package testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.testng.annotations.DataProvider;

public class DataProviders {

    private static Properties testDataProps;
    private static String testDataPropsPath = "src/test/resources/test.properties";

    @DataProvider(name = "dataForNativeTest")
    public Object[][] dataForNativeTest() {
        return new Object[][]{
            {getTestData().getProperty("email"),
                getTestData().getProperty("username"),
                getTestData().getProperty("password")},
        };
    }

    @DataProvider(name = "dataForWebTest")
    public Object[][] getDataForWebTest() {
        return new Object[][]{
            {getTestData().getProperty("url"),
                getTestData().getProperty("searchRequest")},
        };
    }

    static {
        testDataProps = new Properties();
        try (InputStream in = new FileInputStream(testDataPropsPath)) {
            testDataProps.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Properties getTestData(){
        return testDataProps;
    }
}
