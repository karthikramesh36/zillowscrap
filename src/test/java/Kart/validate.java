package Kart;

import org.testng.annotations.Test;

import business.search;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import intialize.idriver;
import intialize.initialize;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class validate extends initialize {
	

	@BeforeTest
	public void initialize() throws IOException{
		driver=initializeDriver();
	}
	@ Test
	public void homepagenavigation() throws IOException {
		driver.get(prop.getProperty("url"));

		search s = new search(driver);
		driver=s.nintendo_switch(driver);
		String c=driver.findElement(By.xpath("//*[@id='productgrid']/section[1]/div[1]/div[1]/h1")).getText();
		System.out.println(c);
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
	}
	


}
