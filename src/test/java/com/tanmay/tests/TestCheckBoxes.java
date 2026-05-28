package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.CheckBoxPages;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Test : check and uncheck checkboxes")
public class TestCheckBoxes extends BaseTest {

    @Test
    public void TestCheckBox1() throws InterruptedException {
        CheckBoxPages checkBoxPages = new CheckBoxPages();
        checkBoxPages.navigate();

        Assert.assertFalse(checkBoxPages.isCheckbox1Checked(),"checkbox1 should be unchecked");
        Assert.assertTrue(checkBoxPages.isCheckbox2Checked(),"checkbox2 should be checked");

        checkBoxPages.checkCheckBox1();




        Assert.assertTrue(checkBoxPages.isCheckbox1Checked(),"checkbox1 should be checked");
        Assert.assertTrue(checkBoxPages.isCheckbox2Checked(),"checkbox2 should be checked");


    }
}
