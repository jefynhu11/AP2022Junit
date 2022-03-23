package org.example.testcases;

import org.example.supports.BaseTest;
import org.example.tasks.IndexTask;
import org.example.webdrivers.DriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class SearchClubInterTestCase extends BaseTest {

    private final WebDriver driver = DriverManager.getDriver();
    private final IndexTask indexTask = new IndexTask(driver);

    @Test
    public void test() throws InterruptedException {
        indexTask.search();
        Thread.sleep(3000);
    }

}
