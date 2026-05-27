package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.BrokenImagesPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Test : Broken Images")
public class TestBrokenImages extends BaseTest {

    @Test
    public void testImageCountIsPositive(){
        logger.info("test broken images count");
        BrokenImagesPage page = new BrokenImagesPage();
        page.navigate();
        long brokenCount =page.getBrokenImageCount();
        Assert.assertTrue(page.getTotalImageCount()> page.getBrokenImageCount(),"Not all img should have empty source");
    }
}
