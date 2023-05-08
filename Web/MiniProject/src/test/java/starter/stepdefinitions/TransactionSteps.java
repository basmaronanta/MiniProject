package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Buy;
import starter.user.HomePage;
import starter.user.Login;
import starter.user.TransactionPage;

public class TransactionSteps {
    @Steps
    Buy buy;

    @Steps
    TransactionPage transactionPage;

    @Steps
    Login login;

    @Steps
    HomePage homePage;

    @Given("I am on the login page1")
    public void onLoginPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.validateOnLoginPage();
    }

    @When("I enter1 email {string}")
    public void enterEmailOnLogin(String email){
        login.inputEmail(email);
    }
    @And("I enter1 password {string}")
    public void enterPasswordOnLogin(String password){
        login.inputPassword(password);
    }
    @And("I click1 login button")
    public void clickLoginButton(){
        login.ClickLoginButton();
    }

    @When("I click buy button product")
    public void clickBuyProduct(){
        buy.ClickBuyButton();
    }

    @And("I click cart button")
    public void clickCartProduct(){
        buy.ClickCartButton();
    }

    @Then("I am on the your cart page")
    public void onCartPage(){
        buy.openUrl("https://alta-shop.vercel.app/order");
//        homePage.validateOnHomePage();
    }

    @Then("I click pay button")
    public void clickPayProduct(){
        buy.ClickPayButton();
    }

    @And("I am on the transaction information page")
    public void onTransactionPage(){
//        buy.openUrl("https://alta-shop.vercel.app/order");
        transactionPage.validateOnTransactionPage();
    }

    @Then("I click the button to reduce the quantity")
    public void clickReduceProduct(){
        buy.ClickReduceButton();
    }

    @Then("I can see cart page message {string}")
    public void iCanSeeCartPageMessage(String message) {
        buy.validateMessageDisplayed();
        buy.validateEqualMessage(message);
    }
}
