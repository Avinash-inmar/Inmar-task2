package Components;

import org.openqa.selenium.WebElement;

import webDriver.DriverFactory;

public class LoginPage extends DriverFactory {
	
	private String loginButton = "//android.widget.Button[@resource-id=\"com.coinmarketcap.android:id/onboarding_login\"]";
	private String EmailField  ="//android.widget.EditText[@resource-id=\"com.coinmarketcap.android:id/login_email\"]";
	private String PasswordField  ="//android.widget.EditText[@resource-id=\"com.coinmarketcap.android:id/login_password\"]";
	private String LoginButtonOnCredentialsScreen  = "//android.widget.Button[@resource-id=\"com.coinmarketcap.android:id/login_button\"]";
	private String priceIcon  = "//android.widget.FrameLayout[@resource-id=\"com.coinmarketcap.android:id/tab_market\"]";
	
	private WebElement getLoginButton() {
		return findElementByXpath(loginButton);	
	}
	
	private void clickLoginButton() throws InterruptedException {
		getLoginButton().click();
		Thread.sleep(5000);
	}
	
	private WebElement getEmailField() {
		return findElementByXpath(EmailField);
	}
	
	private void enterEmailInEmailField(String Username) throws InterruptedException {
		getEmailField().click();
		Thread.sleep(2000);
		getEmailField().sendKeys(Username);
	}
	
	private WebElement getPasswordField() {
		return findElementByXpath(PasswordField);
	}
	
	private void enterPasswordInPasswordField(String Password) {
		getPasswordField().click();
		getPasswordField().sendKeys(Password);
	}
	
	private WebElement getLoginButtonOnCredentialsScreen() {
		return findElementByXpath(LoginButtonOnCredentialsScreen);	
	}
	
	private void clickLoginButtonOnCredentialsScreen() {
		getLoginButtonOnCredentialsScreen().click();	
	}
	
	public CryptoassetsPage loginToMarketCapApplication(String Username, String Password) throws InterruptedException {
		clickLoginButton();
		enterEmailInEmailField(Username);
		enterPasswordInPasswordField(Password);
		clickLoginButtonOnCredentialsScreen();
		Thread.sleep(15000);
		clickPriceIcon();
	    return new CryptoassetsPage();
	}
	
	private WebElement getPriceIcon() {
		return findElementByXpath(priceIcon);	
	}
	
	private void clickPriceIcon() {
		getPriceIcon().click();	
	}
	
}
