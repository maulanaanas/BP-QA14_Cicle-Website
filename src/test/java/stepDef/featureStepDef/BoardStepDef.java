package stepDef.featureStepDef;

import element.BoardPage;
import element.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static stepDef.baseAction.Hooks.webDriver;

public class BoardStepDef {

    @Then("I on Kanban Board")
    public void iOnKanbanBoard() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertEquals("Board - QA-14-BP-D", homePage.getVerifyKanbanBoard());
    }

    @And("I click Add List button")
    public void iClickAddListButton() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickAddListButton();
    }

    @And("I fill name list with {string}")
    public void iFillNameListWith(String listName) {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.setInputListNameField(listName);
        boardPage.clickCreateButton();
    }

    @Then("I success add list on Kanban Board")
    public void iSuccessAddListOnKanbanBoard() {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Creating list is success", boardPage.getVerifyNotification());
    }

    @And("I click Add Card on list")
    public void iClickAddCardOnList() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickAddCardButton();
    }

    @And("I fill name card with {string}")
    public void iFillNameCardWith(String cardName) {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.inputCardNameField(cardName);
        boardPage.clickCreateButton();
    }

    @Then("I success add card on Kanban Board")
    public void iSuccessAddCardOnKanbanBoard() {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Creating card is success", boardPage.getVerifyNotification());
    }

    @And("I click one card")
    public void iClickOneCard() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickCardZero();
    }

    @And("I type a notes")
    public void iTypeANotes() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.inputNotesField();
    }

    @Then("I success add notes on card")
    public void iSuccessAddNotesOnCard() {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Update card is success", boardPage.getVerifyNotification());
    }

    @And("I click three dots symbol on first list")
    public void iClickThreeDotsSymbolOnFirstList() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickThreeDotsButton();
    }

    @And("I click Set as a Complete List")
    public void iClickSetAsACompleteList() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickSetCompleteListButton();
    }

    @Then("My list has been checked green")
    public void myListHasBeenCheckedGreen() {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Set list as Complete is success", boardPage.getVerifyNotification());
    }

    @Then("I see notification failed create a list")
    public void iSeeNotificationFailedCreateAList() {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("List name cannot be empty", boardPage.getVerifyNotification());
    }

    @Then("I see notifictaion failed add card on Kanban Board")
    public void iSeeNotifictaionFailedAddCardOnKanbanBoard() {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Card name cannot be empty", boardPage.getVerifyNotification());
    }

    @And("I click pencil button on any card")
    public void iClickPencilButtonOnAnyCard() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickPencilButton();
    }

    @And("I click Edit Labels")
    public void iClickEditLabels() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickEditLabelsButton();
        Thread.sleep(1000);
        boardPage.clickEditLabelsButton();
    }

    @And("I click plus symbol")
    public void iClickPlusSymbol() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickPlusSymbolButton();
    }

    @And("I fill Labels Name with {string}")
    public void iFillLabelsNameWith(String labelsName) {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.inputLabelsNameField(labelsName);
    }

    @And("I click Create button")
    public void iClickCreateButton() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickCreateButton();
    }

    @Then("I see notification failed to add labels")
    public void iSeeNotificationFailedToAddLabels() {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Label name cannot be empty!", boardPage.getVerifyNotification());
    }
}
