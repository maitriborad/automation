package sportingbull.com.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import sportingbull.com.utility.Utility;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement usernameTab;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordTab;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='spb-alert-block__message ng-star-inserted']")
    WebElement message;

    public void enterUsername(String username){
        sendTextToElement(usernameTab,username);
        log.info("Enter " + username + " in " + usernameTab.toString());
    }
    public void enterPassword(String password){
        sendTextToElement(passwordTab,password);
        log.info("Enter " + password + " in " + passwordTab.toString());
    }
    public void clickOnLoginTab(){
        clickOnElement(loginButton);
        log.info("Click on " + loginButton.toString());
    }
    public void verifyMessage(String expectedMessage){
        Assert.assertEquals(getTextFromElement(message),expectedMessage,"Message not displayed");
    }
}
