package stepDef.featureStepDef;

import element.HomePage;
import io.cucumber.java.en.And;

import static stepDef.baseAction.Hooks.webDriver;

public class HelperStepDef {
    @And("I click Board")
    public void iClickBoard()  {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickCardBoard();
    }
}
