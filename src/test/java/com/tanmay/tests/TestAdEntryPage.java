package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.EntryAdPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdEntryPage extends BaseTest {

   @Test
    public void testModalAppearsOnLoad(){
        logger.info("Test : entry ad modal appears on load");
        EntryAdPage entryAdPage = new EntryAdPage();
        entryAdPage.navigate();
        Assert.assertTrue(entryAdPage.isaModalDisplayed(),"Modal should be displayed on page laod");
    }

    @Test
    public void TestCloseModal() throws InterruptedException {
       logger.info("Test add closed button");
       EntryAdPage entryAdPage = new EntryAdPage();
       entryAdPage.navigate();
       Thread.sleep(4000);
       entryAdPage.isaModalDisplayed();
       entryAdPage.closeModal();
       Assert.assertTrue(entryAdPage.isModalClosed(),"Modal is not closed ");
    }
}
