package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "APjFqb")
    private WebElement searchBox;

    @FindBy(id = "search")
    private WebElement searchResults;

    @FindBy(className = "bt-split-screen__header")
    private WebElement loginHeaderTitle;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "next")
    private WebElement selanjutnyaButton;

    @FindBy(xpath = "//div[@class='bt-social-group']//button[1]")
    private WebElement loginFacebookButton;

    @FindBy(id = "btnGoogle")
    private WebElement loginGoogleButton;

    @FindBy(className = "bt-question-register")
    private WebElement registerQuestionText;

    @FindBy(xpath = "//a[@href='/register']")
    private WebElement registerLink;


    public void enterSearchText(String searchText) {
        searchBox.isEnabled();
        searchBox.clear();
        searchBox.sendKeys(searchText);
        searchBox.sendKeys(Keys.ENTER);
    }

    public Boolean verifySearchResultsDisplayed() {
        return searchResults.isDisplayed();
    }

}
