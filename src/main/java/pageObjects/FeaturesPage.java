package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FeaturesPage {
	
	public WebDriver driver;
	
	public FeaturesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By featurebtn = By.xpath("//a[text()='Features']");
	By featurename = By.cssSelector("#tag-name");
	By slug = By.cssSelector("input#tag-slug");
	By parentfeature = By.cssSelector("#parent");
	By desc = By.cssSelector("#tag-description");
	By addfeatbtn = By.cssSelector("input#submit");
	By search = By.cssSelector("input#tag-search-input");
	By searchbtn = By.cssSelector("input#search-submit");
	By searchmsg = By.cssSelector(".subtitle");
	
	public WebElement getFeatures() {
		return driver.findElement(featurebtn);
	}
	public WebElement getFeatName() {
		return driver.findElement(featurename);
	}
	public WebElement getSlug() {
		return driver.findElement(slug);
	}
	public WebElement getParentFeatures() {
		return driver.findElement(parentfeature);
	}
	public WebElement getDescription() {
		return driver.findElement(desc);
	}
	public WebElement getAddFeatbtn() {
		return driver.findElement(addfeatbtn);
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
