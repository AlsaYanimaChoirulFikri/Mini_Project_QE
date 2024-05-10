package starter.stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.CreateNewBookPage;
import starter.pages.HomePage;

public class CreateNewBookSteps {

    @Steps
    HomePage homePage;
    @Steps
    CreateNewBookPage createNewBookPage;

    @Given("The Mini Book Store is opened")
    public void onTheHomePage() {
        homePage.openUrl("https://mini-book-store-fe.vercel.app/");
        Assertions.assertTrue(homePage.validateOnHomePage());
    }

    @When("I click the Add New Book button")
    public void clickAddNewBookButton() {
        homePage.clickNewBookButton();
    }

    @And("I input the valid title of the book")
    public void enterValidTitleBook(){
        createNewBookPage.enterValidTitleBook("Love is You");
    }

    @And("I input the valid author of the book")
    public void enterValidAuthorBook(){
        createNewBookPage.enterValidAuthorBook("Indah Cahya");
    }

    @And("I input the valid publish year of the book")
    public void enterValidPublishYearBook(){
        createNewBookPage.enterValidPublishYearBook("2022");
    }

    @Then("I submit the book creation form")
    public void submitNewBook(){
        createNewBookPage.submitNewBook();
    }

    @And("I input the empty title of the book")
    public void enterEmptyTitleBook(){
        createNewBookPage.enterEmptyTitleBook();
    }

    @And("I input the empty author of the book")
    public void enterEmptyAuthorBook(){
        createNewBookPage.enterEmptyAuthorBook();
    }

    @And("I input the empty publish year of the book")
    public void enterEmptyPublishYearBook(){
        createNewBookPage.enterEmptyPubishYearBook();
    }

    @And("I input the invalid publish year of the book")
    public void enterInvalidPublishYearBook(){
        createNewBookPage.enterInvalidPublishYearBook("NewBook");
    }

    @And("I receive the error message")
    public void seeErrorMessage(){
        createNewBookPage.errorMessageDisplayed();
    }

}
