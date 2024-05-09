package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Nikepage {
	
	WebDriver driver;
	
@FindBy(xpath = "//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/div[1]/div/ul/li/a")WebElement logo1;	
@FindBy(xpath = "//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/header/div[1]/div[1]/a")WebElement logo2;
@FindBy(xpath = "//*[@id=\"hf_title_joinus_membership\"]")WebElement joinus;
@FindBy(xpath = "//*[@id=\"ca713a54-72ab-4359-955b-6b62013d0282\"]/div/div/nav/div[1]/ul/li/a")WebElement signup;
@FindBy(xpath = "//*[@id=\"username\"]")WebElement emailsignup;
@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/form/div/div[4]/button")WebElement summit;
//@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/form/div/div[1]/div[1]/div[1]/input")WebElement code; 
//@FindBy(xpath = "//*[@id=\"l7r-first-name-input\"]")WebElement firstname;
//@FindBy(xpath = "//*[@id=\"l7r-last-name-input\"]")WebElement lastname;
//@FindBy(xpath = "//*[@id=\"l7r-password-input\"]")WebElement password;
//@FindBy(xpath = "//*[@id=\"l7r-shopping-preference\"]")WebElement preferences;

@FindBy(xpath = "/html/body/div[3]/div/div[3]/div[1]/div/div/div[4]/div/button/span")WebElement signin;
//@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/form/div/div[1]/div/label")WebElement country;
@FindBy(xpath = "//*[@id=\"username\"]")WebElement email;
@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/form/div/div[4]/button")WebElement summit1;
@FindBy(xpath = "//*[@id=\"hf_header_find_a_store\"]")WebElement findastore;
@FindBy(xpath = "//*[@id=\"ta-Location_input\"]")WebElement location;
@FindBy(xpath = "//*[@id=\"store-locator\"]/article/div/section[2]/section[1]/div/div[2]/p[1]")WebElement location1;
@FindBy(xpath = "//*[@id=\"VisualSearchInput\"]")WebElement searchinfindastore;
@FindBy(xpath = "//*[@id=\"VisualSearchSuggestion-0\"]/span")WebElement trousers;
@FindBy(xpath = "//*[@id=\"wallNavFG0\"]/a[1]/div")WebElement checkbox;
@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[4]/div/div[5]/div[2]/main/section/div/div[6]/div/figure/a[2]/div/img")WebElement nikepants;
@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div[4]/div[2]/div[1]/div/div[2]/div/button[2]")WebElement nextbutton;
@FindBy(xpath = "//*[@id=\"buyTools\"]/div[1]/fieldset/div/div[3]/label")WebElement selectsizes;
@FindBy(xpath = "//*[@id=\"RightRail\"]/div/div[3]/div/details[1]/summary")WebElement sizefit;
@FindBy(xpath = "//*[@id=\"RightRail\"]/div/div[3]/div/details[2]/summary/h3")WebElement deliveryreturns;
@FindBy(xpath = "//*[@id=\"RightRail\"]/div/div[3]/div/details[3]/summary/h3")WebElement reviews;
@FindBy(xpath = "//*[@id=\"RightRail\"]/div/div[3]/div/details[4]/summary/h3")WebElement productinformation;
@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div/button[1]")WebElement addtobag;
@FindBy(xpath = "//*[@id=\"floating-atc-wrapper\"]/div/button[2]/span[1]")WebElement favourite;
@FindBy(xpath = "//*[@id=\"nav-cart\"]/a/div/span")WebElement bagitems;
@FindBy(xpath = "//*[@id=\"106b91f1-ead1-41b8-bce9-5597b9f4d6eb\"]")WebElement bagimage;
@FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[1]/div[2]/div/div/div/div[1]/div[2]/p/span/span/span/span")WebElement bagimagemrp;




	public Nikepage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
   
	public void titleverification()
	{
		String expectedtitle = "Nike. Just Do It. Nike IN";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	public void logo1verification()
	{
		if(logo1.isDisplayed())
		
		{
			System.out.println("logo1 is visibile");
		}
		else 
		{
			System.out.println("logo1 os not visible");
		}
	}
	
	public void logo2verification()
	{
		if(logo2.isDisplayed())
		
		{
			System.out.println("logo2 is visibile");
		}
		else 
		{
			System.out.println("logo2 os not visible");
		}
	}
	  
	public void joinus()
	{
		joinus.click();
	}
	 public void signup()
	 {
		 signup.click();
	 }
	public void emailsignup() {
		
		emailsignup.sendKeys("manuvalstephen123@gmail.com");
		
	}
	public void summit() {
		summit.submit();
		driver.navigate().back();
	}
	
//	public void signuppage() 
//	{
//		code.sendKeys("13754074");
//		firstname.sendKeys("manuval");
//		lastname.sendKeys("stephen");
//		password.sendKeys("Manuval@10");
//		
//		Select preference1 = new Select (preferences);
//		preference1.selectByValue("MENS");
//		
//	}
	
	
	 public void sigin()
	 {
		 signin.click();
	 }
	 
//	 public void country() {
//		 
//		 Select countrydetails = new Select (country);
//		 countrydetails.selectByValue("AF");
		 
//	 }
	 public void emailregistration() {
		 
		 email.sendKeys("manuvalstephen123@gmail.com");
		 
	 }
	 public void summit1()
	 {
		 summit.submit();
		 driver.navigate().back();
	 }
	 public void findastore()
	 {
		 findastore.click();
	        Actions actions = new Actions(driver);
	        
		 location.sendKeys("ernakulam");
	     actions.doubleClick(location1).perform();
	 }
	     
	     public void searchfindastore()
	     {
	     searchinfindastore.click();
	     searchinfindastore.sendKeys("trousers");
	     trousers.click();
	     }  
	       
	     public void checkbox() throws Exception
	     {

          Thread.sleep(2000);
          
	     checkbox.click();
	     
	     JavascriptExecutor is = (JavascriptExecutor)driver;
			is.executeScript("window.scrollBy(0,500)","");
			Thread.sleep(2000);
			nikepants.click();
			
			nextbutton.click();
			nextbutton.click();
			nextbutton.click();
			nextbutton.click();
			nextbutton.click();
			nextbutton.click();
			nextbutton.click();
			nextbutton.click();
			
			Thread.sleep(3000);

			selectsizes.click();

            sizefit.click();
            deliveryreturns.click();
            reviews.click();
            productinformation.click();
            
            
            
	     }    
           
            public void addToBag()
            {

            	JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,-1000)",""); 
                
    			selectsizes.isSelected();

           
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div/button[1]")));
            addtobag.click();
            
            driver.navigate().back();
            
            }
            
            public void bagitems() throws Exception
            {
            Thread.sleep(2000);
            bagitems.click();
           
            	
            if (bagimage.isDisplayed())
            {
            	System.out.println("the image is same");
            }
            else
            {
            	System.out.println("the image is not same");
            }
            
            if(bagimage.equals(bagimagemrp))
            {
            	System.out.println("checkoutmrp is same");
            }
            else
            {
            	System.out.println("checkoutmrp is not same");
            }
               
            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();


            }    
                  
            
         }     
	 
	 
	 
	 
	
		
	 

