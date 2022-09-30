package incharge.test.utils;

import org.testng.annotations.DataProvider;

public class DataProviderCredential {

    private static final String EMAIL = "yxwuz1nkiq0a7zdnbsxc.auto@bcvouch.com";
    private static final String ACCOUNT_PASSWORD = "StrongPa$$w0rd";
    private static final String CONFIRM_PASSWORD = "353535";


    @DataProvider
    public static Object[][] inputDetails() {
        return new Object[][]{
                {EMAIL, ACCOUNT_PASSWORD, CONFIRM_PASSWORD}};
    }
}
