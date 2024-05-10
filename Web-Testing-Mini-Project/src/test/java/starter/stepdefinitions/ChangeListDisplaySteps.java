package starter.stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import net.serenitybdd.annotations.Steps;
import starter.pages.ChangeListDisplayPage;
import starter.pages.HomePage;
public class ChangeListDisplaySteps {
    @Steps
    HomePage homePage;
    @Steps
    ChangeListDisplayPage changeListDisplayPage;

    @When("I click the \"Card\" button")
    public void clickCardButton() {
        homePage.clickCardDisplayButton();
    }

    @And("I can see the book list has changed")
    public void bookListChanged(){
        changeListDisplayPage.theBookListChanged();
    }
}
