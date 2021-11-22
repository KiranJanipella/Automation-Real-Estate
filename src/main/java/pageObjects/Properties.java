package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Properties {
	
	public WebDriver driver;
	//Properties Button
	By propbtn = By.xpath("//div[text()='Properties']");
	//Screen option in the Properties
	By screenoptbtn = By.cssSelector("button.show-settings");
	//Columns in Screen  options
	By columns = By.cssSelector(".hide-column-tog");
	//Pagination: Number items per Page
	By pagination = By.id("edit_property_per_page");
	//Different Types of View
	By view = By.xpath("//*[@type='radio' and @name='mode']");
	//Apply Button in Screen Options
	By applybtn = By.id("screen-options-apply");
	//add new in Properties page
	By addnewbtn = By.cssSelector(".page-title-action");
	//Heading in add new page
	By heading = By.cssSelector(".wp-heading-inline");
	//Date DropDown in properties page
	By datedropdown = By.cssSelector("#filter-by-date");
	//Filter Button in the Properties page
	By filterbtn = By.id("post-query-submit");
	//Select all properties are displayed in the Properties Page
	By selectall = By.cssSelector("input#cb-select-all-1");
	//Bulk actions Drop down in the Properties Page
	By bulkactions = By.id("bulk-action-selector-top");
	//Action button
	By actionsbtn = By.cssSelector("input#doaction");
	//Properties
	By propert = By.cssSelector(".no-items");
	//Edit button in the property
	By editbtn = By.cssSelector(".edit");
	//Quick Edit button in the property
	By quickeditbtn = By.cssSelector(".editinline");
	//view button in the property
	By viewbtn = By.cssSelector("span.view");
	//Trash Button in the property
	By trashbtn = By.cssSelector("a.submitdelete");
	//Message after Deleting
	By trashmsg = By.cssSelector("#message");
	//Search bar in the properties
	By searcharea = By.cssSelector("#post-search-input");
	//Search button in the properties
	By searchbtn = By.cssSelector("#search-submit");
	//Upadte Button in QuickEdit
	By updatebtn = By.xpath("//*[@id='edit-11427']/td/div/button[2]");
	
	public Properties(WebDriver driver) {
		
		this.driver = driver; 
		
	}
	
	public WebElement getPropbtn() {
		return driver.findElement(propbtn);
	}
	public WebElement getScreenOptBtn() {
		return driver.findElement(screenoptbtn);
	}
	public List<WebElement> getColumns() {
		return driver.findElements(columns);
	}
	public WebElement getPagination() {
		return driver.findElement(pagination);
	}
	public List<WebElement> getViews(){
		return driver.findElements(view);
	}
	public WebElement getApplybtn() {
		return driver.findElement(applybtn);
	}
	public WebElement getAddNew() {
		return driver.findElement(addnewbtn);
	}
	public WebElement getHeading() {
		return driver.findElement(heading);
	}
	public WebElement getDates() {
		return driver.findElement(datedropdown);
	}
	public WebElement getFilter() {
		return driver.findElement(filterbtn);
	}
	public WebElement getSelectAll() {
		return driver.findElement(selectall);
	}
	public WebElement getBulkActions() {
		return driver.findElement(bulkactions);
	}
	public WebElement getActionBtn() {
		return driver.findElement(actionsbtn);
	}
	public WebElement getPropDetails() {
		return driver.findElement(propert);
	}
	public WebElement getEdit() {
		return driver.findElement(editbtn);
	}
	public WebElement getQuickEdit() {
		return driver.findElement(quickeditbtn);
	}
	public WebElement getViewProp() {
		return driver.findElement(viewbtn);
	}
	public WebElement getTrash() {
		return driver.findElement(trashbtn);
	}
	public WebElement getTrashMsg() {
		return driver.findElement(trashmsg);
	}
	public WebElement getSearchBar() {
		return driver.findElement(searcharea);
	}
	public WebElement getSearchBtn() {
		return driver.findElement(searchbtn);
	}
	public WebElement getUpdatebtn() {
		return driver.findElement(updatebtn);
	}

}
