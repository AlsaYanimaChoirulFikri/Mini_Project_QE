package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class DeleteBookPage extends PageObject {

    private By.ByXPath deleteClickButton(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]/button");
    }
    private By.ByXPath deleteSuccess(){
        return new By.ByXPath("//*[@id=\"root\"]/div[2]/div");
    }

    public void deleteButtonClick(){
        $(deleteClickButton()).click();
    }
    public void bookHasBeenDeleted(){
        $(deleteSuccess()).isDisplayed();
    }

}
