package pyxis.testCases;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pyxis.pagebjects.LoginPage;

import java.util.concurrent.TimeUnit;



public class LoginTest extends BaseClass {
	
		public static void main(String[] args) throws InterruptedException 
		{
			   String baseURL="https://app.pyxissocial.com/";

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(options);
			
	          driver.get(baseURL);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				

			
			
			LoginPage hp=new LoginPage(driver);
			// Entering User email address
			hp.email();
			
			// Entering Password
			hp.Password();
			hp.SignIn();
			
		 
				   

		}
}
