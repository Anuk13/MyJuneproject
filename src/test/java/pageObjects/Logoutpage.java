package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logoutpage {
	static WebElement ele = null;
	
	public static WebElement account(WebDriver driver)
{
	return ele = driver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/a/span[1]"));
	}

public static WebElement logout(WebDriver driver)
{
	return ele = driver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/ul/li[5]/a"));	
	}





}