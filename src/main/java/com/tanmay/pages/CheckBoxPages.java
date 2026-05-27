package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxPages extends BasePage {

    protected  final By checkboxes= By.cssSelector("form#checkboxes input[type='checkbox']");

    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"/checkboxes");
    }

    private List<WebElement> getCheckBoxes(){
        return getDriver().findElements(checkboxes);
    }

    public boolean isCheckbox1Checked() {
        return getCheckBoxes().get(0).isSelected();
    }

    public boolean isCheckbox2Checked() {
        return getCheckBoxes().get(1).isSelected();
    }


    public void checkCheckBox1(){
        WebElement wb1 = getCheckBoxes().get(0);
        if(!wb1.isSelected()){
            wb1.click();
        }
    }

    public void uncheckCheckBox1(){
        WebElement wb1 = getCheckBoxes().get(0);
        if(wb1.isSelected()){
            wb1.click();
        }
    }


    public void checkCheckBox2(){
        WebElement wb2 = getCheckBoxes().get(1);
        if(!wb2.isSelected()){
            wb2.click();
        }
    }

    public void uncheckCheckBox2(){
        WebElement wb2 = getCheckBoxes().get(1);
        if(wb2.isSelected()){
            wb2.click();
        }
    }
}
