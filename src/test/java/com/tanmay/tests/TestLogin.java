package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.LoginPage;
import com.tanmay.pages.SecureAreaPage;
import com.tanmay.utils.PropertiesReader;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Feature("TestLogin")
public class TestLogin extends BaseTest {

    @Test
    public void TestValidLogin(){
        LoginPage loginPage = new LoginPage();
        SecureAreaPage secureAreaPage = loginPage.loginWithValidCred();
        String message = secureAreaPage.getFlashMessage();
        assertThat(message).contains(PropertiesReader.readKey("expected_secure_message"));
    }

    @Test
    public void TestInvalidLogin(){
        logger.info("Test : invalid Login");
        LoginPage loginPage = new LoginPage();
        String errorMessage = loginPage.invalidCredLogin();
        assertThat(errorMessage).isNotBlank();
        Assert.assertTrue(errorMessage.contains(PropertiesReader.readKey("expected_error_login_message")));


    }

}
