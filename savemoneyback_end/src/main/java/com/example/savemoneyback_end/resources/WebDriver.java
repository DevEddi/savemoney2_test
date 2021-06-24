package com.example.savemoneyback_end.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface WebDriver {
    void get(String s);

    WebElement findElement(By id);

    org.openqa.selenium.WebDriver.Options manage();

    void quit();
}
