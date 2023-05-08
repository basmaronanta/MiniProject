package starter.user;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {
    private By title(){
        return By.xpath("//div[@class='container']");
    }
    @Step
    public void validateOnTransactionPage(){
        $(title()).isDisplayed();
    }
}
