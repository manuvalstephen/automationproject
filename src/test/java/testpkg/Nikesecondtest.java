package testpkg;

import java.awt.MenuBar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Nikepage;
import pagepkg.Nikesecondpage;

public class Nikesecondtest {
	
	
	WebDriver driver;
	String baseurl ="https://www.nike.com/in/";
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();

		}
	@Test
	 public void mainpage() 
	 {
		Nikesecondpage nik = new Nikesecondpage(driver);

		nik.menubar();
		nik.searchbar();
		nik.lastpage();
	 }
	
	

}
