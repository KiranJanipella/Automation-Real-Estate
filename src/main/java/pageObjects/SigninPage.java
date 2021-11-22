package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage {

	
	public WebDriver driver;
	
	
	By signinbtn = By.xpath("//*[@class='sign-in']"); 
	By loginbtn = By.xpath("//a[text()='Log In']");
	By username = By.cssSelector("[id='user_login']");
	By password = By.cssSelector("[type='password']");
	By signin = By.cssSelector("[value='Sign In']");
	
	
	public SigninPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


    public WebElement getSigninbtn()
    {
		return driver.findElement(signinbtn);
    }
    
    public WebElement getLoginbtn()
    {
    	return driver.findElement(loginbtn);
    }

	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSignin()
	{
		return driver.findElement(signin);
	}

}
