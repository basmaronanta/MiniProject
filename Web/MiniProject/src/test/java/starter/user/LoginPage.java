package starter.user;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By title(){
        return By.xpath("//div[@class='v-card__title']");
    }
    @Step
    public void validateOnLoginPage(){
        $(title()).isDisplayed();
    }
}
