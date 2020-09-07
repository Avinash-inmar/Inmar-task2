package webDriver;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseDriver {
	public static WebDriver driver;
	
	@BeforeMethod
	public void setBaseDriver() throws MalformedURLException {
		driver = setDriver(createDriver());
	}
	
	public WebDriver setDriver (WebDriver driver) {
		return driver;
	}
	
	public WebDriver createDriver() throws MalformedURLException {
		return WebDriverLoader.loadDriver();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	
	@AfterMethod
	public void afterTest() {
		driver.quit();
	}
}
