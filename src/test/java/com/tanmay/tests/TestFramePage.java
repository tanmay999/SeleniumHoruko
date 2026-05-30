package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.FramePage;
import com.tanmay.utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFramePage extends BaseTest {

    @Test
    public void TestIframeEditorHasText(){
        FramePage framePage = new FramePage();
        framePage.navigateToIFramePage();
        String editorText= framePage.getIFrameEditorText();
        Assert.assertNotNull(editorText,"Editor text should not be null");
        Assert.assertFalse(editorText.isEmpty(),"Editor text should not be empty");

    }


    @Test
    public void TestNestedFramePresence(){
        FramePage framePage = new FramePage();
        framePage.navigateToNestedFramePage();
        Assert.assertTrue(framePage.isNestedFramePresent(),"Not present nested frame top");
    }
}
