package Components;

import org.openqa.selenium.WebElement;

import webDriver.DriverFactory;

public class CryptoassetsPage extends DriverFactory {
	
	private String Crytoassetstab = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Cryptoassets\"]/android.widget.TextView";
    private String SortByOption = "//android.widget.TextView[@resource-id=\"com.coinmarketcap.android:id/sorting_option_sort_by\"]";
	private String MarketCapOptionUnderSortBy = "//android.widget.TextView[@text=\"Market Cap\"]";
    private String Bitcoin = "//android.widget.TextView[@text=\"Bitcoin\"]";
    private String priceDetails = "//android.widget.TextView[@resource-id=\"com.coinmarketcap.android:id/main_price\"]";
	
	private WebElement getCryptoassetsTab() {
		return findElementByXpath(Crytoassetstab);	
	}
	
	public String getTextForCryptoassetsTab() {
		System.out.println(getCryptoassetsTab().getText());
		return getCryptoassetsTab().getText();	
	}

	private WebElement getSortByOption() {
		return findElementByXpath(SortByOption);	
	}
	
	private void clickSortByOption() {
		getSortByOption().click();	
	}
	
	private WebElement getMarketCapOptionUnderSortBy() {
		return findElementByXpath(MarketCapOptionUnderSortBy);	
	}
	
	private void clickMarketCapOptionUnderSortBy() {
		getMarketCapOptionUnderSortBy().click();	
	}
	
	public void selectOptionFromSortByFilter() {
		clickSortByOption();
		clickMarketCapOptionUnderSortBy();
	}
	
	private WebElement getFirstCyrtoCurrency() {
		return findElementByXpath(Bitcoin);	
	}
	
	public void clickFirstCyrtoCurrency() {
		getFirstCyrtoCurrency().click();	
	}
	
	private WebElement getPriceDetails() {
		return findElementByXpath(priceDetails);	
	}
	
	public boolean getPriceForTab() {
		String pricedetails = getPriceDetails().getText().replace("$","");
		String price = pricedetails.replace(",", "");
		float Price = Float.parseFloat(price);
		System.out.println(Price);
		return true;	
	}
}
