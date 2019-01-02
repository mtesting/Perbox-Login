package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;
    public LoginPage(){
        System.setProperty("webdriver.gecko.driver","C:\\Meera\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
    @Given("^The user opens the page$")
    public void theUserOpensThePage() throws Throwable {

        driver.manage().window().maximize();
        System.out.println("Launching the browser");
        driver.get("https://app.perkbox.com/welcome/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        throw new PendingException();
    }
    @When("^The user enters the valid email address$")
    public void theUserEntersTheValidEmailAddress() throws Throwable {
        System.out.println("Entering email address");
        String validemail= "pooja@perkbox.co.uk";
        WebElement emailid = driver.findElement(By.xpath("//*[@id=\"login__global-login__field-email\"]"));
        emailid.sendKeys(validemail);
        throw new PendingException();
    }
    @When("^The user is taken to account selection page$")
    public void theUserIsTakenToAccountSelectionPage() throws Throwable {
        WebElement continuebtn = driver.findElement(By.id("login__global-login__btn-submit"));
        continuebtn.click();
        throw new PendingException();
    }
    @When("^The user selects the account$")
    public void theUserSelectsTheAccount() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"login__global-login__tenant-select__poojatest2__tenant__title\"]"));
        driver.findElement(By.xpath("//*[@id=\"login__global-login__tenant-select__btn-submit\"]")).click();
        throw new PendingException();
    }

    @Then("^on the login page, the email field is pre-populated$")
    public void onTheLoginPageTheEmailFieldIsPrePopulated() throws Throwable {
        String actemail = driver.findElement(By.name("email")).getText();
        String expectedemail = "pooja@perkbox.co.uk";
        if(actemail.contains(expectedemail)){
            System.out.println("The email field is pre-polpulated");
        }else
        {
            System.out.println("The email field is not pre-populated");
        }
        throw new PendingException();
    }

}
