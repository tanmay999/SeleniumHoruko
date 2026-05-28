package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.DynamicContentPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestDynamicContent extends BaseTest {

    @Test
    public void checkContentChangesOnRefresh(){
        DynamicContentPage dynamicContentPage = new DynamicContentPage();

        dynamicContentPage.navigate();
        List<String> before = dynamicContentPage.getRowTexts();
        dynamicContentPage.refresh();
        List<String> after =dynamicContentPage.getRowTexts();


    }
}
