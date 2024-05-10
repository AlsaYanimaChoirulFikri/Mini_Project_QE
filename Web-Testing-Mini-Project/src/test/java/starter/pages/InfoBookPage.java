package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InfoBookPage extends PageObject {
    private By.ByXPath getInformation(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]");
    }

    public void bookInformation(){
        $(getInformation()).isDisplayed();
    }
}
