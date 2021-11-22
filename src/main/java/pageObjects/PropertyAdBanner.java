package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PropertyAdBanner {

	public WebDriver driver;
	
	By propertyadbtn = By.xpath("//*[@id='menu-posts-property']/ul/li[6]/a");
	By addrow = By.xpath("//a[text()='Add Row']");
	By image = By.xpath("//*[@data-id='13759']");
	By addimage = By.xpath("//*[@id='acf-group_5b041735d4bcf']/div/div/div[2]/div/table/tbody/tr[3]/td[3]/div/div/div[2]/p/a");
	By propertyurl = By.xpath("//*[@id='acf-field_5b041758e1993-61992d1155847-field_5b041775e1994']");
	By publishbtn = By.cssSelector("input#publish");
	
	public WebElement getPropadBtn() {
		return driver.findElement(propertyadbtn);
	}
	public WebElement getAddrow() {
		return driver.findElement(addrow);
	}
	public WebElement getPropURL() {
		return driver.findElement(propertyadbtn);
	}
	public WebElement getAddImage() {
		return driver.findElement(addimage);
	}
	public WebElement getImage() {
		return driver.findElement(image);
	}
	public WebElement getPublish() {
		return driver.findElement(publishbtn);
	}
	
}
