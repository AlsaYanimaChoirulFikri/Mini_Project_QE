package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject{

    private By title(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]/h1");
    }
    private By cardDisplayClick(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[1]/button[2]");
    }
    private By newBookButton(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]/a");
    }
    private By editClickButton(){
        return new By.ByXPath("//*[@id=\"root\"]/div/table/tbody/tr[3]/td[5]/div/a[2]");
    }
    private By deleteClickButton(){
        return new By.ByXPath("//*[@id=\"root\"]/div/table/tbody/tr[2]/td[5]/div/a[3]");
    }
    private By clickInfoBook(){
        return new By.ByXPath("//*[@id=\"root\"]/div/table/tbody/tr[4]/td[5]/div/a[1]");
    }


    @Step
    public boolean validateOnHomePage(){
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(title()).isDisplayed();
    }

    @Step
    public void clickNewBookButton(){
        $(newBookButton()).click();
    }
    @Step
    public void clickCardDisplayButton(){
        $(cardDisplayClick()).click();
    }
    @Step
    public void clickEditButton(){
        $(editClickButton()).click();
    }
    @Step
    public void clickDeleteButton(){
        $(deleteClickButton()).click();
    }
    @Step
    public void clickInformation(){
        $(clickInfoBook()).click();
    }
}
