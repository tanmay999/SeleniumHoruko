package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.JavaScriptAlertPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAlert extends BaseTest {

    @Test
    public void checkAlert() throws InterruptedException {
        JavaScriptAlertPage javaScriptAlertPage = new JavaScriptAlertPage();
        javaScriptAlertPage.navigate();
        javaScriptAlertPage.clickAlertAndAccept();
        javaScriptAlertPage.clickConfirmAlert();
        javaScriptAlertPage.clickCancelAlert();
        javaScriptAlertPage.clickSendTextAlert();
        Assert.assertEquals( javaScriptAlertPage.getTextAlert(),"You entered: test alert","the data isnot there in alert popup");
    }
}
