package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import intialize.idriver;

public class HomePage {

	public WebDriver driver;
	idriver idriver = new idriver(driver);
	
	By myaccount = By.id("js-toggleRightNavLg");
	By signIn = By.id("rightNav-signIn");
	By searchBar = By.id("searchLabel");
	By title = By.className("zsg-logo-svg");
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	
	public WebElement get_myaccount(){
		idriver.waitForLoad(driver);

		return idriver.findelement(driver, myaccount, 30);
		
		
	}
	public WebElement get_signin(){
		idriver.waitForLoad(driver);
		return idriver.findelement(driver, signIn, 10);
	}	
	public WebElement get_searchBar(){
		return idriver.findelement(driver, searchBar, 30);
		
	}	
	
}
