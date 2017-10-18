package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import intialize.idriver;

public class LoginPage {

	public WebDriver driver;
	idriver idriver = new idriver(driver);

	
	By Email = By.id("reg-login-email");
	By Password = By.id("inputs-password");
	By Login = By.cssSelector("[value='Sign in']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail(){
		return idriver.findelement(driver,Email,30);
	}	
	public WebElement getPassword(){
		return idriver.findelement(driver,Password,30);
	}
	public WebElement getLogin(){
		return idriver.findelement(driver,Login,30);
	}
}
