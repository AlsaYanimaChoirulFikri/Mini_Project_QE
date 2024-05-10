package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import net.serenitybdd.annotations.Steps;
import starter.pages.InfoBookPage;
import starter.pages.HomePage;

public class InfoBookSteps {
    @Steps
    HomePage homePage;
    @Steps
    InfoBookPage infoBookPage;

    @When("I click the \"i\" in the list of books")
    public void informationBooks(){
        homePage.clickInformation();
    }

    @Then("I can see the information from the book")
    public void seeBookInformation(){
        infoBookPage.bookInformation();
    }

}
