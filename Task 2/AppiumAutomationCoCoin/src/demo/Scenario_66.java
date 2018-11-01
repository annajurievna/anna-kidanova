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

public class Scenario_66 {
	
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
		capability.setCapability("appActivity", "com.nightonke.saver.activity.AboutActivity");
		myDriver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capability);
	}
	
	@Test 
	public void testAboutPage() throws MalformedURLException {
		if(!myDriver.findElementById("com.nightonke.cocoin:id/content_0").getText().contains("About")) {
			Assert.fail("Test AboutPage failed: wrong page opened");
		}
		if(!myDriver.findElementById("com.nightonke.cocoin:id/content_1").getText().contains("Nightonke")) {
			Assert.fail("Test AboutPage failed: wrong content");
		}
		if(!myDriver.findElementById("com.nightonke.cocoin:id/content_2").getText().contains("github.com")) {
			Assert.fail("Test AboutPage failed: wrong content");
		}
		if(!myDriver.findElementById("com.nightonke.cocoin:id/content_3").getText().contains("blog.csdn.net")) {
			Assert.fail("Test AboutPage failed: wrong content");
		}
		if(!myDriver.findElementById("com.nightonke.cocoin:id/content_4").getText().contains("outlook.com")) {
			Assert.fail("Test AboutPage failed: wrong content");
		}
		if(!myDriver.findElementById("com.nightonke.cocoin:id/content_6").getText().contains("daimajia.androidanimations")) {
			Assert.fail("Test AboutPage failed: wrong content");
		}
		if(!myDriver.findElementById("com.nightonke.cocoin:id/content_7").getText().contains("material")) {
			Assert.fail("Test AboutPage failed: wrong content");
		}
	}
		
	
	@AfterClass
    public void tearDown() throws Exception {
		myDriver.quit();
    }
}
