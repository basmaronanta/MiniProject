package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.HomePage;
import starter.user.LoginPage;
import starter.user.Register;

public class RegisterSteps {
    @Steps
    Register register;

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("me on the register page")
    public void onRegisterPage(){
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
    }
    @When("I enter a full name {string}")
    public void enterFullname(String fullname){
        register.inputFullName(fullname);
    }
    @And("I entered a email {string}")
    public void enterEmail(String email){
        register.inputEmail(email);
    }
    @And("I entered a password {string}")
    public void enterPassword(String password){
        register.inputPassword(password);
    }
    @And("I click the register button")
    public void clickRegisterButton(){
        register.ClickRegisterButton();
    }
    @Then("I'm on the login page")
    public void goToLoginPage(){
//        register.openUrl("https://alta-shop.vercel.app/auth/login");
        loginPage.validateOnLoginPage();
    }

    @Then("I can see error message")
    public void iCanSeeErrorMessage() {
        register.validateErrorMessageDisplayed();
//        login.validateEqualErrorMessage();
    }
}
