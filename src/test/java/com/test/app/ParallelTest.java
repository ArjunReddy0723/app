package com.test.app;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ParallelTest extends BaseIOSTest {

    @Test
    public void test() {
        driver.findElementByAccessibilityId("Alerts").click();
        driver.findElementByAccessibilityId("Create App Alert").click();
        driver.findElementByAccessibilityId("Will do").click();
        driver.findElementByAccessibilityId("Back").click();
        driver.findElementByAccessibilityId("Attributes").click();
        driver.findElementByAccessibilityId("Second").click();
        driver.findElementByAccessibilityId("First").click();
        driver.findElementByAccessibilityId("Back").click();
        driver.findElementByAccessibilityId("Scrolling").click();
        driver.findElementByAccessibilityId("TableView").click();
        driver.findElementByAccessibilityId("Back").click();
        driver.findElementByAccessibilityId("ScrollView").click();
        driver.findElementByAccessibilityId("Back").click();
    }

}

