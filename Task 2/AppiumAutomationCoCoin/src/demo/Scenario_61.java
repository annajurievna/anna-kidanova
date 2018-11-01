package demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Scenario_61 {
	
	static RemoteWebDriver myDriver;
	
	@BeforeClass
	public void setUp() throws Exception {
		File app = new File("/Users/annakidanova/Downloads", "CoCoin.apk");
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(CapabilityType.BROWSER_NAME, "");
		capability.setCapability(CapabilityType.VERSION, "4.4.2");
		capability.setCapability("app", app.getAbsolutePath());
		capability.setCapability("deviceName","Nexus_5_API_19");
		capability.setCapability("platformName","Android");
		capability.setCapability("appPackage", "com.nightonke.cocoin");
		capability.setCapability("appActivity", "com.nightonke.saver.activity.AccountBookReportViewActivity");
		myDriver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capability);
	}
	
	@Test 
	public void testBookReportView() throws MalformedURLException {
		if(!myDriver.findElementById("com.nightonke.cocoin:id/title").getText().contains("Expense Report")) {
			Assert.fail("Test BookReportView failed: wrong report opened");
		}
		if(!myDriver.findElementById("com.nightonke.cocoin:id/logo_white").getText().contains("CoCoin")) {
			Assert.fail("Test BookReportView failed: wrong title");
		}
		if(myDriver.findElementByClassName("android.widget.ImageButton") == null ) {
			Assert.fail("Test BookReportView failed: calendar is missing");
		}
	}
		
	
	@AfterClass
    public void tearDown() throws Exception {
		myDriver.quit();
    }
}
