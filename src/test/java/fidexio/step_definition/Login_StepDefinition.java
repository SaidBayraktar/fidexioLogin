package fidexio.step_definition;

import fidexio.pages.LoginPage;
import fidexio.utilities.ConfigurationReader;
import fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinition {
    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user enters valid username {string}")
    public void user_enters_valid_username(String userName) {
        loginPage.username.sendKeys(userName);
    }

    @When("user enters valid password {string}")
    public void user_enters_valid_password(String passWord) {
        loginPage.username.sendKeys(passWord);
    }


    @When("user click on the Login button")
    public void user_click_on_the_login_button() {

    }

    @When("user can see their {string}")
    public void user_can_see_their(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
