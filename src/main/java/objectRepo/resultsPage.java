package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import intialize.idriver;

public class resultsPage {

	public WebDriver driver;
	idriver idriver = new idriver(driver);
	
	By nextpage = By.className("zsg-pagination-next");
	
	public resultsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	
	public WebElement getnextPage(){
		idriver.scrollpage(driver);

		return idriver.findelement(driver, nextpage, 30);
	}
	
	
}
