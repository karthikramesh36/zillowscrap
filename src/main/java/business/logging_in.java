package business;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import intialize.idriver;
import objectRepo.HomePage;
import objectRepo.LoginPage;
import test_data.excel;

public class logging_in {
	public WebDriver driver;

	
	public logging_in(WebDriver driver) {
		this.driver=driver;

		// TODO Auto-generated constructor stub
	}

	public WebDriver homep_to_loginp(WebDriver driver){
		HomePage hp = new HomePage(driver);
		idriver idriver= new idriver(driver);
		WebElement myaccount=hp.get_myaccount();
		driver=idriver.jscriptexeclick(driver, myaccount);
		
	    WebElement signin=hp.get_signin();
	    driver=idriver.jscriptexeclick(driver, signin);
		
		return driver;
	}
	
	public WebDriver user_login(WebDriver driver) throws IOException, InterruptedException{
		LoginPage lp = new LoginPage(driver);
		excel e = new excel();
		Actions act = new Actions(driver);

		
		FileInputStream fis = e.load_file();
		String email = e.get_email(fis);
//		lp.getEmail().sendKeys(email);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		lp.getLogin().click();

		FileInputStream fis1 = e.load_file();
		String password = e.get_password(fis1);
		act.sendKeys(lp.getPassword(), password);

	//	lp.getPassword().sendKeys(password);
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		idriver idriver= new idriver(driver);
		idriver.waitForLoad(driver);
		WebElement login_button = lp.getLogin();
		driver=idriver.jscriptexeclick(driver, login_button);
	//	lp.getShow().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//	lp.getPassword().sendKeys(Keys.RETURN);
		
	//	lp.getLogin().click();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.findElement(By.className("form form-input")).submit();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	Actions act = new Actions(driver);
	//	act.moveToElement(driver.findElement(By.id("login"))).click();
		return driver;
		
	}
}
