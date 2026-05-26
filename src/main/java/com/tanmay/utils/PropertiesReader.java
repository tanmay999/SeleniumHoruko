package com.tanmay.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static String readKey(String key) {
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/data.properties");
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("failed to load data from data.proprties file");
        }


        return properties.getProperty(key);
    }
}
