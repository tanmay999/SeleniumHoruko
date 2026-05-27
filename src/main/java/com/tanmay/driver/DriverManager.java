package com.tanmay.driver;

import com.tanmay.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private static WebDriver driver;


    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver webDriver) {
       driver = webDriver;
    }

    public static  void init(){
        String browser = PropertiesReader.readKey("browser");
      switch (browser.toLowerCase()){
          case "chrome" :
              ChromeOptions  chromeOptions = new ChromeOptions();
              chromeOptions.addArguments("--guest");
              driver = new ChromeDriver();
              break;
          case "edge":
              driver = new EdgeDriver();
              break;
          case "firefox":
              driver = new FirefoxDriver();
              break;
          default:
              driver = new ChromeDriver();
      }
      driver.manage().window().maximize();
    }

    public  static void down(){
        driver.quit();
        driver =null;
    }
}
