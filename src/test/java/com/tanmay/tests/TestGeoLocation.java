package com.tanmay.tests;

import com.tanmay.base.BaseTest;
import com.tanmay.pages.GeoLocationPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGeoLocation extends BaseTest {

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void testWhereAmIButtonPresent(){
        logger.info("Test :  geoLocation ");
        GeoLocationPage page = new GeoLocationPage();
        page.navigate();
        page.clickButton();
        Assert.assertFalse(page.getLatitude().isEmpty(),"lat long is empty");
    }
}
