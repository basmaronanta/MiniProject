package starter.user;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Buy extends PageObject {

    private By clickBuyButton(){
        return By.xpath("//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }

    private By clickCartButton(){
        return By.xpath("//button[@class='v-btn v-btn--icon v-btn--round theme--dark v-size--default']");
    }

    private By clickPayButton(){
        return By.xpath("//button[@id='button-bayar']");
    }

    private By clickReduceButton(){
        return By.xpath("//button[@class='v-btn v-btn--icon v-btn--outlined v-btn--round theme--light v-size--default']");
    }

    private By errorMessage(){
        return By.xpath("//div[@class='v-alert__wrapper']");
    }

    @Step
    public void ClickBuyButton(){
        $(clickBuyButton()).click();
    }

    @Step
    public void ClickCartButton(){
        $(clickCartButton()).click();
    }

    @Step
    public void ClickPayButton(){
        $(clickPayButton()).click();
    }

    @Step
    public void ClickReduceButton(){
        $(clickReduceButton()).click();
    }

    @Step
    public boolean validateMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualMessage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }
}
