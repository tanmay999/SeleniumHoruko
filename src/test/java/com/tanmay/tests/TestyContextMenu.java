package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.ContextMenuPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestyContextMenu extends BaseTest{

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void testRightClickShowAlert(){
        logger.info("test right click and find the alert text");
        ContextMenuPage contextMenuPage = new ContextMenuPage();
        contextMenuPage.navigate();
        String alertText = contextMenuPage.rightClickAndGetAlertText();
        Assert.assertNotNull(alertText,"Alert text should not be null");
        Assert.assertEquals(alertText,"You selected a context menu","alert popup message is not as perexpectation");
    }
}
