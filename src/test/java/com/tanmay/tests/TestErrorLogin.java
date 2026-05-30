package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.ForgotPasswordPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestErrorLogin extends BaseTest {

    @Test
    public void checkLoginError(){
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
        forgotPasswordPage.navigate();
        forgotPasswordPage.submitWrongEmails("jhbjcndk");
      Assert.assertEquals( forgotPasswordPage.getPageHeading(),"Internal Server Error","login should fail");
    }
}
