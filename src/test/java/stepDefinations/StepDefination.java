package stepDefinations;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Resources.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SigninPage;
import pageObjects.AddNewProperties;
import pageObjects.FeaturesPage;
import pageObjects.Properties;
import pageObjects.RegionsPage;

public class StepDefination extends Base  {

	//create a web driver object
	public WebDriver driver;
	 
	
	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		//Initialize the driver or browser
		driver = initializeDriver();
    }

	@And("^Navigate to  \"([^\"]*)\" site$")
    public void navigate_to_something_site(String url) throws Throwable {
		//Get url
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
	}
	@And("^Click on Login link in home page to land on Secure sign in Page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
        //create a sign page object
		SigninPage s = new SigninPage(driver);
		//Click on Login and Register in the Homepage
        s.getSigninbtn().click();
        //Scroll down using java script executor
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }
	@And("^Click on Login in login page$")
    public void click_on_login_in_login_page() throws Throwable {
		//Sign in page object
		SigninPage l= new SigninPage(driver);
        //Click on the Login button in the Login and Register Page
		l.getLoginbtn().click();
    }
	@When("^I entered valid (.+) and valid (.+) logs in$")
    public void i_entered_valid_and_valid_logs_in(String username, String password) throws Throwable {
		//sign in page object
		SigninPage lp=new SigninPage(driver);
		//Enter The User name and Password
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
        
    }  
	@And("^Click on signin button$")
    public void click_on_signin_button() throws Throwable {
		//Sign-in page object
		SigninPage lp = new SigninPage(driver);
		//click on the Login button
		lp.getSignin().click();
	}
	@Then("^Navigate to properties$")
    public void navigate_to_properties() throws Throwable {
        //create Properties object
		Properties p = new Properties(driver);
        //click on the property button
        p.getPropbtn().click();   
    }
	@And("^Click on Screen options in the Properties page$")
    public void click_on_screen_options_in_the_properties_page() throws Throwable {
		//create Properties object
		Properties p = new Properties(driver);
        //Click on Screen option in properties page
        p.getScreenOptBtn().click();
    }
	@And("^Select columns pagination view$")
    public void select_columns_pagination_view() throws Throwable {
		//create Properties object
		Properties p = new Properties(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Columns in the Screen Options
		List<WebElement> columns = p.getColumns();
		//Check every column is selected in the screen options
        for(WebElement col : columns) {
        	Assert.assertTrue(col.isSelected());
        }
        //Clear Number of items per page and enter a number
        p.getPagination().clear();
        p.getPagination().sendKeys("50");
        //Types of views in Screen Option
        List<WebElement> optviews = p.getViews();
        //Click on view and check view is selected or not
        for(WebElement opt: optviews) {
        	opt.click();
        	Assert.assertTrue(opt.isSelected());
        }
    }
	@Then("Apply screen Options")
	public void apply_screen_options() {
		//create Properties object
	    Properties apply = new Properties(driver);
	    //Click on the apply button
	    apply.getApplybtn().click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    //Scroll using java script Executor
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)", "");
	    //Close the window
	    driver.close();
	}
	@And("^Click on add new button$")
	   public void click_on_add_new_button() throws Throwable {
		//create Properties object
		Properties addnew = new Properties(driver);
		//Click on add new button
		addnew.getAddNew().click();
	}
	@Then("^Verify it redirects to add new properties$")
    public void verify_it_redirects_to_add_new_properties() throws Throwable {
		//create Properties object
		Properties addnew = new Properties(driver);
		//Check that add new page is opened or not
		Assert.assertTrue(addnew.getHeading().isDisplayed());
		//Close the window
		driver.close();
	}
	
	@And("^Click on Date Filter Select date$")
    public void click_on_date_filter_select_date() throws Throwable {
		//Create Properties object
		Properties p = new Properties(driver);
		//Create WebElement of drop down
        WebElement DateDropDown = p.getDates();
        Select se = new Select(DateDropDown);
        //Select option by visible text
        se.selectByVisibleText("August 2021");
    }

    @And("^Click on Filter$")
    public void click_on_filter() throws Throwable {
    	//Create Properties object
    	Properties p = new Properties(driver);
    	//Click on Filter in the properties page
    	p.getFilter().click();
    }

    @And("^Select All Properties are displayed$")
    public void select_all_properties_are_displayed() throws Throwable {
    	//Create Properties object
    	Properties p = new Properties(driver);
    	//Click on select all button
    	p.getSelectAll().click();
    }

    @And("^Click on Bulk actions Select the action$")
    public void click_on_bulk_actions_select_the_action() throws Throwable {
    	//Create Properties object
    	Properties p = new Properties(driver);
    	//Create a WebElement for actions
    	WebElement BulkActions = p.getBulkActions();
    	Select bulkaction = new Select(BulkActions);
    	//Select option by Visible Text
    	bulkaction.selectByVisibleText("Move to Trash");
    }

    @And("^Click on Apply$")
    public void click_on_apply() throws Throwable {
    	//Create Properties object
    	Properties p = new Properties(driver);
    	//Click on the Action button
    	p.getActionBtn().click();

    }
    @Then("^Verify the action is performed$")
    public void verify_the_action_is_performed() throws Throwable {
    	//Create Properties object
    	Properties p = new Properties(driver);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//message after deleting the Properties
    	String msg = p.getPropDetails().getText();
    	String expectedmsg = "No Properties found";
    	//Check message as expected message
    	Assert.assertEquals(msg,expectedmsg);
    	//Close the browser
    	driver.close();
    }
    @And("^Click on Search bar$")
    public void click_on_search_bar() throws Throwable {
    	//Create Properties object
    	Properties p = new Properties(driver);
    	//Click on the search bar
    	p.getSearchBar().click();
    	
    }
    @And("^Enter the Property Details and click on search button$")
    public void enter_the_property_details_and_click_on_search_button() throws Throwable {
    	//Create Properties object
    	Properties p = new Properties(driver);
    	//Enter the Details of Property
    	p.getSearchBar().sendKeys("Sun City");
    	//Click on Search Button
    	p.getSearchBtn().click();
    	//Scroll Using Java Script Executor
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");
    }
    @And("^Click on Edit$")
    public void click_on_edit() throws Throwable {
    	//Create Properties object
    	Properties p = new Properties(driver);
    	//Click on the edit button
    	p.getEdit().click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//Navigate back
    	driver.navigate().back();
    }
    @And("^Click on Quick edit and update the property$")
    public void click_on_quick_edit_and_update_the_property() throws Throwable {
    	//Create Properties object
    	Properties p = new Properties(driver);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	//Click on Quick Edit button
    	p.getQuickEdit().click();
    	//Click on Update button
    	p.getUpdatebtn().click();
    }
    @Then("^close the window$")
    public void close_the_window() throws Throwable {
    	//Close the browser
    	driver.close();
    }
    @And("^Click on Add new$")
    public void click_on_add_new() throws Throwable {
    	//Create a object of AddNewProperties
        Properties p = new Properties(driver);
        p.getAddNew().click();
    }

    @And("^Click on title and Enter the title details$")
    public void click_on_title_and_enter_the_title_details() throws Throwable {
    	//Create a object of AddNewProperties
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getTitleTxt().sendKeys("Green Parks");
    }

    @And("^Click on description enter the description$")
    public void click_on_description_enter_the_description() throws Throwable {
    	//Create a object of AddNewProperties
    	AddNewProperties an = new AddNewProperties(driver);
    	//an.getTextbtn().click();
    	an.getDescTxt().sendKeys("One of Hyderabad's tallest towers in the making at the city's most happening locale, \"Financial District, Nanakramguda\". The 44-storey twin towers are ultra-luxe apartments designed by the finest architects along the sleek lines & minimalist sophistication. Subtle yet sparkling, they are enchanting from the outside, and magnificently crafted on inside, are comparable in design to the best in the world.\r\n"
    			+ "The Olympus is a positive place with happy vibes. Step out to the nature, ensconced in a play of vividity of greenery and the flora. Experience an outdoor as exciting as the cozy world of indoor and let life happen engulfed in the splendor of nature’s colors. Let the excitement spill over inside-out.");
    }
    @And("^Click on add or upload images$")
    public void click_on_add_or_upload_images() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getGalleryAddbtn().click();
    }
    @And("^Select images of property$")
    public void select_images_of_property() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getImage().click();
    }

    @And("^Click on use these files$")
    public void click_on_use_these_files() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getUseTheseBtn().click();
    }
    @And("^Click on gallery layout select the layout$")
    public void click_on_gallery_layout_select_the_layout() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	Select se = new Select(an.getLayout());
    	se.selectByVisibleText("Style 3");
    }
    @Then("Click on Price Details enter the details")
    public void click_on_price_details_enter_the_details() {
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getPriceBtn().click();
    	an.getPriceTxt().click();
    	an.getPriceTxt().sendKeys("5000000");
    	an.getPricePreSq().sendKeys("10000");
    	Select se = new Select(an.getOfferType());
    	se.selectByVisibleText("For Sale");
    	se.selectByVisibleText("For Rent");
    	se.selectByVisibleText("For Sale");
    	Select proptype = new Select(an.getPropertyType());
    	proptype.selectByVisibleText("Villas");
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @And("^Click on Main Details enter the details$")
    public void click_on_main_details_enter_the_details() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getMainDetBtn().click();
    	an.getStatus().click();
    	an.getStatus().sendKeys("Available");
    	an.getLoactiontxt().click();
    	an.getLoactiontxt().sendKeys("Hyderabad - Narsapur Road, Kondapur, Telangana, India");
    	an.getPossession().click();
    	an.getPossession().sendKeys("1 Year Agreement");
    }

    @And("^Click on location details enter the details$")
    public void click_on_location_details_enter_the_details() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	an.getLocationbtn().click();
    	an.getAddresstxt().click();
    	an.getAddresstxt().sendKeys("Hyderabad - Narsapur Road, Kondapur, Telangana, India");
    	an.getGoogleAddress().click();
    	an.getGoogleAddress().sendKeys("Hyderabad - Narsapur Road, Kondapur, Telangana, India");
    	an.getLatitude().click();
    	an.getLatitude().sendKeys("17.7132661");
    	an.getLongitude().click();
    	an.getLongitude().sendKeys("78.31320529999999");
    }

    @And("^Click on Details enter the details$")
    public void click_on_details_enter_the_details() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getOtherDet().click();
    	an.getStorage().click();
    	an.getStorage().sendKeys("Available");
    }

    @And("^Click on Video urls$")
    public void click_on_video_urls() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getVideo().click();
    	an.getVideoUrl().click();
    	an.getVideoUrl().sendKeys("https://www.youtube.com/watch?v=y9j-BL5ocW8");
    }
    @And("^Click on Findeo Property select the image$")
    public void click_on_findeo_property_select_the_image() throws Throwable {
        AddNewProperties an = new AddNewProperties(driver);
        Select sidebar = new Select(an.getFindeoSelect());
        sidebar.selectByVisibleText("Footer 1st Column");
        sidebar.selectByVisibleText("Single property sidebar");
        an.getFindeoImgBtn().click();
        driver.findElement(By.xpath("//*[@id='__attachments-view-234\']/li[1]")).click();
        an.getUseThisFile().click();
    }

    @And("^Select Keywords of the property$")
    public void select_keywords_of_the_property() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	List<WebElement> keywordlist = an.getKeywords();
    	for(WebElement keyword : keywordlist) {
    		if(keyword.getAttribute("value").contains("2004")) {
    			keyword.click();
    			Assert.assertTrue(keyword.isSelected());
    		}
    		if(keyword.getAttribute("value").contains("1989")) {
    			keyword.click();
    			Assert.assertTrue(keyword.isSelected());
    		}
    	}
    }

    @And("^Click and enter the project details$")
    public void click_and_enter_the_project_details() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getProjectTxt().click();
    	an.getProjectTxt().sendKeys("West Brook enables you to connect to the city and the world without stress or strain. Feel the power of this connectivity through conveniently located Metro Stations, IT Hubs, Schools, Hospitals, Malls and much more.");
    }

    @And("^Click and enter the builder name$")
    public void click_and_enter_the_builder_name() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getBuilderName().click();
    	an.getBuilderName().sendKeys("West Brook");
    }

    @And("^Click on checkbox of discussion$")
    public void click_on_checkbox_of_discussion() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	an.getCmtCheckbox().click();
    	an.getPingCheckbox().click();
    }
    
    @Then("^Click on publish$")
    public void click_on_publish() throws Throwable {
    	AddNewProperties an = new AddNewProperties(driver);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-3000)", "");
    	an.getPublishbtn().click();
    	String msg = an.getPublishMsg().getText();
    	String expectedmsg = "Post published. ";
    	Assert.assertEquals(msg, expectedmsg);
    	an.getViewPost().click();
    	driver.close();
    }
    @And("^Click on features$")
    public void click_on_features() throws Throwable {
        FeaturesPage f = new FeaturesPage(driver);
        f.getFeatures().click();
    } 

    @And("^Click on Name enter the feature name$")
    public void click_on_name_enter_the_feature_name() throws Throwable {
    	FeaturesPage f = new FeaturesPage(driver);
    	f.getFeatName().click();
    	f.getFeatName().sendKeys("Double Bedroom");
    }

    @And("^Click on slug enter the slug$")
    public void click_on_slug_enter_the_slug() throws Throwable {
    	FeaturesPage f = new FeaturesPage(driver);
    	f.getSlug().click();
    	f.getSlug().sendKeys("Double-bed-room");
    }

    @And("^select the parent feature$")
    public void select_the_parent_feature() throws Throwable {
    	FeaturesPage f = new FeaturesPage(driver);
    	f.getParentFeatures().click();
    }

    @And("^Click on Description enter the feature description$")
    public void click_on_description_enter_the_feature_description() throws Throwable {
    	FeaturesPage f = new FeaturesPage(driver);
    	f.getDescription().click();
    	f.getDescription().sendKeys("Beautiful Double Bed Room in the Property With cupboards");
    }

    @And("^Click on Addnew feature$")
    public void click_on_addnew_feature() throws Throwable {
    	FeaturesPage f = new FeaturesPage(driver); 
    	f.getAddFeatbtn().click();
    }

    @And("^Perform search opertions in features page$")
    public void perform_search_opertions_in_features_page() throws Throwable {
    	FeaturesPage f = new FeaturesPage(driver);
    	f.getSearchTxt().click();
    	f.getSearchTxt().sendKeys("Double Bedroom");
    	f.getSearchBtn().click();
    	String msg = f.getSearchMsg().getText();
    	String expectedmsg = "Search results for “Double Bedroom”";
    	Assert.assertEquals(msg, expectedmsg);
    }
    
    @Then("^close the browser$")
    public void close_the_browser() throws Throwable {
        driver.close();
    }
    
    @And("^Click on Regions$")
    public void click_on_regions() throws Throwable {
        RegionsPage r = new RegionsPage(driver);
        r.getRegions().click();
    }

    @And("^Click on Name enter the region name$")
    public void click_on_name_enter_the_region_name() throws Throwable {
    	RegionsPage r = new RegionsPage(driver);
    	r.getRegName().click();
    	r.getRegName().sendKeys("Kondapur");
    }

    @And("^Click on slug enter the region slug$")
    public void click_on_slug_enter_the_region_slug() throws Throwable {
    	RegionsPage r = new RegionsPage(driver);
    	r.getSlug().click();
    	r.getSlug().sendKeys("Kondapur-hyderabad");
    }


    @And("^select the parent region$")
    public void select_the_parent_region() throws Throwable {
    	RegionsPage r = new RegionsPage(driver);
    	r.getParentRegion().click();
    }

    @And("^Click on Description enter the region description$")
    public void click_on_description_enter_the_region_description() throws Throwable {
    	RegionsPage r = new RegionsPage(driver);
    	r.getDescription().click();
    	r.getDescription().sendKeys("Kondapur, Hyderabad. 5000078");
    }

    @And("^Click on Addnew region$")
    public void click_on_addnew_region() throws Throwable {
    	RegionsPage r = new RegionsPage(driver);
    	r.getAddRegbtn().click();
    }

    @And("^Perform search opertions in region page$")
    public void perform_search_opertions_in_region_page() throws Throwable {
    	RegionsPage r = new RegionsPage(driver);
    	r.getSearchTxt().click();
    	r.getSearchTxt().sendKeys("Kondapur");;
    	r.getSearchBtn().click();
    	String msg = r.getSearchMsg().getText();
    	String expectedmsg = "Search results for “Kondapur”";
    	Assert.assertEquals(msg, expectedmsg);
    }

}