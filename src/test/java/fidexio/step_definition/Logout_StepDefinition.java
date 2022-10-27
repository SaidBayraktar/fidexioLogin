package fidexio.step_definition;

import fidexio.pages.LoginPage;
import fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout_StepDefinition {

    LoginPage loginPage = new LoginPage();
    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user is already logged in and is on the homepage")
    public void user_is_already_logged_in_and_is_on_the_homepage() {
        loginPage.login();
    }

    @When("user clicks on the username module")
    public void user_clicks_on_the_username_module() {
        //wait.until(ExpectedConditions.titleIs("Login"));
        loginPage.userID.click();
    }

    @Then("user clicks on the log out dropdown option")
    public void user_clicks_on_the_log_out_dropdown_option() {
        loginPage.userLogout.click();
    }

    @Then("user lands on the login page")
    public void user_lands_on_the_login_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }


    @Then("user clicks on the goBack button")
    public void user_clicks_on_the_go_back_button() {
        Driver.getDriver().navigate().back();


    }

    @Then("can not go to the home page again")
    public void can_not_go_to_the_home_page_again() {
        Assert.assertTrue(loginPage.sessionExp.isDisplayed());
    }

}
















