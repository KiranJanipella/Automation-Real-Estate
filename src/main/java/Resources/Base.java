package Resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {

	public WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver()
{
	

    System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");  
	 driver= new ChromeDriver();
		//execute in chrome driver
return driver;	
}
}
