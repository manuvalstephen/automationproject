package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Nikepage;


public class Niketest {
	
	WebDriver driver;
	String baseurl ="https://www.nike.com/in/";
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();

		}
	@Test
	public void homepagevalidation() throws Exception 
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Nikepage nik = new Nikepage(driver);

		nik.titleverification();
		nik.logo1verification();
		nik.logo2verification();
		nik.joinus();
		nik.signup();
		nik.emailsignup();
		nik.summit();
	//	nik.signuppage();
		
        nik.sigin();
       // nik.country();
		nik.emailregistration();
		nik.summit1();
		nik.findastore();
		nik.searchfindastore();
		nik.checkbox();
		nik.addToBag();
    	nik.bagitems();
	}

}	

