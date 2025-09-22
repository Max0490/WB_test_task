package ru.shoptesting.core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void setUpBrowser() {

        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.browserSize = "1366x768";
        Configuration.screenshots = true;
        Configuration.savePageSource = false;
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}


