package starter.stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.DeleteBookPage;

public class DeleteBookSteps {
    @Steps
    HomePage homePage;
    @Steps
    DeleteBookPage deleteBookPage;

    @When("I click the \"Trash\" button")
    public void deleteButton(){
        homePage.clickDeleteButton();
    }

    @Then("I click the delete button")
    public void clickDeleteButton(){
        deleteBookPage.deleteButtonClick();
    }

    @And("The book has been deleted")
    public void bookDeleted(){
        deleteBookPage.bookHasBeenDeleted();
    }
}
