package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditBookPage extends PageObject{

    private By editTitleField(){
        return new By.ByXPath("//*[@id=\"title\"]");
    }
    private By editAuthorField(){
        return new By.ByXPath("//*[@id=\"author\"]");
    }
    private By editPublishYearField(){
        return new By.ByXPath("//*[@id=\"publishYear\"]");
    }
    private By submitEditBook(){
        return new By.ByXPath("//*[@id=\"root\"]/div[1]/div[2]/button");
    }
    private By errorForEditBookMessage(){
        return new By.ByXPath("//*[@id=\"root\"]/div[2]");
    }

    @Step
    public void editValidTitle(String newtitle){
        $(editTitleField()).type(newtitle);
    }
    @Step
    public void editValidAuthor(String newauthor){
        $(editAuthorField()).type(newauthor);
    }
    @Step
    public void editValidPublishYear(String newyear){
        $(editPublishYearField()).type(newyear);
    }
    @Step
    public void clickSubmitEdit(){
        $(submitEditBook()).click();
    }
    @Step
    public void emptyNewTitleBook(String invalidTitle){
        $(editTitleField()).type(invalidTitle);
    }
    @Step
    public void emptyNewAuthorBook(String invalidAuthor){
        $(editAuthorField()).type(invalidAuthor);
    }
    @Step
    public void emptyNewPublishYearBook(String invalidYear){
        $(editPublishYearField()).type(invalidYear);
    }
    @Step
    public void seeErrorEditMessage(){
        $(errorForEditBookMessage()).isDisplayed();
    }
    @Step
    public void enterInvalidPublishYear(String e){
        $(editPublishYearField()).type("--");
    }

}
