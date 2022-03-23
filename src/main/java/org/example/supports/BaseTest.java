package org.example.supports;

import org.example.webdrivers.DriverManager;
import org.example.webdrivers.Drivers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.example.webdrivers.DriverFactory.driver;
import static org.example.webdrivers.DriverFactory.getBrowser;

public class BaseTest {
    @BeforeAll
    public static void setUp(){
        driver = getBrowser(Drivers.CHROME);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().get("https://www.google.com/");
    }

    @AfterAll
    public static void tearDown(){
        DriverManager.quit();
    }
}
