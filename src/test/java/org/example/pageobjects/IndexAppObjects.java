package org.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexAppObjects {
    private final WebDriver driver;

    public IndexAppObjects(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchTextFiled() {
        return driver.findElement(By.name("q"));
    }
}
