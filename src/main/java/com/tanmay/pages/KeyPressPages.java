package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class KeyPressPages extends BasePage {

 private final By inputText = By.id("target");
 private final By resultText =By.id("result");

 public void navigate(){
     openUrl(PropertiesReader.readKey("base_url")+"key_presses");
 }

 public void keyPresses(Keys key){
     enterInput(inputText,key.toString());

 }

 public void pressEnter(){
     getDriver().findElement(inputText).sendKeys(Keys.ENTER);
 }

 public String getResult(){
     return getText(resultText);
 }



}
