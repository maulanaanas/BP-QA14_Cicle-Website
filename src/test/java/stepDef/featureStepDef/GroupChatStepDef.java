package stepDef.featureStepDef;

import element.GroupChatPage;
import element.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static stepDef.baseAction.Hooks.webDriver;

public class GroupChatStepDef {

    @When("I click QA teams")
    public void iClickTeams() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCardQA14();
    }
    @And("I click Group Chat")
    public void iClickGroupChat() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCardGroupChat();
    }

    @Then("I on Group Chat page")
    public void iOnGroupChatPage() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertEquals("Group Chat - QA-14-BP-D", homePage.getVerifyGroupChatBoard());
    }

    @And("Fill text message")
    public void fillTextMessage() {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        groupChatPage.inputMessageField();
    }

    @And("I click send")
    public void iClickSend() {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        groupChatPage.clickSendMessageButton();
    }

    @Then("My message has been sent")
    public void myMessageHasBeenSent() {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Assert.assertEquals("just now", groupChatPage.getVerifySentMessage());
    }

    @And("I choose one message")
    public void iChooseOneMessage() {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        groupChatPage.clickMessageOptionButton();
    }

    @And("I click delete")
    public void iClickDelete() {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        groupChatPage.clickDeleteMessageOption();
    }

    @Then("My message has been deleted")
    public void myMessageHasBeenDeleted() {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Assert.assertEquals("Delete group chat message success", groupChatPage.getVerifyNotification());
    }

    @And("I click paper clip button and choose a file")
    public void iClickPaperClipButtonAndChooseAFile() {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        groupChatPage.clickUploadFileButton();
    }

    @Then("My file has been uploaded")
    public void myFileHasBeenUploaded() {
        GroupChatPage groupChatPage = new GroupChatPage(webDriver);
        Assert.assertEquals("Upload attachments is success", groupChatPage.getVerifyNotification());
    }
}
