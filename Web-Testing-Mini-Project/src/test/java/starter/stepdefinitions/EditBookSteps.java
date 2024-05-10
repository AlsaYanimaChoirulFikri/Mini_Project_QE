package starter.stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.EditBookPage;

public class EditBookSteps {
    @Steps
    HomePage homePage;
    @Steps
    EditBookPage editBookPage;

    @When("I click the \"Ballpoint\" button")
    public void editButton(){
        homePage.clickEditButton();
    }

    @And("I input the valid title of the book for edit")
    public void newTitleBook(){
        editBookPage.editValidTitle("Love is Song");
    }

    @And("I input the valid author of the book for edit")
    public void newAuthorBook(){
        editBookPage.editValidAuthor("Indah Cahya");
    }

    @And("I input the valid publish year of the book for edit")
    public void newPublishYearBook() {
        editBookPage.editValidPublishYear("2024");
    }

    @Then("I submit the edit book creation form")
    public void clickSubmitEditBook(){
        editBookPage.clickSubmitEdit();
    }

    @And("I input the edited with empty title of the book for edit")
    public void newEmptyTitleBook(){
        editBookPage.emptyNewTitleBook(" ");
    }

    @And("I input the edited with empty author of the book for edit")
    public void newEmptyAuthorBook(){
        editBookPage.emptyNewAuthorBook(" ");
    }

    @And("I input the edited with empty publish year of the book for edit")
    public void newEmptyPublishYearBook(){
        editBookPage.emptyNewPublishYearBook(" ");
    }

    @And("I receive the error message for edited book")
    public void errorEditBookMessage(){
        editBookPage.seeErrorEditMessage();
    }
    @And("I input the invalid publish year of the book for edit")
    public void invalidEditBook(){
        editBookPage.enterInvalidPublishYear("eee");
    }
}
