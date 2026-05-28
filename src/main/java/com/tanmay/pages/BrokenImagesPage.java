package com.tanmay.pages;

import com.tanmay.base.BasePage;
import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokenImagesPage extends BasePage {
    private final By images = By.cssSelector("div#content img");


    public void navigate(){
        openUrl(PropertiesReader.readKey("base_url")+"broken_images");
    }

    public int getTotalImageCount(){
        return getDriver().findElements(images).size();
    }


    public long getBrokenImageCount(){
        List<WebElement> imgs= getDriver().findElements(images);
        return imgs.stream()
                .filter(img->{
                    String src =img.getAttribute("src");
                     return src==null || src.isEmpty();
        }).count();

    }


    public List<WebElement> getAllImages(){
        return  getDriver().findElements(images);
    }
}
