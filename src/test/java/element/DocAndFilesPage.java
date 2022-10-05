package element;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DocAndFilesPage extends Helper{
    WebDriver webDriver;

    private Faker faker = new Faker();
    private String fileName = faker.lordOfTheRings().character();
    private String content = faker.lorem().paragraph();

    public DocAndFilesPage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//p[normalize-space()='Add Item Here']")
    private WebElement addItemHereButon;

    @FindBy(xpath = "//p[normalize-space()='Create a New Folder']")
    private WebElement createANewFolderButton;

    @FindBy(xpath = "//input[@placeholder='Input folder name...']")
    private WebElement inputFolderNameField;

    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement saveButton;

    @FindBy(id = "notistack-snackbar")
    private WebElement verifyNotification;

    @FindBy(xpath = "//p[normalize-space()='Add a New Doc']")
    private WebElement createANewDocButton;

    @FindBy(xpath = "//textarea[@placeholder='Type a title...']")
    private WebElement titleDocField;

    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    private WebElement contentDocField;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement uploadFilesButton;

    public void chooseCreateAFolder(){
        wait.until(ExpectedConditions.visibilityOf(addItemHereButon));
        addItemHereButon.click();
        createANewFolderButton.click();
    }

    public void fillInputFolderNameField(){
        inputFolderNameField.sendKeys(fileName);
        saveButton.click();
    }

    public String getVerifyNotification(){
        wait.until(ExpectedConditions.visibilityOf(verifyNotification));
        return verifyNotification.getText();
    }

    public void chooseCreateADoc(){
        wait.until(ExpectedConditions.visibilityOf(addItemHereButon));
        addItemHereButon.click();
        createANewDocButton.click();
    }

    public void fillDocContent(){
        wait.until(ExpectedConditions.visibilityOf(titleDocField));
        titleDocField.sendKeys(fileName);
        contentDocField.sendKeys(content);
        saveButton.click();
    }

    public void clickUploadFileButton(){
        wait.until(ExpectedConditions.visibilityOf(addItemHereButon));
        addItemHereButon.click();
        uploadFilesButton.sendKeys("C:\\Users\\maula\\Downloads\\Sekolah QA.png");
    }

    public void chooseCreateAFolderEmpty(){
        inputFolderNameField.sendKeys("");
        saveButton.click();
    }
}
