package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CreateNewBookPage extends PageObject{
    private By titleField(){
        return new By.ByXPath("//*[@id=\"title\"]");
    }

    private By authorField(){
        return new By.ByXPath("//*[@id=\"author\"]");
    }

    private By publishYearField(){
        return new By.ByXPath("//*[@id=\"publishYear\"]");
    }

    private By errorMessage(){
        return new By.ByXPath("//*[@id=\"root\"]/div[2]/div");
    }

    private By saveBookButton(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]/button");
    }



    @Step
    public void enterValidTitleBook(String title){
        $(titleField()).type(title);
    }
    @Step
    public void enterValidAuthorBook(String author){
        $(authorField()).type(author);
    }
    @Step
    public void enterValidPublishYearBook(String publishYear){
        $(publishYearField()).type(publishYear);
    }
    @Step
    public void submitNewBook(){
        $(saveBookButton()).click();
    }
    @Step
    public boolean enterEmptyTitleBook(){
        return $(titleField()).isDisplayed();
    }
    @Step
    public boolean enterEmptyAuthorBook(){
        return $(authorField()).isDisplayed();
    }
    @Step
    public boolean enterEmptyPubishYearBook(){
        return $(publishYearField()).isDisplayed();
    }
    @Step
    public WebElementFacade enterInvalidPublishYearBook(String author){
        return $(publishYearField()).type(author);
    }
    @Step
    public boolean errorMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }

}
