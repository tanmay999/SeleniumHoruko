package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SlideBarPage extends BasePage {

    private final By slidebar = By.cssSelector("input[type='range']");
    private final By slidVal = By.id("range");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"horizontal_slider");
    }


    public void moveSlideBarRight(int timer) throws InterruptedException {
        WebElement slideEl = getDriver().findElement(slidebar);
        for (int i = 0; i <timer; i++) {
            slideEl.sendKeys(Keys.RIGHT);
        }
    }


        public String getSliderVal(){
          return    getText(slidVal);
        }


}
