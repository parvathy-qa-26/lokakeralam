package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage {
    private static final Logger logger = (Logger) LogManager.getLogger(LoginPage.class);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(.,'Close')]")
    private WebElement closebtn;

    @FindBy(xpath = "//button[normalize-space()='Click to Explore']")
    private WebElement ClickExplore;

    @FindBy(xpath = "//input[contains(@class,'MuiInputBase-input') and @type='text']")
    private WebElement enterEmail;

    @FindBy(xpath = "//input[contains(@class,'MuiInputBase-input') and @type='password']")
    private WebElement enterPassword;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    private WebElement signIn;

    @FindBy(xpath = "//img[@alt='Profile']")
    private WebElement profileIcon;

    @FindBy(xpath = "//span[normalize-space()='Logout']")
    private WebElement btnLogout;

    public void clickCloseButton() throws InterruptedException {
        Thread.sleep(1000);
        click(closebtn);
    }

    public void clickExploreButton() {
        click(ClickExplore);
    }

    public void login(String email,String password) {
        waitForPageLoad();
        sendKeys(enterEmail, email);
        sendKeys(enterPassword, password);
        try {
            Thread.sleep(1000); // 1 second buffer
        } catch (InterruptedException e) {
            logger.error("Interrupted while waiting before Sign In", e);
        }
        click(signIn);
    }

    public boolean isLoginSuccessful() {
        try {
            // Wait until profile icon is visible
            wait.until(ExpectedConditions.visibilityOf(profileIcon));
            return profileIcon.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void logout() {
        click(profileIcon);
        click(btnLogout);

    }
}
