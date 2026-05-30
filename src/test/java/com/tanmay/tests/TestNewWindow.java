package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.MultipleWindowPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNewWindow extends BaseTest {

    @Test
    public void testNewWindow(){
        MultipleWindowPage multipleWindowPage = new MultipleWindowPage();
        multipleWindowPage.navigate();
        multipleWindowPage.switchToNewWindow();
        multipleWindowPage.clickOpenNewWindow();
    }
}
