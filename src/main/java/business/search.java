package business;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import intialize.idriver;
import objectRepo.HomePage;
import test_data.excel;

public class search {
	public WebDriver driver;

	
	public search(WebDriver driver) {
		this.driver=driver;

		// TODO Auto-generated constructor stub
	}
	
	public WebDriver nintendo_switch(WebDriver driver) throws IOException{
		HomePage hp = new HomePage(driver);
		excel e = new excel();
		idriver i = new idriver(driver);

		i.waitForLoad(driver);

		FileInputStream fis = e.load_file();
		String query = e.get_query(fis);
		Actions act = new Actions(driver);
		act.moveToElement(hp.get_searchBar());
		act.click();
		act.sendKeys(query);
		act.sendKeys(Keys.RETURN);
		act.build().perform();
	//	hp.get_searchBar().sendKeys(query);
	//	hp.get_searchBar().sendKeys(Keys.RETURN);
		return driver;
	}

}
