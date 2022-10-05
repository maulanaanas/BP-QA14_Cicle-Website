package stepDef.baseAction;

import element.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver webDriver;

    @Before
    public static void openWebBrowser(){
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Profile 1");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
//        chrome_options.addArguments("--incognito");
        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=C:\\Users\\maula\\AppData\\Local\\Google\\Chrome\\User Data\\");

        System.setProperty("webdriver.chrome.driver", "D:\\webDriver\\chromedriver.exe");
        webDriver = new ChromeDriver(chrome_options);
        webDriver.manage().window().maximize();
        webDriver.get("https://staging.cicle.app/");
    }

    @After
    public static void closeWebBrowser(){
        webDriver.quit();
    }

    @Given("I already on Cicle Staging Homepage")
    public void iAlreadyOnCicleStagingHomepage() {
        Assert.assertEquals("Home", webDriver.getTitle());
    }


}
