package element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Helper{

    public HomePage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Sekolah QA']")
    private WebElement verifyHomePage;

    @FindBy(xpath = "//h1[contains(text(), \"QA-14-BP-D\")]")
    private WebElement cardQA14;

    @FindBy(xpath = "//h1[normalize-space()='Board']")
    private WebElement cardBoard;

    @FindBy(xpath = "//h1[normalize-space()='Board - QA-14-BP-D']")
    private WebElement verifyKanbanBoard;

    @FindBy(xpath = "//h1[normalize-space()='Group Chat']")
    private WebElement cardGroupChat;

    @FindBy(xpath = "//h1[normalize-space()='Group Chat - QA-14-BP-D']")
    private WebElement verifyGroupChat;

    @FindBy(xpath = "//h1[normalize-space()='Docs & Files']")
    private WebElement cardDocsAndFiles;

    @FindBy(xpath = "//h1[normalize-space()='Docs & Files']")
    private WebElement verifyDocsAndFiles;

    public void clickCardQA14(){
        wait.until(ExpectedConditions.visibilityOf(cardQA14));
        cardQA14.click();
    }

    public void clickCardBoard(){
        wait.until(ExpectedConditions.visibilityOf(cardBoard));
        cardBoard.click();
    }

    public String getVerifyKanbanBoard(){
        return verifyKanbanBoard.getText();
    }

    public void clickCardGroupChat(){
        wait.until(ExpectedConditions.visibilityOf(cardGroupChat));
        cardGroupChat.click();
    }

    public String getVerifyGroupChatBoard(){
        return verifyGroupChat.getText();
    }

    public void clickCardDocsAndFiles(){
        wait.until(ExpectedConditions.visibilityOf(cardDocsAndFiles));
        cardDocsAndFiles.click();
    }

    public String getVerifyDocsAndFiles(){
        wait.until(ExpectedConditions.visibilityOf(verifyDocsAndFiles));
        return verifyDocsAndFiles.getText();
    }
}
