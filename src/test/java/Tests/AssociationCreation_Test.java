package Tests;

import Hooks.Hook;
import PageObjects.AssociationCreation;
import PageObjects.LoginPage;
import Utils.ExcelUtils;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


public class AssociationCreation_Test extends Hook {

    /*@Test(dataProvider = "loginData", dataProviderClass = Utils.ExcelDataProvider.class, priority = 1)
        public void loginTest(String email, String password) {
            LoginPage loginPage = new LoginPage(driver);

            loginPage.clickCloseButton();
            loginPage.clickExploreButton();
            loginPage.login(email, password);

         Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed for: " + email);
        }*/

    @Test(
            dataProvider = "AssociationDetailsData",
            dataProviderClass = Utils.ExcelDataProvider.class
    )

    public void createNewAssociation(String username,
                                     String password,
                                     String email,
                                     String phoneNumber,
                                     String whatsapp,
                                     String website,
                                     String organisationName,
                                     String shortName,
                                     String description,
                                     String objectives,
                                     String activities,
                                     String name,
                                     String officeemail,
                                     String mobilenumber,
                                     String name1,
                                     String officeemail1,
                                     String mobilenumber1) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.clickCloseButton();
        loginPage.clickExploreButton();
        loginPage.login(username, password);

        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed for: " + email);
        AssociationCreation associationCreation = new AssociationCreation(driver);
        associationCreation.openMyPages();
        associationCreation.clickRegisterNewAssociation();

        associationCreation.uploadCoverPhoto(
                "C:\\Loka_KeralamOnline_QA-main\\src\\test\\resources\\uploads\\association.jpg"
        );
        associationCreation.saveCoverPhoto();

        associationCreation.uploadProfileLogo(
                "C:\\Loka_KeralamOnline_QA-main\\src\\test\\resources\\uploads\\association.jpg"
        );
        associationCreation.saveProfilePhoto();

        associationCreation.fillContactDetails(
                email,
                phoneNumber,
                whatsapp,
                website
        );
        associationCreation.fillAssociationDetails(
                organisationName,
                shortName
        );

        associationCreation.moveMarkerToKuwaitAndGetDetails();
        associationCreation.enterDescription(description);
        associationCreation.enterObjectives(objectives);
        associationCreation.enterActivities(activities);
        associationCreation.enterOfficeBearerDetails(name, officeemail, mobilenumber);
        associationCreation.enterOfficeBearerDetailsTwo(name1, officeemail1, mobilenumber1);
        associationCreation.selectTitleAndUpload("C:\\Loka_KeralamOnline_QA-main\\src\\test\\resources\\uploads\\file-example_PDF_1MB.pdf", "Copy of Registration Certificate");
        associationCreation.selectFacilities();
        associationCreation.selectWorkingDaySunday();
        associationCreation.selectWorkingDaySaturday();
    }
}
