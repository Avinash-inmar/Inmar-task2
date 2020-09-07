package webDriver;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverLoader {
	
	public static WebDriver driver;
	
	private static WebDriver setAndroidCapibilites() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "10");  // OS Version
		capabilities.setCapability("deviceName", "POCO F1"); // Model Number 
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage","com.coinmarketcap.android");
		capabilities.setCapability("appActivity", "com.coinmarketcap.android.LaunchActivity");
		capabilities.setCapability("FULL_RESET", false);
		capabilities.setCapability("FULL_RESET", false);
		return new RemoteWebDriver(new java.net.URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	public static WebDriver loadDriver() throws MalformedURLException {
		driver = setAndroidCapibilites();
		return driver;
	}

}
