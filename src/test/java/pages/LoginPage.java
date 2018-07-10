package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    WebElement FirstName;

    @FindBy(name = "lastName")
    WebElement LastName;

    @FindBy(xpath = "//html//div[@class='radio-container col-sm-10']//label[1]")
    WebElement Gender;

    @FindBy(xpath = "//input[@id='dob']")
    WebElement DateOfBirth;

    @FindBy(xpath = "//input[@id='address']")
    WebElement Address;

    @FindBy(xpath = "//input[@id='email']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//input[@id='company']")
    WebElement Company;

    @FindBy(xpath = "//select[@id='role']")
    WebElement SelectRole;

    @FindBy(xpath = "//option[contains(text(),'High salary')]")
    WebElement HighSalary;

    @FindBy(xpath = "//option[contains(text(),'Good teamwork')]")
    WebElement GoodTeamWork;

    @FindBy(xpath = "//option[contains(text(),'Challenging')]")
    WebElement Challenging;

    @FindBy(xpath = "//html//div[@class='form-group']//div[2]/label[1]")
    WebElement TakeOnlineCourses;

    @FindBy(xpath = "//html//div[@class='form-group']//div[6]/label[1]")
    WebElement ViaDiscovery;

    @FindBy(xpath = "//textarea[@id='comment']")
    WebElement Comments;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement Submit;

    @FindBy(xpath = "//span[@id='submit-msg']")
    WebElement SuccesfullySubmitted;


    public void setFirstName(String strFirstName) {
        FirstName.sendKeys(strFirstName);
    }

    public void setLastName(String strLastName) {
        LastName.sendKeys(strLastName);
    }

    public void setGender() {
        Gender.click();
    }

    public void setDateOfBirth(String strDateOfBirth) {
        DateOfBirth.sendKeys(strDateOfBirth);
    }

    public void setAddress(String strAddress) {
        Address.sendKeys(strAddress);
    }

    public void setEmail(String strEmail) {
        Email.sendKeys(strEmail);
    }

    public void setPassword(String strPassword) {
        Password.sendKeys(strPassword);
    }

    public void setCompany(String strCompany) {
        Company.sendKeys(strCompany);
    }

    public void setSelectRole() {
        Select Role = new Select(SelectRole);
        Role.selectByVisibleText("QA");
    }

    public void setHighSalary() {
        HighSalary.click();
    }

    public void setGoodTeamWork() {
        GoodTeamWork.click();
    }

    public void setChalleging() {
        Challenging.click();
    }

    public void setTakeOnlineCourses() {
        TakeOnlineCourses.click();
    }

    public void setViaDiscovery() {
        ViaDiscovery.click();
    }

    public void setComments(String strComment) {
        Comments.sendKeys(strComment);
    }

    public void setSubmit() {
        Submit.click();
    }

    public void setSuccesfullySubmitted() {
        Assert.assertEquals(SuccesfullySubmitted.getText(), "Successfully submitted!");
    }

}

