package com.tanmay.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelpers {

    public static void checkVisibility(WebDriver driver, By locator){
               new WebDriverWait(driver, Duration.ofSeconds(10))
                       .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static  void checkVisibility(WebDriver driver,By locator,int timeSeconds){
        new WebDriverWait(driver,Duration.ofSeconds(timeSeconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForTextPresent(WebDriver driver,By locator,String text,int timeSeconds){
        new WebDriverWait(driver,Duration.ofSeconds(timeSeconds)).until(ExpectedConditions.textToBePresentInElementLocated(locator,text));
    }

    public static  void waitForElementClickable(WebDriver driver,By locator,int timeSeconds ){
        new WebDriverWait(driver,Duration.ofSeconds(timeSeconds)).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public   static  void waitForInvisibility(WebDriver driver,By locator,int timeSeconds){
        new WebDriverWait(driver,Duration.ofSeconds(timeSeconds))
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public   static  void presenceOfElement(WebDriver driver,By locator,int timeSeconds){
        new WebDriverWait(driver,Duration.ofSeconds(timeSeconds))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void checkVisibilityByFluentWait(WebDriver driver,By locator){
        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
