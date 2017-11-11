package Kart;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class home {
public WebDriver driver;
	
	public home(WebDriver driver){
		this.driver=driver;
	}
	
	public WebDriver homepage(WebDriver driver){
		
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
	//	hp.getTitle().isDisplayed();
		//hp.getLogin().click();
		lp.getEmail().sendKeys("trojanster@aol.com");
		lp.getPassword().sendKeys("123456789a");
		lp.getLogin().click();
		//hp.getSearchBar().click();
		//hp.getSearchBar().sendKeys("longbeach, CA");
		//hp.getSearchBar().sendKeys(Keys.RETURN);
		return driver;
		
	}
}
