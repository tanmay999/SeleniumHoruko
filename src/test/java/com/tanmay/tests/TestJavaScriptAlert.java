package com.tanmay.tests;

import com.tanmay.base.BasePage;
import com.tanmay.base.BaseTest;
import com.tanmay.pages.JavaScriptErrorPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJavaScriptAlert extends BaseTest {


    @Test
    public void javaScripErrorDetected(){
        JavaScriptErrorPage javaScriptErrorPage = new JavaScriptErrorPage();
        javaScriptErrorPage.navigate();
        Assert.assertTrue(javaScriptErrorPage.hasJavaScriptError(),"error is not present");
    }
}
