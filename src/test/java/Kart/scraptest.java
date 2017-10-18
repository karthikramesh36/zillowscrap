package Kart;

import org.testng.annotations.Test;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import intialize.initialize;
import objectRepo.HomePage;
import objectRepo.LoginPage;
import objectRepo.resultsPage;

public class scraptest extends initialize {
	
	@BeforeTest
	public void initialize() throws IOException{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test 
	public void homepagenavigation() throws IOException {
		HomePage hp = new HomePage(driver);
		resultsPage rp = new resultsPage(driver);
		
		hp.getSearchBar().click();
		hp.getSearchBar().sendKeys("longbeach, CA"); 
		hp.getSearchBar().sendKeys(Keys.RETURN);
		
		String url=driver.getCurrentUrl();
		Document doc = Jsoup.connect(url).get();
		
		
	}
	@AfterTest
	public void teardown(){
		driver.close();
	}

}
