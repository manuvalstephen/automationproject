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
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nikesecondpage {
	
	WebDriver driver;

	public Nikesecondpage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/header/div[1]/div[2]/nav/div[2]/div/ul/li[1]/button")WebElement newfeatured;	
	@FindBy(xpath = "//*[@id=\"DesktopMenu-0-0-0\"]/div/div[1]/a[1]")WebElement newarrival;	
	@FindBy(xpath = "//*[@id=\"skip-to-products\"]/div[1]/div/figure/a[2]/div/img")WebElement firstshoe;	
	@FindBy(xpath = "//*[@id=\"pdp-6-up\"]/div/button[2] ")WebElement nextbutton;
	@FindBy(xpath = "//*[@id=\"buyTools\"]/div[1]/fieldset/div/div[5]/label ")WebElement selectsize;
	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div[4]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div/button[1]") WebElement addtobag;
    @FindBy(xpath = "//*[@id=\"wallNavFG4\"]/button[10]/div")WebElement redcolour;
    @FindBy(xpath = "//*[@id=\"wallNavFG4\"]/button[2]/span")WebElement bluecolour;
    @FindBy(xpath = "//*[@id=\"wallNavFG4\"]/button[4]/span")WebElement greencolour;
    @FindBy(xpath = "//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/header/div[1]/div[2]/nav/div[2]/div/ul/li[2]/a")WebElement men;
    @FindBy(xpath = "//*[@id=\"DesktopMenu-0-1-0\"]/div/div[1]/a[1]")WebElement newrealeses;
    @FindBy(xpath = "//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/header/div[1]/div[2]/nav/div[2]/div/ul/li[3]/a")WebElement women;
    @FindBy(xpath = "//*[@id=\"DesktopMenu-0-2-0\"]/div/div[4]/a[1]")WebElement yoga;
    @FindBy(xpath = "//*[@id=\"wallNavFG3\"]/button[1]/div")WebElement purple;
    @FindBy(xpath = "//*[@id=\"wallNavFG3\"]/button[5]/div")WebElement green;
    @FindBy(xpath = "//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/header/div[1]/div[2]/nav/div[2]/div/ul/li[4]/a")WebElement kids;
    @FindBy(xpath = "//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/header/div[1]/div[2]/nav/div[2]/div/ul/li[5]/a")WebElement sale;
    @FindBy(xpath = "//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/header/div[1]/div[2]/nav/div[2]/div/ul/li[6]/a")WebElement customise;
    @FindBy(xpath = "//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/header/div[1]/div[2]/nav/div[2]/div/ul/li[7]/a")WebElement snkrs;
    @FindBy(xpath = "//*[@id=\"VisualSearchInput\"]")WebElement searchbar;
    @FindBy(xpath = "/html/body/div[3]/div/div[3]/header/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[1]/a/span")WebElement jordan;
    @FindBy(xpath = "//*[@id=\"left-nav\"]/nav/div/div/div[1]/span/div/div[2]")WebElement arrow;
    @FindBy(xpath = "//*[@id=\"wallNavFG0\"]/button[1]/span")WebElement selectmen ;
    @FindBy(xpath = "//*[@id=\"skip-to-products\"]/div[1]/div/figure/a[2]/div/img")WebElement firstshoes ;
    @FindBy(xpath = "//*[@id=\"pdp-6-up\"]/div/button[2]")WebElement nextbutton1;
    @FindBy(xpath = "//*[@id=\"buyTools\"]/div[1]/fieldset/div/div[11]/label")WebElement selectsize1;
    @FindBy(xpath = "//*[@id=\"floating-atc-wrapper\"]/div/button[1]")WebElement addtobag1;
    @FindBy(xpath = "//*[@id=\"71d7c4a4-9a73-4f81-8ae3-8e1d9c85decf\"]/div/div[1]/ul/li[1]/a")WebElement airforce1;
    
   public void menubar()
   {
       Actions actions = new Actions(driver);
      actions.moveToElement(newfeatured).perform();
      
     newarrival.click();
     firstshoe.click();
     nextbutton.click();
     nextbutton.click();
     nextbutton.click();
     nextbutton.click();
     nextbutton.click();

    selectsize.click();
    
 //   addtobag.submit();
    
    driver.navigate().back();

    
    JavascriptExecutor is = (JavascriptExecutor)driver;
	is.executeScript("window.scrollBy(0,500)","");
	redcolour.click();
    driver.navigate().back();

    bluecolour.click();
    driver.navigate().back();
    
     greencolour.click();
     driver.navigate().back();
     driver.navigate().back();
     
     Actions actions1 = new Actions(driver);
     actions.moveToElement(men).perform();

     newrealeses.click();
     
     JavascriptExecutor is1 = (JavascriptExecutor)driver;
 	is.executeScript("window.scrollBy(0,1000)","");
 	 
    driver.navigate().back();
    
    Actions actions2 = new Actions(driver);
    actions.moveToElement(women).perform();
    
    yoga.click();
    purple.click();
    driver.navigate().back();
    green.click();
    driver.navigate().back();
    driver.navigate().back();
    
    Actions actions3 = new Actions(driver);
    actions.moveToElement(kids).perform();
    
    Actions actions4 = new Actions(driver);
    actions.moveToElement(sale).perform();

    Actions actions5 = new Actions(driver);
    actions.moveToElement(customise).perform();
    
    Actions actions6 = new Actions(driver);
    actions.moveToElement(snkrs).perform();
     
   }
   public void searchbar()   {
	   
    searchbar.click();	
    searchbar.sendKeys("jordan");
    
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[3]/header/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[1]/a/span")));
   
    jordan.click();
    
    arrow.click();
 //   selectmen.click();
   firstshoes.click() ;
   
   nextbutton1.click();
   nextbutton1.click();
   nextbutton1.click();
   nextbutton1.click();
   nextbutton1.click();
   nextbutton1.click();
   nextbutton1.click();
   
   selectsize1.click();
   addtobag1.click();
   
   driver.navigate().back();
   driver.navigate().back();
   
    }
   
   public void lastpage() 
   {
	 
	   JavascriptExecutor is2 = (JavascriptExecutor)driver;
	 	is2.executeScript("window.scrollBy(0,8000)","");
	   
	 	airforce1.click();
	    driver.navigate().back();

   }
}
