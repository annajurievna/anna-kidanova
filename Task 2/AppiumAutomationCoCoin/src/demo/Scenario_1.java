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

public class Scenario_1 {
	
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
		capability.setCapability("appActivity", "com.nightonke.saver.activity.SetPasswordActivity");
		myDriver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		System.out.println("App launched");
	}
	
	@Test 
	public void testSettingPassword() throws MalformedURLException{
		List<WebElement> codeNumbers = myDriver.findElementsById("com.nightonke.cocoin:id/textview");
		codeNumbers.get(0).click();
		codeNumbers.get(1).click();
		codeNumbers.get(2).click();
		codeNumbers.get(3).click();
		if(myDriver.findElementsById("com.nightonke.cocoin:id/password_tip") == null) {
			Assert.fail("Test SettingPassword failed during enetering for the first time");
		} 
		else {
			myDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			codeNumbers.get(0).click();
			codeNumbers.get(1).click();
			codeNumbers.get(2).click();
			codeNumbers.get(3).click();
			myDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			if(myDriver.findElementsById("com.nightonke.cocoin:id/guillotine_title") == null) {
				Assert.fail("Test SettingPassword failed during enetering for the second time");
			}
		}
		
	}
	
	@AfterClass
    public void tearDown() throws Exception {
		myDriver.quit();
    }
}
