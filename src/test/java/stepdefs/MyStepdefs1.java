package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;

public class MyStepdefs1 {
    WebDriver driver;
    LoginPage loginpage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azerics\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        loginpage = new LoginPage(driver);
    }

    @Given("^user navigates to the app url$")
    public void userNavigatesToTheAppUrl() {
        driver.get("http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        driver.manage().window().maximize();
    }

    @When("^user fills first name textfield \"([^\"]*)\"$")
    public void userFillsFirstNameTextfield(String firstName) {
        loginpage.setFirstName(firstName);
    }

    @And("^user fills last name textfield \"([^\"]*)\"$")
    public void userFillsLastNameTextfield(String lastName) {
        loginpage.setLastName(lastName);
    }

    @And("^user fills date of birth \"([^\"]*)\"$")
    public void userFillsDateOfBirth(String datoOfBirth) {
        loginpage.setDateOfBirth(datoOfBirth);
    }

    @And("^user fills email \"([^\"]*)\"$")
    public void userFillsEmail(String email) {
        loginpage.setEmail(email);
    }

    @And("^user fills Password \"([^\"]*)\"$")
    public void userFillsPassword(String password) {
        loginpage.setPassword(password);
    }

    @And("^user fills address \"([^\"]*)\"$")
    public void userFillsAddress(String address) {
        loginpage.setAddress(address);
    }

    @And("^user fills company \"([^\"]*)\"$")
    public void userFillsCompany(String company) {
        loginpage.setCompany(company);
    }

    @And("^user select role$")
    public void userSelectRole() {
        loginpage.setSelectRole();
    }

    @And("^user select option job expectation$")
    public void userSelectOptionJobExpectation() {
        loginpage.setHighSalary();
    }

    @And("^user click gender$")
    public void userClickGender() {
        loginpage.setGender();
    }

    @And("^user select first job expectation$")
    public void userSelectFirstJobExpectation() {
        loginpage.setHighSalary();
    }

    @And("^user select second job expectation$")
    public void userSelectSecondJobExpectation() {
        loginpage.setGoodTeamWork();
    }

    @And("^user select third job expectation$")
    public void userSelectThirdJobExpectation() {
        loginpage.setChalleging();
    }

    @And("^user select first way of development$")
    public void userSelectFirstWayOfDevelopment() {
        loginpage.setTakeOnlineCourses();
    }

    @And("^user select second way of development$")
    public void userSelectSecondWayOfDevelopment() {
        loginpage.setViaDiscovery();
    }

    @And("^user fills comments \"([^\"]*)\"$")
    public void userFillsComments(String comment) {
        loginpage.setComments(comment);
    }

    @And("^user click submit$")
    public void userClickSubmit() {
        loginpage.setSubmit();
    }

    @Then("^form succesfully submited$")
    public void formSuccesfullySubmited() {
        loginpage.setSuccesfullySubmitted();
    }

    @After
    public void finish() {
        driver.close();
        driver.quit();
    }
}
