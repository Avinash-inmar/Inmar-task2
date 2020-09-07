package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Components.SettingsPage;
import webDriver.BaseDriver;

public class testSettingsPage extends BaseDriver {
	
	@Test
	public void VerifyUserCanSelectCountryFromSettings() throws InterruptedException {
		SettingsPage sp = new SettingsPage();
		sp.clickOnContinueToMarketCapLink();
		sp.selectDefaultCountry();
		Assert.assertTrue(sp.getTextForDefaultCurrencyOpationUnderApp().equalsIgnoreCase("HKD & BTC"));
	}
	
	
	@Test
	public void VerifySwitchToAnyMode() throws InterruptedException {
		SettingsPage sp = new SettingsPage();
		sp.clickOnContinueToMarketCapLink();
	    Assert.assertTrue(sp.clickSwitchToModeOption().equalsIgnoreCase("Switch to Day Mode"));
	}
	

}
