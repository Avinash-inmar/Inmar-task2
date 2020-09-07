package Components;


import org.openqa.selenium.WebElement;

import webDriver.DriverFactory;

public class SettingsPage extends DriverFactory {
	
	private String settingsIcon  = "//android.widget.FrameLayout[@content-desc=\"Settings\"]";
	private String selectOptionUnderApp = "//android.widget.LinearLayout[@resource-id=\"com.coinmarketcap.android:id/default_currencies\"]";
    private String searchIconUnderSettings = "//android.widget.ImageView[@content-desc=\"Search\"]";
    private String searchField = "//android.widget.EditText[@resource-id=\"com.coinmarketcap.android:id/search_src_text\"]";
    private String CountryOption = "//android.widget.TextView[@text=\"Hong Kong Dollar\"]";
	private String backButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton";
	private String textForDefaultCurrencyUnderApp = "//android.widget.TextView[@resource-id=\"com.coinmarketcap.android:id/default_currencies_text\"]";
    private String SwitchToMode = "//android.widget.TextView[@resource-id=\"com.coinmarketcap.android:id/theme_text\"]";
    private String ContinueToMarketCapLink = "//android.widget.TextView[@resource-id=\"com.coinmarketcap.android:id/onboarding_home\"]";
	
    private WebElement getSettingsIcon() {
		return findElementByXpath(settingsIcon);
	}

	public void clickOnSettingsIcon() {
		getSettingsIcon().click();
	}
	
	private WebElement getOptionUnderApp() {
		return findElementByXpath(selectOptionUnderApp);
	}
	
	public void clickOnOptionUnderApp() {
		getOptionUnderApp().click();
	}
	
	private WebElement getSearchIcon() {
		return findElementByXpath(searchIconUnderSettings);
	}
	
	public void clickSearchIcon() {
		getSearchIcon().click();
	}
	
	private WebElement getSearchField() {
		return findElementByXpath(searchField);
	}
	
	public void sendTextInSearchField(String Country) {
		getSearchField().sendKeys(Country);
	}
	
	private WebElement getCountryOption() {
		return findElementByXpath(CountryOption);
	}
	
	public void clickCountryOption() throws InterruptedException {
		getCountryOption().click();
		Thread.sleep(3000);
		findElementByXpath(backButton).click();
		Thread.sleep(3000);
	}
	
	public String getTextForDefaultCurrencyOpationUnderApp() {
		String DefaultCurrencyText = findElementByXpath(textForDefaultCurrencyUnderApp).getText();
		System.out.println(DefaultCurrencyText);
		return DefaultCurrencyText;
	}
	
	public void selectDefaultCountry() throws InterruptedException {
		clickOnSettingsIcon();
		clickOnOptionUnderApp();
		clickSearchIcon();
		sendTextInSearchField("Hong Kong");
		clickCountryOption();
	}
	
	private WebElement getSwitchToModeOption() {
		return findElementByXpath(SwitchToMode);
	}
	
	public void clickOnContinueToMarketCapLink() throws InterruptedException {
		findElementByXpath(ContinueToMarketCapLink).click();
		Thread.sleep(5000);
	}

	public String clickSwitchToModeOption() {
		clickOnSettingsIcon();
		String PreviousText = getSwitchToModeOption().getText();
		System.out.println(PreviousText);
		getSwitchToModeOption().click();
		String AfterModeChangeText = getSwitchToModeOption().getText();
		System.out.println(AfterModeChangeText);
		return AfterModeChangeText;
	}
}
