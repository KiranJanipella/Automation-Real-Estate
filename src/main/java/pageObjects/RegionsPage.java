package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegionsPage {
	
	public WebDriver driver;
	
	public RegionsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By regionbtn = By.xpath("//a[text()='Regions']");
	By regionname = By.cssSelector("#tag-name");
	By slug = By.cssSelector("input#tag-slug");
	By parentregion = By.cssSelector("#parent");
	By desc = By.cssSelector("#tag-description");
	By addregbtn = By.cssSelector("input#submit");
	By search = By.cssSelector("input#tag-search-input");
	By searchbtn = By.cssSelector("input#search-submit");
	By searchmsg = By.cssSelector(".subtitle");
	
	public WebElement getRegions() {
		return driver.findElement(regionbtn);
	}
	public WebElement getRegName() {
		return driver.findElement(regionname);
	}
	public WebElement getSlug() {
		return driver.findElement(slug);
	}
	public WebElement getParentRegion() {
		return driver.findElement(parentregion);
	}
	public WebElement getDescription() {
		return driver.findElement(desc);
	}
	public WebElement getAddRegbtn() {
		return driver.findElement(addregbtn);
	}
	public WebElement getSearchTxt() {
		return driver.findElement(search);
	}
	public WebElement getSearchBtn() {
		return driver.findElement(searchbtn);
	}
	public WebElement getSearchMsg() {
		return driver.findElement(searchmsg);
	}

}
