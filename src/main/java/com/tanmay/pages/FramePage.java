package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import com.tanmay.utils.WaitHelpers;
import org.openqa.selenium.By;

public class FramePage extends BasePage {

    private final By iframeLink = By.linkText("iFrame");
    private final By nestedFramesLink = By.linkText("Nested Frames");
    private final By iframeId =By.id("mce_0_ifr");
    private final By editorFrame =By.id("tinymce");




    public void navigateToFrameIndex(){
        openUrl(PropertiesReader.readKey("base_url")+"frames");
    }

    public void navigateToIFramePage(){
        openUrl(PropertiesReader.readKey("base_url")+"iframe");
    }

    public void navigateToNestedFramePage(){
        openUrl(PropertiesReader.readKey("base_url")+"nested_frames");
    }


    public boolean isNestedFramePresent(){
        return !getDriver().findElements(By.cssSelector("frame[name='frame-top'")).isEmpty();
    }

    public String getIFrameEditorText(){
        WaitHelpers.checkVisibility(getDriver(),iframeId,10);
        getDriver().switchTo().frame(getDriver().findElement(iframeId));
        String text = getText(editorFrame);
        getDriver().switchTo().defaultContent();
        return  text;
    }



}
