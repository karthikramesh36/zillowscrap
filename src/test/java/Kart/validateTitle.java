package Kart;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import intialize.idriver;
import intialize.initialize;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class validateTitle extends initialize {
	
	
	@BeforeTest
	public void initialize() throws IOException{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@ Test
	public void homepagenavigation() throws IOException {
		idriver i = new idriver(driver);
		HomePage hp = new HomePage(driver);
		
		i.waitForLoad(driver);
	//	WebElement var = hp.getTitle();
		AssertJUnit.assertTrue(hp.getTitle().isDisplayed());
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
	}
	


}
