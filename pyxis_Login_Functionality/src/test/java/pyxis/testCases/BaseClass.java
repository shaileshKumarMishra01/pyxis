package pyxis.testCases;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Parameters;


	public class BaseClass {
		
		String baseURL="https://www.cleartrip.com/";
		public static WebDriver driver;
		
		@Parameters("browser")

		@BeforeClass
		public void setup(String br){
			

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(options);

			driver.get(baseURL);


		
		
		driver.get(baseURL);
	}
		
		@AfterClass
		public void Teardown()
		{
			driver.quit();
		
	}

}
