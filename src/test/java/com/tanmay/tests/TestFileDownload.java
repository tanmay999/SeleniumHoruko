package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.FileDownloadPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFileDownload extends BaseTest {

    @Test
    public void testFirstFileNotEmpty(){
        logger.info("Test first download filename not empty");
        FileDownloadPage fileDownloadPage = new FileDownloadPage();
        fileDownloadPage.navigate();
        String firstName = fileDownloadPage.getFirstFileName();
        Assert.assertTrue(firstName.isEmpty(),"First download link text should not be empty");

    }
}
