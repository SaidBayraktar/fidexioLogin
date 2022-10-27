package fidexio.pages;

import fidexio.utilities.ConfigurationReader;
import fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userID;


    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongAlert;


    @FindBy(xpath = "//input[contains(@required,'required')]")
    public WebElement fillAlert;


    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        username.sendKeys(ConfigurationReader.getProperty("validUsernamePos"));
        password.sendKeys(ConfigurationReader.getProperty("validPasswordPos"));
        loginButton.click();
    }

    @FindBy(xpath = "//a[@data-menu=\"logout\"]")
    public WebElement userLogout;

    @FindBy(xpath = "//h4[@class=\"modal-title\"]")
    public WebElement sessionExp;



















}
