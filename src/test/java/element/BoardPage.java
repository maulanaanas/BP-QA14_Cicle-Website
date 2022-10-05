package element;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BoardPage extends Helper {

    WebDriver webDriver;

    private Faker faker = new Faker();
    private String notes = faker.lorem().paragraph();

    public BoardPage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//button[contains(@type, \"button\")]")
    private WebElement addListButton;

    @FindBy(xpath = "//input[@placeholder='Input list name...']")
    private WebElement listNameField;

    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement createButton;

    @FindBy(id = "notistack-snackbar")
    private WebElement verifyNotification;

    @FindBy(xpath = "//a[contains(text(), \"Add Card\")]")
    private WebElement addCardButton;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    private WebElement cardNameField;

    @FindBy(xpath = "//div[@id='listcard_content-0']/div[1]/div[1]/div[1]/a[1]")
    private WebElement cardZero;

    @FindBy(xpath = "//div[@class='ManageDesc_sectionEmptyDesc__md0ll']")
    private WebElement notesField;

    @FindBy(xpath = "//div[contains(text(),'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@class='fr-element fr-view']//p")
    private WebElement inputNotesField;

    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[1]/div[1]/div[1]/div[1]" +
            "/div[2]/div[1]")
    private WebElement threeDotsButton;

    @FindBy(xpath = "//p[normalize-space()='Set as a Complete List']")
    private WebElement setCompleteListButton;

    @FindBy(id = "editCardMenu")
    private WebElement pencilButton;

    @FindBy(id = "editCardMenuButton__Label__text")
    private WebElement editLabelsButton;

    @FindBy(xpath = "//div[@class='ToggleLabels_plusButton__3YgnQ']")
    private WebElement plusSymbolButton;

    @FindBy(xpath = "//input[@placeholder='Input name']")
    private WebElement labelsNameField;

    public void clickAddListButton(){
        wait.until(ExpectedConditions.visibilityOf(addListButton));
        addListButton.click();
    }

    public void setInputListNameField(String listName){
        listNameField.sendKeys(listName);
    }

    public String getVerifyNotification(){
        wait.until(ExpectedConditions.visibilityOf(verifyNotification));
        return verifyNotification.getText();
    }

    public void clickAddCardButton(){
        wait.until(ExpectedConditions.visibilityOf(addCardButton));
        addCardButton.click();
    }

    public void inputCardNameField(String cardName){
        cardNameField.sendKeys(cardName);
    }

    public void clickCreateButton(){
        createButton.click();
    }

    public void clickCardZero(){
        wait.until(ExpectedConditions.visibilityOf(cardZero));
        cardZero.click();
    }

    public void inputNotesField(){
        wait.until(ExpectedConditions.visibilityOf(notesField));
        notesField.click();
        inputNotesField.sendKeys(notes);
        saveButton.click();
    }

    public void clickThreeDotsButton(){
        wait.until(ExpectedConditions.visibilityOf(threeDotsButton));
        threeDotsButton.click();
    }

    public void clickSetCompleteListButton(){
        setCompleteListButton.click();
    }

    public void clickPencilButton(){
        wait.until(ExpectedConditions.visibilityOf(pencilButton));
        pencilButton.click();
    }

    public void clickEditLabelsButton(){
        editLabelsButton.click();
    }

    public void clickPlusSymbolButton(){
        wait.until(ExpectedConditions.visibilityOf(plusSymbolButton));
        plusSymbolButton.click();
    }

    public void inputLabelsNameField(String labelsName){
        labelsNameField.sendKeys(labelsName);
    }
}
