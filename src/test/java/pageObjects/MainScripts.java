package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainScripts {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//Login
		
		LoginPage.txtusername(driver).sendKeys("mowadeswap93@gmail.com");
		LoginPage.txtpwd(driver).sendKeys("123456789");
		LoginPage.btnLogin(driver).click();
		
		Thread.sleep(5000);
		//Logout
		Logoutpage.account(driver).click();
		Logoutpage.logout(driver).click();
		Thread.sleep(5000);
		driver.close();
		


		
		
	}

}
