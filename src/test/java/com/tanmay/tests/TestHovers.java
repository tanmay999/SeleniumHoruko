package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.HoverPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHovers extends BaseTest {

    @Test
    public void TestHoverRevealsCaptionOnFirstFigures(){
        HoverPage hoverPage = new HoverPage();
        hoverPage.navigate();
        hoverPage.hoverOverFigures(1);
        String caption =hoverPage.getFigCaptionText(1);
        Assert.assertTrue(caption.contains("user2"),"caption should contain the user info");

    }
}
