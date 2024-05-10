package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChangeListDisplayPage extends PageObject {
    private By.ByXPath cardButtonClick(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[3]");
    }

    public boolean theBookListChanged(){
        return $(cardButtonClick()).isDisplayed();
    }
}
