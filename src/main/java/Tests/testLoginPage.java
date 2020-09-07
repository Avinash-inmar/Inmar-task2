package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Components.CryptoassetsPage;
import Components.ExchangesPage;
import Components.LoginPage;
import webDriver.BaseDriver;

public class testLoginPage extends BaseDriver {
	
	@Test
	public void testLogin() throws InterruptedException {
		System.out.println("Application Launched successfully");
		LoginPage lp = new LoginPage();
		lp.loginToMarketCapApplication("avinash4at@gmail.com", "Avinash@123");
		System.out.println("Application Logged in successfully");
	}

	@Test
	public void VerifyUserIsOnCryptoassetsTab() throws InterruptedException {
		System.out.println("Application Launched successfully");
		LoginPage lp = new LoginPage();
		CryptoassetsPage cp = lp.loginToMarketCapApplication("avinash4at@gmail.com", "Avinash@123");
		Assert.assertEquals(cp.getTextForCryptoassetsTab(), "Cryptoassets");
		cp.selectOptionFromSortByFilter();
		cp.clickFirstCyrtoCurrency();
		Assert.assertTrue(cp.getPriceForTab());
		System.out.println("======Verified Price is There for Bitcoin=========");
	}
   
	@Test
	public void VerifyUserIsOnExchangesTab() throws InterruptedException {
		System.out.println("Application Launched successfully");
		LoginPage lp = new LoginPage();
		lp.loginToMarketCapApplication("avinash4at@gmail.com", "Avinash@123");
		ExchangesPage ep = new ExchangesPage();
		ep.selectOptionFromSortByFilter();
		ep.clickFirstCyrtoCurrency();
		Assert.assertTrue(ep.getPriceForTab());
		System.out.println("======Verified Price is There for Hobit=========");
	}
}
