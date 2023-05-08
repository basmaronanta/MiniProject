package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Detail;
import starter.user.DetailPage;
import starter.user.HomePage;

public class DetailSteps {
    @Steps
    Detail detail;

    @Steps
    DetailPage detailPage;

    @Steps
    HomePage homePage;

    @Then("I am on the home page2")
    public void goToHomePage(){
        detail.openUrl("https://alta-shop.vercel.app");
//        homePage.validateOnHomePage();
    }

    @When("I click detail button Sony PS5")
    public void clickDetailProduct(){
        detail.ClickDetail1Button();
    }

    @Then("I can see product detail")
    public void goToDetailPage(){
//        register.openUrl("https://alta-shop.vercel.app/auth/login");
        detailPage.validateOnDetailPage();
    }
}
