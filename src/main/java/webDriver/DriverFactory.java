package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DriverFactory extends BaseDriver{
   
	WebDriver driver = getDriver();

    public WebElement findElementByID(String id){
        return driver.findElement(By.id(id));
    }
    
    public void navigateBack() {
    	//driver.sendKeyEvent(AndroidKeyCode.BACK);
    	driver.navigate().back();
    }

    public WebElement findElementByIdIfPresent(String id){
        isElementPresent(By.id(id));
        return findElementByID(id);
    }

    public WebElement findElementByIdIfDisplayed(String id){
        isElementDisplayed(By.id(id));
        return findElementByID(id);
    }

    public List<WebElement> findElementsByID(String id){
        return driver.findElements(By.id(id));
    }

    public List<WebElement> findElementsByIdIfPresent(String id){
        isElementPresent(By.id(id));
        return findElementsByID(id);
    }

    public List<WebElement> findElementsByIdIfDisplayed(String id){
        isElementDisplayed(By.id(id));
        return findElementsByID(id);
    }

    public WebElement findElementByName(String name){
        return driver.findElement(By.name(name));
    }

    public WebElement findElementByNameIfPresent(String name){
        isElementPresent(By.name(name));
        return findElementByName(name);
    }

    public List<WebElement> findElementsByName(String name){
        return driver.findElements(By.name(name));
    }

    public List<WebElement> findElementsByNameIfPresent(String name){
        isElementPresent(By.name(name));
        return findElementsByName(name);
    }

    public WebElement findElementByClassName(String className){
        return driver.findElement(By.className(className));
    }

    public WebElement findElementByClassNameIfPresent(String className){
        isElementPresent(By.className(className));
        return findElementByClassName(className);
    }

    public List<WebElement> findElementsByClassName(String className){
        return driver.findElements(By.className(className));
    }

    public List<WebElement> findElementsByClassNameIfPResent(String className){
        isElementPresent(By.className(className));
        return findElementsByClassName(className);
    }

    public WebElement findElementByLinkText(String linkText){
        return driver.findElement(By.linkText(linkText));
    }

    public WebElement findElementByLinkTextIfPResent(String linkText){
        isElementPresent(By.linkText(linkText));
        return findElementByLinkText(linkText);
    }

    public List<WebElement> findElementsByLinkText(String linkText){
        return driver.findElements(By.linkText(linkText));
    }

    public List<WebElement> findElementsByLinkTextIfPresent(String linkText){
        isElementPresent(By.linkText(linkText));
        return findElementsByLinkText(linkText);
    }

    public WebElement findElementByCss(String cssSelector){
        return driver.findElement(By.cssSelector(cssSelector));
    }

    public WebElement findElementByCssIfPresent(String cssSelector){
        isElementPresent(By.cssSelector(cssSelector));
        return findElementByCss(cssSelector);
    }

    public List<WebElement> findElementsByCss(String cssSelector){
        return driver.findElements(By.cssSelector(cssSelector));
    }

    public List<WebElement> findElementsByCssIfPresent(String cssSelector){
        isElementPresent(By.cssSelector(cssSelector));
        return findElementsByCss(cssSelector);
    }

    public WebElement findElementByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement findElementByXpathIfPresent(String xpath)
    {
        isElementPresent(By.xpath(xpath));
        return findElementByXpath(xpath);
    }

    public List<WebElement> findElementsByXpath(String xpath){
        return driver.findElements(By.xpath(xpath));
    }

    public List<WebElement> findElementsByXpathIfPresent(String xpath){
        isElementPresent(By.xpath(xpath));
        return findElementsByXpath(xpath);
    }

    public boolean isElementPresent( By by){
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try
        {
            driver.findElement(by);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
        finally
        {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

    public boolean isElementDisplayed(By by){

        try
        {
            driver.findElement(by).isDisplayed();
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
        finally
        {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

}

