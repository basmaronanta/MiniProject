package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {

    @Steps
    Register register;

    @Steps
    LoginPage loginPage;

    @Steps
    Login login;

    @Steps
    Category category;

    @Steps
    Detail detail;

    @Steps
    DetailPage detailPage;

    @Steps
    HomePage homePage;

    @Steps
    Buy buy;

    @Steps
    TransactionPage transactionPage;

//    @Given("me on the register page")
//    public void onRegisterPage(){
//        register.openUrl("https://alta-shop.vercel.app/auth/register");
//        register.validateOnRegisterPage();
//    }
//    @When("I enter a full name {string}")
//    public void enterFullname(String fullname){
//        register.inputFullName(fullname);
//    }
//    @And("I entered a email {string}")
//    public void enterEmail(String email){
//        register.inputEmail(email);
//    }
//    @And("I entered a password {string}")
//    public void enterPassword(String password){
//        register.inputPassword(password);
//    }
//    @And("I click the register button")
//    public void clickRegisterButton(){
//        register.ClickRegisterButton();
//    }
//    @Then("I'm on the login page")
//    public void goToLoginPage(){
////        register.openUrl("https://alta-shop.vercel.app/auth/login");
//        loginPage.validateOnLoginPage();
//    }
//
//    @Then("I can see error message")
//    public void iCanSeeErrorMessage() {
//        register.validateErrorMessageDisplayed();
////        login.validateEqualErrorMessage();
//    }

//    @Given("I am on the login page")
//    public void onLoginPage(){
//        login.openUrl("https://alta-shop.vercel.app/auth/login");
//        login.validateOnLoginPage();
//    }
//
//    @When("I enter email {string}")
//    public void enterEmailOnLogin(String email){
//        login.inputEmail(email);
//    }
//    @And("I enter password {string}")
//    public void enterPasswordOnLogin(String password){
//        login.inputPassword(password);
//    }
//    @And("I click login button")
//    public void clickLoginButton(){
//        login.ClickLoginButton();
//    }
//    @Then("I am on the home page")
//    public void goToHomePage(){
////        login.openUrl("https://alta-shop.vercel.app");
//        homePage.validateOnHomePage();
//    }
//
//    @Then("I can see error message {string}")
//    public void iCanSeeErrorMessage(String message) {
//        login.validateErrorMessageDisplayed();
//        login.validateEqualErrorMessage(message);
//    }

//    @When("I click select category")
//    public void clickSelectCategoryButton(){
//        category.ClickSelectCategoryButton();
//    }
//
//    @And("I click category gaming")
//    public void clickCategoryProduct(){
//        category.ClickCategoryButton();
//    }
//
//    @Then("I can see product category message {string}")
//    public void iCanSeeProductCategoryMessage(String message) {
//        category.validateMessageDisplayed();
//        category.validateEqualMessage(message);
//    }
//
//    @And("I click clear button")
//    public void clickClearProduct(){
//        category.ClickClearButton();
//    }
//
//    @And("I go to home page")
//    public void gotoHomePage(){
////        category.openUrl("https://alta-shop.vercel.app");
//        homePage.validateOnHomePage();
//    }

//    @When("I click detail button Sony PS5")
//    public void clickDetailProduct(){
//        detail.ClickDetail1Button();
//    }
//
//    @Then("I can see product detail")
//    public void goToDetailPage(){
////        register.openUrl("https://alta-shop.vercel.app/auth/login");
//        detailPage.validateOnDetailPage();
//    }

//    @When("I click detail button Furniture")
//    public void clickDetail2Product(){
//        detail.ClickDetail2Button();
//    }

//    @When("I click buy button product")
//    public void clickBuyProduct(){
//        buy.ClickBuyButton();
//    }
//
//    @And("I click cart button")
//    public void clickCartProduct(){
//        buy.ClickCartButton();
//    }
//
//    @Then("I am on the your cart page")
//    public void onCartPage(){
//        buy.openUrl("https://alta-shop.vercel.app/order");
////        homePage.validateOnHomePage();
//    }
//
//    @Then("I click pay button")
//    public void clickPayProduct(){
//        buy.ClickPayButton();
//    }
//
//    @And("I am on the transaction information page")
//    public void onTransactionPage(){
////        buy.openUrl("https://alta-shop.vercel.app/order");
//        transactionPage.validateOnTransactionPage();
//    }
//
//    @Then("I click the button to reduce the quantity")
//    public void clickReduceProduct(){
//        buy.ClickReduceButton();
//    }
//
//    @Then("I can see cart page message {string}")
//    public void iCanSeeCartPageMessage(String message) {
//        buy.validateMessageDisplayed();
//        buy.validateEqualMessage(message);
//    }

}
