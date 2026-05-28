package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.DisappearingElementPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDisappearingElements extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void TestNavItemsAtLeastFour() throws InterruptedException {
        logger.info("Test :disappearing element nav count");
        DisappearingElementPage page = new DisappearingElementPage();
        for(int i=0;i<3;i++) {
            page.navigate();
            int count = page.getNavItemsCount();
            logger.info("Nav item count:" + count);
            Assert.assertTrue(count >= 4, "Should have atleast 4 nav Items, found" + count);

        }
        page.navigate();
        int count = page.getNavItemsCount();
        logger.info("Nav item count:" + count);
        Assert.assertTrue(count >= 5, "Should have atleast 4 nav Items, found" + count);

    }
}
