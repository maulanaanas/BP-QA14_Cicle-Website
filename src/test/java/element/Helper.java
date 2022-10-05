package element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {

    WebDriver webDriver;
    WebDriverWait wait;

    public Helper(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        this.wait = wait;
    }
}
