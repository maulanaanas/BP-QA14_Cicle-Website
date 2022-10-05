package stepDef.featureStepDef;

import element.DocAndFilesPage;
import element.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static stepDef.baseAction.Hooks.webDriver;

public class DocAndFilesStepDef {

    @And("I click Doc and Files")
    public void iClickDocAndFiles() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCardDocsAndFiles();
    }

    @Then("I on Doc and Files page")
    public void iOnDocAndFilesPage() {
        HomePage homePage = new HomePage(webDriver);
        Assert.assertEquals("Docs & Files", homePage.getVerifyDocsAndFiles());
    }

    @And("I choose Create a New Folder")
    public void iChooseCreateANewFolder() {
        DocAndFilesPage docAndFilesPage = new DocAndFilesPage(webDriver);
        docAndFilesPage.chooseCreateAFolder();
    }

    @And("I fill the folder name")
    public void iFillTheFolderName() {
        DocAndFilesPage docAndFilesPage = new DocAndFilesPage(webDriver);
        docAndFilesPage.fillInputFolderNameField();
    }

    @Then("My folder has been created")
    public void myFolderHasBeenCreated() {
        DocAndFilesPage docAndFilesPage = new DocAndFilesPage(webDriver);
        Assert.assertEquals("Create bucket successful", docAndFilesPage.getVerifyNotification());
    }

    @And("I choose Add a New Doc")
    public void iChooseAddANewDoc() {
        DocAndFilesPage docAndFilesPage = new DocAndFilesPage(webDriver);
        docAndFilesPage.chooseCreateADoc();
    }

    @And("I fill title and content of document")
    public void iFillTitleAndContentOfDocument() {
        DocAndFilesPage docAndFilesPage = new DocAndFilesPage(webDriver);
        docAndFilesPage.fillDocContent();
    }

    @Then("My document has been created")
    public void myDocumentHasBeenCreated() {
        DocAndFilesPage docAndFilesPage = new DocAndFilesPage(webDriver);
        Assert.assertEquals("Create doc successful", docAndFilesPage.getVerifyNotification());
    }

    @And("I choose Upload Files to upload")
    public void iChooseUploadFilesToUpload() {
        DocAndFilesPage docAndFilesPage = new DocAndFilesPage(webDriver);
        docAndFilesPage.clickUploadFileButton();
    }

    @Then("My files has been uploaded")
    public void myFilesHasBeenUploaded() {
        DocAndFilesPage docAndFilesPage = new DocAndFilesPage(webDriver);
        Assert.assertEquals("Create files successful", docAndFilesPage.getVerifyNotification());
    }

    @And("I don't fill the name folder")
    public void iDonTFillTheNameFolder() {
        DocAndFilesPage docAndFilesPage = new DocAndFilesPage(webDriver);
        docAndFilesPage.chooseCreateAFolderEmpty();
    }

    @Then("I see notification Folder name cannot be empty")
    public void iSeeNotificationFolderNameCannotBeEmpty() {
        DocAndFilesPage docAndFilesPage = new DocAndFilesPage(webDriver);
        Assert.assertEquals("Folder name cannot be empty", docAndFilesPage.getVerifyNotification());
    }
}
