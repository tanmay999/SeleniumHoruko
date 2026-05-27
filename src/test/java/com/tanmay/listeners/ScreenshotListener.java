package com.tanmay.listeners;

import com.tanmay.driver.DriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotListener implements ITestListener {

    public void onTestFailure(ITestResult result){
        WebDriver driver = DriverManager.getDriver();
        String methodName =result.getName();
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        if(driver!=null){
            try {

                File scrFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                String screenshotPath ="failure_screenshots/"+methodName+"_"+timestamp+".png";
                new File("failure_screenshots").mkdirs();
                FileUtils.copyFile(scrFile,new File(screenshotPath));
                Reporter.log("<a href='"+screenshotPath+"'> Screenshot</a>");
                Allure.addAttachment("Screenshot on failure","image/png",new FileInputStream(screenshotPath),"png");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
