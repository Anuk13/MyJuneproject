package stepdefintion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.LoginPage;
//import pageObjects.MyAccountPage;


public class steps {
	
	WebDriver driver;
	String url= "https://tutorialsninja.com/demo/index.php?route=common/home";
	//MyAccountPage acc;
	//LoginPage lp;
	Logger logger;
	
	@Before 
	public void setup()
	{
		//for logging

		logger= LogManager.getLogger(this.getClass());
	}
	
	@After
	public void teardown()
	{
		
	}
	
	
	
	@Given("User Launch browser")
	public void user_launch_browser() {
		
         driver = new ChromeDriver();
         driver.manage().window().maximize();
       
	    System.out.println("Launch");
	}

	@And("opens URL")

	public void opens_url() {
        
	driver.get("https://tutorialsninja.com/demo");
   // logger.info("launch");


	}

	@When("User navigate to MyAccount menu")
	public void user_navigate_to_my_account_menu() {
		driver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/a")).click();
	
		System.out.println("my account");
	    //logger.info("my account");

	}

	@And("click on Login")
	public void click_on_login() {
		System.out.println("login");
		driver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/ul/li[2]/a")).click();
	   // logger.info("login page");

		
	}

	@When("Email and password")
	public void email_and_password()  throws InterruptedException {
		
	driver.findElement(By.name("email")).sendKeys("mowadeswap93@gmail.com");
		//lp.txtusername(driver).sendKeys(email);
		//lp.txtpwd(driver).sendKeys(pwd);
	   // logger.info("login");

	driver.findElement(By.name("password")).sendKeys("123456789");
        Thread.sleep(2000);
	}

	@And("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input")).click();
		//lp.btnLogin(driver).click();
		System.out.println("button");
	   // logger.info("click on login");

	}

	@Then("User navigates to MyAccount Page")
	public void user_navigates_to_my_account_page() {
		//myac = new MyAccountPage(driver);
		//boolean targetpage=myac.isMyAccountPageExists();
		//if(targetpage)
		{
			Assert.assertTrue(true);
		}
		//else
		{
			Assert.assertTrue(false);

		}
		
	   // logger.info("my account page");

		
		driver.close();
		System.out.println("page");
	}
}