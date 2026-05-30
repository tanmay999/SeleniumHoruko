package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.SlideBarPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSliderRight extends BaseTest {


   @Test
    public void SlideBarMoveRight() throws InterruptedException {
        SlideBarPage slideBarPage = new SlideBarPage();
        slideBarPage.navigate();
        slideBarPage.moveSlideBarRight(4);
        Thread.sleep(4000);
        Assert.assertEquals(slideBarPage.getSliderVal(),"2","not equal value;");
    }


}
