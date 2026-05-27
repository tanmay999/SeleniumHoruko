package com.tanmay.base;

import com.tanmay.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BaseTest {

    protected  WebDriver driver;
    protected Logger logger = Logger.getLogger(String.valueOf(this.getClass()));

    public WebDriver getDriver(){
       return DriverManager.getDriver();
    }

    @BeforeMethod
    public void setup(){
        DriverManager.init();
        driver = DriverManager.getDriver();
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }



}
