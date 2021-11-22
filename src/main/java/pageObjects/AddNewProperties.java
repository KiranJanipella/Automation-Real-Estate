package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewProperties {

	public WebDriver driver;
	
	By addnewbtn = By.cssSelector("a.current");
	By titletxt = By.cssSelector("#title");
	By textbtn = By.cssSelector("#content-html");
	By descriptiontxt = By.cssSelector("textarea#content");
	By galleryaddbtn = By.xpath("//input[@value='Add or Upload Images']");
	By image = By.xpath("//*[@data-id='13759']");
	By usethesebtn = By.xpath("//button[text()='Use these files']");
	By layouts = By.cssSelector("#_layout");
	By pricebtn = By.cssSelector("#ui-id-1");
	By price = By.cssSelector("#_price");
	By pricepersq = By.cssSelector("#_price_per");
	By offertype = By.cssSelector("#_offer_type");
	By propertytype = By.cssSelector("#_property_type");
	By maindetailsbtn = By.cssSelector("#ui-id-2");
	By status = By.cssSelector("#_status");
	By locationtxt = By.cssSelector("#_location");
	By possession = By.cssSelector("#_possession");
	By locationbtn =By.cssSelector("#ui-id-3");
	By addresstxt = By.cssSelector("#_friendly_address");
	By googleaddress =By.cssSelector("#_address");
	By latitude = By.cssSelector("#_geolocation_lat");
	By longitude = By.cssSelector("#_geolocation_long");
	By otherdetbtn = By.cssSelector("#ui-id-4");
	By store = By.cssSelector("#_storage_room");
	By video = By.cssSelector("#ui-id-5");
	By videourl = By.cssSelector("#_video");
	By findeoprop = By.cssSelector("#findeo_sidebar_select");
	By findeoimagebtn = By.xpath("//*[@id='cmb2-metabox-findeo_property_sb_metabox']/div[2]/div[2]/input[2]");
	By usethisbtn = By.xpath("//button[text()='Use this file']");
	By keywords = By.xpath("//*[@type='checkbox' and @name='acf[field_5aa678b4dbea3][]']");
	By projectdettxt = By.cssSelector("#acf-field_5a8a9955c7b2a");
	By buildername = By.cssSelector("#acf-field_5a8d594f7267b");
	By cmtcheckbox = By.cssSelector("#comment_status");
	By pingcheckbox = By.cssSelector("#ping_status");
	By publishbtn = By.cssSelector("input#publish");
	By publishmsg = By.cssSelector("#message");
	By viewpost = By.xpath("//a[text()='View post']");
	
	public AddNewProperties(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAddNewBtn() {
		return driver.findElement(addnewbtn);
	}
	public WebElement getTitleTxt() {
		return driver.findElement(titletxt);
	}
	public WebElement getDescTxt() {
		return driver.findElement(descriptiontxt);
	}
	public WebElement getTextbtn() {
		return driver.findElement(textbtn);
	}
	public WebElement getGalleryAddbtn() {
		return driver.findElement(galleryaddbtn);
	}
	public WebElement getImage() {
		return driver.findElement(image);
	}
	public WebElement getUseTheseBtn() {
		return driver.findElement(usethesebtn);
	}
	public WebElement getLayout() {
		return driver.findElement(layouts);
	}
	public WebElement getPriceBtn() {
		return driver.findElement(pricebtn);
	}
	public WebElement getPriceTxt() {
		return driver.findElement(price);
	}
	public WebElement getPricePreSq() {
		return driver.findElement(pricepersq);
	}
	public WebElement getOfferType() {
		return driver.findElement(offertype);
	}
	public WebElement getPropertyType() {
		return driver.findElement(propertytype);
	}
	public WebElement getMainDetBtn() {
		return driver.findElement(maindetailsbtn);
	}
	public WebElement getStatus() {
		return driver.findElement(status);
	}
	public WebElement getLoactiontxt() {
		return driver.findElement(locationtxt);
	}
	public WebElement getPossession() {
		return driver.findElement(possession);
	}
	public WebElement getLocationbtn() {
		return driver.findElement(locationbtn);
	}
	public WebElement getAddresstxt() {
		return driver.findElement(addresstxt);
	}
	public WebElement getGoogleAddress() {
		return driver.findElement(googleaddress);
	}
	public WebElement getLatitude() {
		return driver.findElement(latitude);
	}
	public WebElement getLongitude() {
		return driver.findElement(longitude);
	}
	public WebElement getOtherDet() {
		return driver.findElement(otherdetbtn);
	}
	public WebElement getStorage() {
		return driver.findElement(store);
	}
	public WebElement getVideo() {
		return driver.findElement(video);
	}
	public WebElement getVideoUrl() {
		return driver.findElement(videourl);
	}
	public WebElement getFindeoSelect () {
		return driver.findElement(findeoprop);
	}
	public WebElement getFindeoImgBtn() {
		return driver.findElement(findeoimagebtn);
	}
	public WebElement getUseThisFile() {
		return driver.findElement(usethisbtn);
	}
	public List<WebElement> getKeywords() {
		return driver.findElements(keywords);
	}
	public WebElement getProjectTxt() {
		return driver.findElement(projectdettxt);
	}
	public WebElement getBuilderName() {
		return driver.findElement(buildername);
	}
	public WebElement getCmtCheckbox() {
		return driver.findElement(cmtcheckbox);
	}
	public WebElement getPingCheckbox() {
		return driver.findElement(pingcheckbox);
	}
	public WebElement getPublishbtn() {
		return driver.findElement(publishbtn);
	}
	public WebElement getPublishMsg() {
		return driver.findElement(publishmsg);
	}
	public WebElement getViewPost() {
		return driver.findElement(viewpost);
	}

}
