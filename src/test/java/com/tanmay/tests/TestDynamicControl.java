package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.DynamicControlsPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Test : Dynamic Controls")
public class TestDynamicControl extends BaseTest {

    @Test
    public void testEnableInput() throws InterruptedException {
        logger.info("Test enable input Field");
        DynamicControlsPage page = new DynamicControlsPage();
        page.navigate();
        Thread.sleep(4000);
        Assert.assertFalse(page.isInputEnabled(),"Input should be disabled initially ");
        page.clickEnableDisableInput();
        Thread.sleep(4000);
        Assert.assertTrue(page.isInputEnabled(),"Input should be enabled after clicking button");
       Assert.assertTrue(page.getMessage().contains("It's enabled"));
    }
}
