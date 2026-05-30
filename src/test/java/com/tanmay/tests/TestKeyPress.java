package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.KeyPressPages;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestKeyPress extends BaseTest {

    @Test
    public void TestPressEnter(){
        KeyPressPages keyPressPages = new KeyPressPages();
        keyPressPages.navigate();
        keyPressPages.pressEnter();
        Assert.assertTrue(keyPressPages.getResult().contains("ENTER"),"ENTER");

        keyPressPages.keyPresses(Keys.TAB);
        Assert.assertTrue(keyPressPages.getResult().contains("TAB"),"TAB");

        keyPressPages.keyPresses(Keys.SPACE);
        Assert.assertTrue(keyPressPages.getResult().contains("SPACE"),"SPACE");
    }
}
