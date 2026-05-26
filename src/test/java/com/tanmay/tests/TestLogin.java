package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.LoginPage;
import com.tanmay.pages.SecureAreaPage;
import com.tanmay.utils.PropertiesReader;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestLogin extends BaseTest {

    @Test
    public void TestValidLogin(){
        LoginPage loginPage = new LoginPage();
        SecureAreaPage secureAreaPage = loginPage.loginWithValidCred();
        String message = secureAreaPage.getFlashMessage();
        assertThat(message).contains(PropertiesReader.readKey("expected_secure_message"));
    }

}
