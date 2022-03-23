package org.example.tasks;

import org.example.pageobjects.IndexAppObjects;
import org.openqa.selenium.WebDriver;

public class IndexTask {
    private final WebDriver driver;
    private final IndexAppObjects indexAppObjects;

    public IndexTask(WebDriver driver) {
        this.driver = driver;
        indexAppObjects = new IndexAppObjects(driver);
    }

    public void search() {
        indexAppObjects.getSearchTextFiled().sendKeys("Inter");
    }
}
