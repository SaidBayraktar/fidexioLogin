package fidexio.step_definition;

import fidexio.pages.LoginPage;
import fidexio.utilities.ConfigurationReader;
import fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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
        loginPage.password.sendKeys(passWord);
    }


    @When("user click on the Login button")
    public void user_click_on_the_login_button() {
        loginPage.loginButton.click();
    }

    @When("user can see their {string}")
    public void user_can_see_their(String userID) {
        System.out.println(loginPage.userID.getText());
        Assert.assertTrue("not match", loginPage.userID.getText().equals(userID));
    }

    @When("posmanager enters valid username and invalid password")
    public void posmanager_enters_valid_username_and_invalid_password() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("validUsernamePos"));
        loginPage.password.sendKeys("kdjfvnd");
        loginPage.loginButton.click();

    }

    @When("Wrong Login password message is displayed")
    public void wrong_login_password_message_is_displayed() {
        Assert.assertTrue(loginPage.wrongAlert.isDisplayed());
    }

    @When("salesmanager enters invalid username and valid password")
    public void salesmanager_enters_invalid_username_and_valid_password() {
        loginPage.username.sendKeys("ajkcbajkhb");
        loginPage.password.sendKeys("posmanager");
        loginPage.loginButton.click();
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("validUsernamePos"));
    }

    @When("Please fill out this field message is displayed")
    public void please_fill_out_this_field_message_is_displayed() {
        Assert.assertTrue(loginPage.fillAlert.isDisplayed());
    }


    @Then("user enters valid password")
    public void user_enters_valid_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("validPasswordPos"));
    }
    @Then("user sees the password in bullet sign")
    public void user_sees_the_password_in_bullet_sign() {
        Assert.assertTrue(loginPage.fillAlert.isDisplayed());
    }

   
    @When("user is on the home page")
    public void user_is_on_the_home_page() {
        Assert.assertTrue(loginPage.userID.isDisplayed());
    }


    @Then("user enters valid password and user presses Enter key on the keyboard")
    public void userEntersValidPasswordAndUserPressesEnterKeyOnTheKeyboard() {
        loginPage.password.sendKeys("posmanager"+ Keys.ENTER);
    }


}
