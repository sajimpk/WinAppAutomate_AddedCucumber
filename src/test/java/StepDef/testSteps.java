package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import HomePage.Homepage;
import Reports.PageObjectManage;
import utilis.TestContextSetup;



public class testSteps {
    TestContextSetup testContextSetup;
    Homepage homepage;
    PageObjectManage pageObjectManage;
    public testSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.homepage = testContextSetup.pageObjectManager.getHomePage();
    }


    @Given("User Click on notepad write options")
    public void UserClickOnNotepadWriteOptions() throws InterruptedException {
        homepage.getSearchIcon().click();

    }


    @Then("Write {string}")
    public void write(String Value) {
        homepage.getSearchIcon().sendKeys(Value);
    }
}
