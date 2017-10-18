package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import intialize.idriver;

public class HomePage {

	public WebDriver driver;
	idriver idriver = new idriver(driver);
	
	
	By signIn = By.id("login_opener");
	By searchBar = By.id("citystatezip");
	By title = By.className("zsg-logo-svg");
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	
	public WebElement getLogin(){
		return idriver.findelement(driver, signIn, 30);
	}
	public WebElement getTitle(){
		return idriver.findelement(driver, title, 10);
	}	
	public WebElement getSearchBar(){
		return idriver.findelement(driver, searchBar, 30);
		
	}	
	
}
