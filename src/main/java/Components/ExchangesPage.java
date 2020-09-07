package Components;

import org.openqa.selenium.WebElement;

import webDriver.DriverFactory;

public class ExchangesPage extends DriverFactory {
	
	private String ExchangesTab = "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Exchanges\"]";
	private String SortByOption = "//android.widget.TextView[@resource-id=\"com.coinmarketcap.android:id/sorting_option_sort_by\"]";
	private String NumberOfMarketsOptionUnderSortBy = "//android.widget.TextView[@text=\"Number of Markets\"]";
	private String Hotbit = "//android.widget.TextView[@text=\"Hotbit\"]";
	private String PriceDetails = "//android.widget.TextView[@resource-id=\"com.coinmarketcap.android:id/main_price\"]";
	
	
	private WebElement getExchangesTab() {
		return findElementByXpath(ExchangesTab);	
	}
	
	public void clickOnExchangesTab() {
		getExchangesTab().click();
	}
	
	private WebElement getSortByOption() {
		return findElementByXpath(SortByOption);	
	}
	
	private void clickSortByOption() {
		getSortByOption().click();	
	}
	
	private WebElement getNumberOfMarketsOptionUnderSortBy() {
		return findElementByXpath(NumberOfMarketsOptionUnderSortBy);	
	}
	
	private void clickNumberOfMarketsOptionUnderSortBy() {
		getNumberOfMarketsOptionUnderSortBy().click();	
	}
	
	public void selectOptionFromSortByFilter() {
		clickOnExchangesTab();
		clickSortByOption();
		clickNumberOfMarketsOptionUnderSortBy();
	}
	
	private WebElement getFirstCyrtoCurrency() {
		return findElementByXpath(Hotbit);	
	}
	
	public void clickFirstCyrtoCurrency() {
		getFirstCyrtoCurrency().click();	
	}
	
	private WebElement getPriceDetailsTab() {
		return findElementByXpath(PriceDetails);	
	}
	
	
	public boolean getPriceForTab() {
		String pricedetails = getPriceDetailsTab().getText().replace("$","");
		String price = pricedetails.replace(",", "");
		int Price = Integer.parseInt(price);
		System.out.println(Price);
		return true;	
	}
}
