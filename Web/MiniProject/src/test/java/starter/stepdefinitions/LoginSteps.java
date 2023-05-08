package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.HomePage;
import starter.user.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onLoginPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.validateOnLoginPage();
    }

    @When("I enter email {string}")
    public void enterEmailOnLogin(String email){
        login.inputEmail(email);
    }
    @And("I enter password {string}")
    public void enterPasswordOnLogin(String password){
        login.inputPassword(password);
    }
    @And("I click login button")
    public void clickLoginButton(){
        login.ClickLoginButton();
    }
    @Then("I am on the home page")
    public void goToHomePage(){
//        login.openUrl("https://alta-shop.vercel.app");
        homePage.validateOnHomePage();
    }

    @Then("I can see error message {string}")
    public void iCanSeeErrorMessage(String message) {
        login.validateErrorMessageDisplayed();
        login.validateEqualErrorMessage(message);
    }
}
