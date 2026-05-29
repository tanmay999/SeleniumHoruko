package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.FileUploadPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFileUpload extends BaseTest {

    @Test
    public void FileUpload(){
        FileUploadPage fileUploadPage = new FileUploadPage();
        fileUploadPage.navigate();
        String content= fileUploadPage.uploadFile("/Users/tanmaydandapat/Documents/SeleniumHoruko/regression.xml");
        Assert.assertEquals(content,"File Uploaded!","File upload failed");
    }

}
