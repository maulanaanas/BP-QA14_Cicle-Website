package element;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GroupChatPage extends Helper{
    WebDriver webDriver;

    private Faker faker = new Faker();
    private String message = faker.lorem().paragraph();

    public GroupChatPage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[@class='fr-element fr-view']//p")
    private WebElement textMessageField;

    @FindBy(xpath = "//div[@class='CreateMessage_send__2f1ZQ']")
    private WebElement sendMessageButton;

    @FindBy(xpath = "//time[.='just now']")
    private  WebElement verifySentMessage;

    @FindBy(xpath = "//div[@class='Message_iconOption__3F-Ru']")
    private WebElement messageOptionButton;

    @FindBy(xpath = "//p[normalize-space()='Delete Message']")
    private WebElement deleteMessageOption;

    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement deleteButton;

    @FindBy(id = "notistack-snackbar")
    private WebElement verifyNotification;

    @FindBy(xpath = "//div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/" +
            "div[1]/div[1]")
    private WebElement lastBubble;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement uploadFileButton;

    public void inputMessageField(){
        wait.until(ExpectedConditions.visibilityOf(textMessageField));
        textMessageField.sendKeys(message);
    }

    public void clickSendMessageButton(){
        sendMessageButton.click();
    }

    public String getVerifySentMessage(){
        wait.until(ExpectedConditions.visibilityOf(verifySentMessage));
        return verifySentMessage.getText();
    }

    public void clickMessageOptionButton(){
        wait.until(ExpectedConditions.visibilityOf(textMessageField));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(lastBubble).perform();
        messageOptionButton.click();
    }

    public void clickDeleteMessageOption(){
        wait.until(ExpectedConditions.visibilityOf(deleteMessageOption));
        deleteMessageOption.click();
        deleteButton.click();
    }

    public String getVerifyNotification(){
        wait.until(ExpectedConditions.visibilityOf(verifyNotification));
        return verifyNotification.getText();
    }

    public void clickUploadFileButton(){
        wait.until(ExpectedConditions.visibilityOf(textMessageField));
        uploadFileButton.sendKeys("C:\\Users\\maula\\Downloads\\Sekolah QA.png");
    }
}
