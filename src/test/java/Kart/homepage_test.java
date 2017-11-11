package Kart;

import org.testng.annotations.Test;

import business.logging_in;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import intialize.initialize;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class homepage_test extends initialize {
	
	logging_in l = new logging_in(driver);
	
	@BeforeClass
	public void initialize() throws IOException{
		driver=initializeDriver();
	}
		
	@ Test
	public void homepagenavigation() throws IOException, InterruptedException {
		driver.get(prop.getProperty("url"));
		driver=l.homep_to_loginp(driver);
		driver=l.user_login(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(driver.getCurrentUrl());
		//driver.getCurrentUrl();
		

		
		
		

	}
		
	@AfterClass
	public void teardown(){
		driver.close();
	}
	
	


}
