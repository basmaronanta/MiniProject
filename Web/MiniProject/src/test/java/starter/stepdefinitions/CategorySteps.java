package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Category;
import starter.user.HomePage;

public class CategorySteps {
    @Steps
    Category category;

    @Steps
    HomePage homePage;

    @Given("I am on the home page1")
    public void goToHomePage(){
        category.openUrl("https://alta-shop.vercel.app");
//        homePage.validateOnHomePage();
    }

    @When("I click select category")
    public void clickSelectCategoryButton(){
        category.ClickSelectCategoryButton();
    }

    @And("I click category gaming")
    public void clickCategoryProduct(){
        category.ClickCategoryButton();
    }

    @Then("I can see product category message {string}")
    public void iCanSeeProductCategoryMessage(String message) {
        category.validateMessageDisplayed();
        category.validateEqualMessage(message);
    }

    @And("I click clear button")
    public void clickClearProduct(){
        category.ClickClearButton();
    }

    @And("I go to home page")
    public void gotoHomePage(){
//        category.openUrl("https://alta-shop.vercel.app");
        homePage.validateOnHomePage();
    }
}
