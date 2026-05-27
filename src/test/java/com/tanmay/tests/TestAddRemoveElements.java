package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.AddRemovePage;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Test : Add and Remove Button")
public class TestAddRemoveElements extends BaseTest {

@Test
@Severity(SeverityLevel.CRITICAL)
public void TestAddAndRemoveElement(){
    logger.info("Test add and then remove button");
    AddRemovePage addRemovePage = new AddRemovePage();
    addRemovePage.navigate();
    Assert.assertEquals(addRemovePage.getDeleteButtonCount(),0);
    addRemovePage.clickAddElement();
    Assert.assertEquals(addRemovePage.getDeleteButtonCount(),1);

}
@Test
@Severity(SeverityLevel.NORMAL)
public void testRemoveButton(){
    logger.info("Test remove button functioning ");
    AddRemovePage addRemovePage = new AddRemovePage();
    addRemovePage.navigate();
    Assert.assertEquals(addRemovePage.getDeleteButtonCount(),0);
    addRemovePage.clickAddElementNTimes(3);
    Assert.assertEquals(addRemovePage.getDeleteButtonCount(),3);
    addRemovePage.clickDeleteElement(0);
    Assert.assertEquals(addRemovePage.getDeleteButtonCount(),2);
    for(int i=0;i<2;i++) {
        addRemovePage.clickDeleteElement(0);
    }
    Assert.assertEquals(addRemovePage.getDeleteButtonCount(),0);
}
}
