package pyxis.pagebjects;

	  
	import org.openqa.selenium.WebDriver;                                                                                                        
	import org.openqa.selenium.WebElement;                                                                                                       
	import org.openqa.selenium.support.FindBy;                                                                                                   
	import org.openqa.selenium.support.PageFactory;                                                                                              
	                                                                                                                                             
	                                                                                                                                             
	public class LoginPage {
		                                                                                                                                         
		                                                                                                                                         
	public LoginPage(WebDriver driver)                                                                                                            
		                                                                                                                                         
	
		{                                                                                                                                        
			PageFactory.initElements(driver, this);                                                                                              
		}                                                                                                                                        
		@FindBy(xpath="//input[@class='text-primary']")                                                                                                                  
		WebElement email;                                                                                                                    
		                                                                                                                        
		@FindBy(xpath="//input[@name='password']")                                                                                                                    
		WebElement Password;                                                                                                                       
		                                                                                                                                         
		@FindBy(xpath="//div[@class='btn btn-primary w-100']")                                          
		WebElement SignIn;                                                                                                                         
		                                                                                                                                         
		                                                                                                   
	                                                                                                                                             
		public void email()                                                                                                                  
		{                                                                                                                                        
			email.click();                                                                                                                   
		                                                                                                                                         
		}                                                                                                                                        
		                                                                                                                                         
		public void Password()                                                                                                                     
		{                                                                                                                                        
			Password.sendKeys("Jiya@123");                                                                                                            
		                                                                                                                                         
		}    
		public void SignIn()                                                                                                                     
		{                                                                                                                                        
			SignIn.click();                                                                                                            
		                                                                                                                                         
		}
		                                                                                                                                         
			}                                                                                                                                        

