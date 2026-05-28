package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.DropdownPages;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

@Feature("test : dropdown")
public class TestDropdown extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void TestSelectOption1() throws InterruptedException {
        logger.info("Test : select option1");
        DropdownPages page = new DropdownPages();
        page.navigate();
        page.selectByVisibleText("Option 1");
        Assert.assertEquals(page.getSelectedOptions(),"Option 1dd");
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void TestSelectedOptions1() throws InterruptedException {
        logger.info("test : select option2");
        DropdownPages dropdownPages = new DropdownPages();
        dropdownPages.navigate();
        dropdownPages.selectByValue("2");
        Assert.assertEquals(dropdownPages.getSelectedOptions(),"Option 2");



    }
}
