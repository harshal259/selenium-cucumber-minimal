package StepDefinitions;

import PageObjects.LoginPage;
import Utilities.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class LoginSteps {

    TestContext testContext;
    LoginPage loginPage;

    public LoginSteps(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Given("launch Google")
    public void launch_google() throws InterruptedException {
        System.out.println("Page Title is: " + testContext.getDriverManager().getDriver().getTitle());
        Assert.assertEquals(testContext.getDriverManager().getDriver().getTitle(), "Google");
        Thread.sleep(3000);
        loginPage.enterSearchText("Docker Selenium");
        Thread.sleep(1000);
        Assert.assertTrue(loginPage.verifySearchResultsDisplayed());
        System.out.println("Search Results Displayed");
    }


}
