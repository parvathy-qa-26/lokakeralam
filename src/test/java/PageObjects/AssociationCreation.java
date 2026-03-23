package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interactive;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Collections;

public class AssociationCreation extends BasePage {
    private Actions actions;

    public AssociationCreation(WebDriver driver) {
        super(driver);
        this.actions = new Actions(driver);
        ;

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


    @FindBy(xpath = "//img[contains(@src,'transparent.png')]/parent::div")
    private WebElement markerElement;

    @FindBy(xpath = "//button[@aria-label='Map camera controls']")
    private WebElement cameraControls;

    @FindBy(xpath = "//button[@aria-label='Move up']")
    private WebElement moveUpButton;

    @FindBy(xpath = "//button[@aria-label='Move left']")
    private WebElement moveLeftButton;

    @FindBy(xpath = "//td[text()='Country']/following-sibling::td")
    private WebElement countryField;

    @FindBy(xpath = "//td[text()='Region']/following-sibling::td")
    private WebElement regionField;

    @FindBy(xpath = "//td[text()='City']/following-sibling::td")
    private WebElement cityField;

    @FindBy(xpath = "//td[text()='Latitude, Longitude']/following-sibling::td")
    private WebElement latLonField;

    @FindBy(xpath = "//button[@aria-label='Toggle fullscreen view' and @aria-pressed='false']")
    private WebElement btnFullScreen;  // same button toggles back

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


    @FindBy(xpath = "//input[@name='proofOfAssociation.0.title']/preceding-sibling::div ")
    WebElement titleDropdown;
    @FindBy(xpath="//div[contains(@class,'Mui') and normalize-space()='Affiliation certificate']")
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
    @FindBy(xpath="//label[normalize-space()='Open Time']/following::input[@type='time'][1]")
    private WebElement sundayStartTime;
    @FindBy(xpath="//label[normalize-space()='Close Time']/following::input[@type='time'][1]")
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
            String shortName,
            String date

    ) throws InterruptedException {
        click(dropDownAssociationType);
        click(selectAssociationType);
        js.executeScript("arguments[0].scrollIntoView(true);", checkboxAssociationStructureLabel);
        js.executeScript("arguments[0].click();", checkboxAssociationStructureLabel);


        js.executeScript("arguments[0].scrollIntoView(true);", checkboxMembershipType);
        js.executeScript("arguments[0].click();", checkboxMembershipType);

        sendKeys(txtAssociationName, organisationName);
        sendKeys(txtShortName, shortName);
        //js.executeScript("arguments[0].click();", txtDOB);

        txtDOB.sendKeys(Keys.CONTROL + "a");  // select existing value
        txtDOB.sendKeys(Keys.DELETE);
        sendKeys(txtDOB, date);
        sendKeys(txtTotalMembers, "50");
    }

    public void moveMarkerToKuwait() throws InterruptedException {
        // Step 1: Open fullscreen
        wait.until(ExpectedConditions.elementToBeClickable(btnFullScreen)).click();

        // Step 2: Zoom in for precision
        for (int i = 0; i < 2; i++) {
            wait.until(ExpectedConditions.elementToBeClickable(cameraControls)).click();
            Thread.sleep(500);
        }

        // Step 3: Activate map by clicking a camera control once
        wait.until(ExpectedConditions.elementToBeClickable(moveUpButton)).click();
        Thread.sleep(500);

        // Step 4: Move the marker itself to Kuwait using JavaScript
        ((JavascriptExecutor) driver).executeScript(
                "if (typeof marker !== 'undefined') {" +
                        "  marker.setPosition(new google.maps.LatLng(29.3759, 47.9774));" +
                        "  google.maps.event.trigger(marker, 'dragend');" +
                        "}"
        );

        // Step 5: Wait until coordinates are close to Kuwait
        wait.until(driver -> {
            String coords = latLonField.getText();
            String[] parts = coords.split(",");
            double lat = Double.parseDouble(parts[0].trim());
            double lon = Double.parseDouble(parts[1].trim());
            return Math.abs(lat - 29.3759) < 0.5 && Math.abs(lon - 47.9774) < 0.5;
        });

        // Step 6: Print updated values
        System.out.println("Country: " + countryField.getText());
        System.out.println("Region: " + regionField.getText());
        System.out.println("City: " + cityField.getText());
        System.out.println("Coordinates: " + latLonField.getText());
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


    public void selectTitleAndUpload(String filePath) {
        js.executeScript("window.scrollBy(0,400);");

        clickUsingJS(titleSelection);
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
        sendKeys(sundayStartTime,"05:00");
        click(sundayEndTime);
        sendKeys(sundayEndTime,"09:00");

    }
    public void selectWorkingDaySaturday() {
        js.executeScript("window.scrollBy(0,400);");
        click(saturday);
        click(saturdayStartTime);
        sendKeys(saturdayStartTime,"06:00");
        click(saturdayEndTime);
        sendKeys(saturdayEndTime,"09:00");


    }
}

