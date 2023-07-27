package sportingbull.com.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sportingbull.com.utility.Utility;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//li[@class='spb-gateway']")
    List<WebElement> options;

    @CacheLookup
    @FindBy(xpath = "//button[@class='consent-give']")
    WebElement cookies;

    @CacheLookup
    @FindBy(xpath = "//div[@class='spb-general-btn spb-general-btn__my-account-buttons--border-radius spb-general-btn--type2 spb-navbar-buttons__button spb-navbar-buttons__button--wide spb-navbar-buttons__button--login spb-navbar-buttons__button--unauth spb-navbar-buttons__button--no-registration']")
    WebElement login;

    public void clickOnAcceptCookies(){
        clickOnElement(cookies);
        log.info("Accept cookies" + cookies.toString());
    }
    public boolean isOptionsInTopMenu(String option){
        boolean isDisplayed = false;
            for (WebElement e : options) {
                if (e.getText().equalsIgnoreCase(option)) {
                    isDisplayed = true;
                    break;
                }
        }
        return isDisplayed;
    }
    public void clickOnLogin(){
        clickOnElement(login);
        log.info("Click on Login" + login.toString());
    }
}
