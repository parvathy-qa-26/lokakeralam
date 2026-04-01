package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class AssociationCreation extends BasePage {
    private Actions actions;

    public AssociationCreation(WebDriver driver) {
        super(driver);
        this.actions = new Actions(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='My Pages']")
    private WebElement myPages;
    @FindBy(xpath = "//h6[normalize-space()='Register New Association'] /following::button[normalize-space()='Register'][1]")
    private WebElement btnRegisterNewAssociation;
    @FindBy(xpath = "//input[@type='file' and @name='coverPhoto']")
    private WebElement uploadCoverPhoto;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement btnSaveCoverPhoto;
    @FindBy(xpath = "//input[@type='file' and @name='logo']")
    private WebElement uploadProfilePicture;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement btnSaveProfilePicture;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement txtEmail;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement txtPhoneNo;
    @FindBy(xpath = "//input[@name='whatsappNumber']")
    private WebElement txtWhatsAppNo;
    @FindBy(xpath = "//input[@name='websiteUrl']")
    private WebElement txtWebsite;
    @FindBy(xpath = "(//div[@role='combobox' and contains(@class,'MuiSelect-select')])[1]")
    private WebElement dropDownAssociationType;
    @FindBy(xpath = "//li[@role='option' and normalize-space()='Cultural Groups']")
    private WebElement selectAssociationType;
    @FindBy(xpath = "//label[.//span[text()='Parent Association']]")
    private WebElement checkboxAssociationStructureLabel;

    @FindBy(xpath = "//label[.//span[text()='Open Association']]")
    private WebElement checkboxMembershipType;
    @FindBy(xpath = "//input[@name='associationName']")
    private WebElement txtAssociationName;
    @FindBy(xpath = "//input[@name='shortName']")
    private WebElement txtShortName;
    @FindBy(xpath = "//input[@placeholder='Select Date']")
    private WebElement txtDOB;
    @FindBy(xpath = "//label[normalize-space()='Total Members*']/following::input[1]")
    private WebElement txtTotalMembers;

    @FindBy(xpath = "//button[@class='gm-control-active gm-fullscreen-control']")
    private WebElement btnFullScreen;
    @FindBy(xpath = "//iframe[@tabindex='-1']")
    private WebElement mapIframe;
    @FindBy(xpath = "//map[@id='gmimap0']//area")
    private WebElement mapDragger;
    @FindBy(xpath = "//td[normalize-space()='Country']/following-sibling::td")
    private WebElement countryValue;
    @FindBy(xpath = "//td[normalize-space()='Region']/following-sibling::td")
    private WebElement regionValue;
    @FindBy(xpath = "//td[normalize-space()='City']/following-sibling::td")
    private WebElement cityValue;
    @FindBy(xpath = "//td[normalize-space()='Latitude, Longitude']/following-sibling::td")
    private WebElement latLongValue;

    @FindBy(xpath = "//span[normalize-space()='Brief Description of Association*']/following::div[@contenteditable='true'][1]")
    private WebElement associationDescriptionField;
    @FindBy(xpath = "//span[normalize-space()='Objectives*']/following::div[@contenteditable='true'][1]")
    private WebElement associationObjectives;
    @FindBy(xpath = "//span[normalize-space()='Activities*']/following::div[@contenteditable='true'][1]")
    private WebElement associationActivities;

    @FindBy(xpath = "//input[@name='officeBearers.0.name']")
    private WebElement officeBearerName;
    @FindBy(xpath = " //label[text()='Role']/following::div[@role='combobox'][1]")
    private WebElement officeBearerRole;
    @FindBy(xpath = "//*[contains(@class,'Mui') and normalize-space()='Asst. Auditor']")
    private WebElement selectOfficeBearerRole;
    @FindBy(xpath = "//input[@name='officeBearers.0.email']")
    private WebElement officeBearerEmail;
    @FindBy(xpath = "//input[@name='officeBearers.0.phoneNumber']")
    private WebElement officeBearerPhone;

    @FindBy(xpath = "//button[@aria-label='Add Office Bearer']")
    private WebElement addofficeBearer;

    @FindBy(xpath = "//input[@name='officeBearers.1.name']")
    private WebElement officeBearerName1;
    @FindBy(xpath = "//input[@name='officeBearers.1.role']/preceding-sibling::div")
    private WebElement officeBearerRole1;
    @FindBy(xpath = "//*[contains(@class,'Mui') and normalize-space()='Joint Secretary']")
    private WebElement selectOfficeBearerRole1;
    @FindBy(xpath = "//input[@name='officeBearers.1.email']")
    private WebElement officeBearerEmail1;
    @FindBy(xpath = "//input[@name='officeBearers.1.phoneNumber']")
    private WebElement officeBearerPhone1;
    @FindBy(xpath = "//input[@name='officeBearers.1.pageEditPermission']")
    private WebElement pageContentEditor1;


    @FindBy(xpath = "//input[@name='proofOfAssociation.0.title']/preceding-sibling::div[@role='combobox']")
    WebElement titleDropdown;
    @FindBy(xpath = "//input[@name='proofOfAssociation.0.title']/preceding-sibling::div[normalize-space()='Copy of Registration Certificate']")
    WebElement titleSelection;
    @FindBy(xpath = "//input[@type='file' and @name='proofOfAssociation.0.file']")
    WebElement uploadFileInput;


    @FindBy(xpath = "//input[@name='facilities' and @value='Banquet Halls']")
    private WebElement checkBanquetHalls;
    @FindBy(xpath = "//input[@name='facilities' and @value='Cultural activities']")
    private WebElement checkCulturalActivities;
    @FindBy(xpath = "//input[@name='facilities' and @value='Welfare activities ']")
    private WebElement checkWelfareActivities;

    @FindBy(xpath = "//button[normalize-space()='Saturday']")
    private WebElement saturday;
    @FindBy(xpath = "//label[normalize-space()='Open Time']/following::input[@type='time'][3]")
    private WebElement saturdayStartTime;
    @FindBy(xpath = "//label[normalize-space()='Close Time']/following::input[@type='time'][3]")
    private WebElement saturdayEndTime;
    @FindBy(xpath = "//button[normalize-space()='Sunday']")
    private WebElement sunday;
    @FindBy(xpath = "//label[normalize-space()='Open Time']/following::input[@type='time'][1]")
    private WebElement sundayStartTime;
    @FindBy(xpath = "//label[normalize-space()='Close Time']/following::input[@type='time'][1]")
    private WebElement sundayEndTime;

    public void openMyPages() {
        click(myPages);
    }

    public void clickRegisterNewAssociation() {
        click(btnRegisterNewAssociation);
    }

    public void uploadCoverPhoto(String filePath) {
        uploadCoverPhoto.sendKeys(filePath);
    }

    public void saveCoverPhoto() {
        click(btnSaveCoverPhoto);
    }

    public void uploadProfileLogo(String filePath) {
        uploadProfilePicture.sendKeys(filePath);
    }

    public void saveProfilePhoto() {
        click(btnSaveProfilePicture);
    }

    public void fillContactDetails(
            String email,
            String phoneNumber,
            String whatsappNumber,
            String website
    ) {
        sendKeys(txtEmail, email);
        sendKeys(txtPhoneNo, phoneNumber);
        sendKeys(txtWhatsAppNo, whatsappNumber);
        sendKeys(txtWebsite, website);

    }

    public void fillAssociationDetails(
            String organisationName,
            String shortName
    ) throws InterruptedException {
        click(dropDownAssociationType);
        click(selectAssociationType);
        js.executeScript("arguments[0].scrollIntoView(true);", checkboxAssociationStructureLabel);
        js.executeScript("arguments[0].click();", checkboxAssociationStructureLabel);

        js.executeScript("arguments[0].scrollIntoView(true);", checkboxMembershipType);
        js.executeScript("arguments[0].click();", checkboxMembershipType);

        sendKeys(txtAssociationName, organisationName);
        sendKeys(txtShortName, shortName);

        sendKeys(txtDOB, "04-27-2012");
        sendKeys(txtTotalMembers, "50");

    }
    public void moveMarkerToKuwaitAndGetDetails() {
        // Toggle fullscreen
        btnFullScreen.click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Switch into iframe
        driver.switchTo().frame(mapIframe);

        // Move marker using JS (precise)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "var marker = window.liveMarker || null;" +
                        "if(marker){ marker.setPosition({lat: 29.3759, lng: 47.9774}); }"
        );

        // Switch back
        driver.switchTo().defaultContent();

        // Verify updated fields
        Assert.assertEquals(countryValue.getText(), "Kuwait");
        Assert.assertTrue(regionValue.getText().contains("Kuwait"));
        Assert.assertEquals(cityValue.getText(), "Kuwait City");
        Assert.assertTrue(latLongValue.getText().contains("29.3759"));
        Assert.assertTrue(latLongValue.getText().contains("47.9774"));
    }




    public void enterDescription(String description) {
        sendKeys(associationDescriptionField, description);
    }

    public void enterObjectives(String objectives) {
        sendKeys(associationObjectives, objectives);
    }

    public void enterActivities(String activities) {
        sendKeys(associationActivities, activities);
    }

    public void enterOfficeBearerDetails(String name,
                                         String officeemail,
                                         String mobilenumber) {

        js.executeScript("window.scrollBy(0,500);");
        sendKeys(officeBearerName, name);
        click(officeBearerRole);
        click(selectOfficeBearerRole);
        setReactInputValue(officeBearerEmail, officeemail);
        sendKeys(officeBearerPhone, mobilenumber);
        click(addofficeBearer);
        js.executeScript("window.scrollBy(0,500);");

    }

    public void enterOfficeBearerDetailsTwo(String name,
                                            String officeemail,
                                            String mobilenumber) {

        sendKeys(officeBearerName1, name);
        click(officeBearerRole1);
        click(selectOfficeBearerRole1);
        js.executeScript("arguments[0].scrollIntoView(true);", officeBearerEmail1);

        setReactInputValue(officeBearerEmail1, officeemail);
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", officeBearerPhone1);
        sendKeys(officeBearerPhone1, mobilenumber);
        clickUsingJS(pageContentEditor1);

    }


    public void selectTitleAndUpload(String filePath, String optionText) {
        js.executeScript("window.scrollBy(0,200);");

        click(titleDropdown);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement option = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//li[normalize-space()='" + optionText + "']")));
        option.click();
        uploadFileInput.sendKeys(filePath);
    }

    public void selectFacilities() {
        js.executeScript("window.scrollBy(0,400);");
        clickUsingJS(checkBanquetHalls);
        clickUsingJS(checkCulturalActivities);
        clickUsingJS(checkWelfareActivities);
    }

    public void selectWorkingDaySunday() {
        js.executeScript("window.scrollBy(0,400);");
        click(sunday);
        click(sundayStartTime);
        sendKeys(sundayStartTime, "05:00");
        click(sundayEndTime);
        sendKeys(sundayEndTime, "09:00");

    }

    public void selectWorkingDaySaturday() {
        js.executeScript("window.scrollBy(0,400);");
        click(saturday);
        click(saturdayStartTime);
        sendKeys(saturdayStartTime, "06:00");
        click(saturdayEndTime);
        sendKeys(saturdayEndTime, "09:00");

    }
}

