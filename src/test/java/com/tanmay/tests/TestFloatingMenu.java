package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.FloatingMenuPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFloatingMenu  extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void  TestMenuVisibleAfterScroll() throws InterruptedException {
        logger.info("test : floating menu visible");
        FloatingMenuPage floatingMenuPage = new FloatingMenuPage();
        floatingMenuPage.navigate();
        Assert.assertEquals(floatingMenuPage.getMenuLinksCount(),4,"menu should have  exactly 4  links");
        floatingMenuPage.scrollToBottom();
        Assert.assertTrue(floatingMenuPage.isMenuStillVisible(),"menu should be visible ");
    }
}
