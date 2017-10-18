package Kart;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import intialize.initialize;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class homepage_test extends initialize {
		
	@BeforeTest
	public void initialize() throws IOException{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
		
	@ Test(dataProvider = "getData")
	public void homepagenavigation(String email,String password) throws IOException {
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		
		//hp.getLogin().click();
		//lp.getEmail().sendKeys(email);
		//lp.getPassword().sendKeys(password);
	//	lp.getLogin().click();
		hp.getSearchBar().click();
		hp.getSearchBar().sendKeys("longbeach, CA"); 
		hp.getSearchBar().sendKeys(Keys.RETURN);
	}
	

	@DataProvider
	public Object[][] getData() {
		//array size 2 , index -> 0,1
		Object[][] data = new Object[2][2];
		//row number indicates test data number and column number indicates type of data per test
		data[0][0] ="trojanster@aol.com";
		data[0][1] ="123456789a";
		

		return data;
		
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
	}
	
	


}
