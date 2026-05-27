package com.tanmay.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer {

    public void transformer(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethos){
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }
}
