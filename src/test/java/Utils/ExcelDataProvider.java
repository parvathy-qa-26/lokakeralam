package Utils;

import org.testng.annotations.DataProvider;
import java.io.IOException;

public class ExcelDataProvider {

    @DataProvider(name = "registrationData")
    public static Object[][] getRegistrationData() throws IOException {
        return ExcelUtils.getTestData(
                "src/test/resources/testdata/registrationData.xlsx",
                "Sheet1"
        );
    }
    @DataProvider(name = "loginData")
    public static Object[][] getLoginData() throws IOException {
        return ExcelUtils.getTestData(
                "src/test/resources/testdata/registrationData.xlsx",
                "Logincredentials"
        );
    }

    @DataProvider(name = "AssociationDetailsData")
    public Object[][] getContactDetailsData() {

        Object[][] data = null;

        try {
            data = ExcelUtils.getTestData(
                    System.getProperty("user.dir")
                            + "/src/test/resources/testdata/registrationData.xlsx",
                    "Associationdetails"
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }


}