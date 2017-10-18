package Kart;

import org.openqa.selenium.WebDriver;

import objectRepo.resultsPage;

public class scrap {
public WebDriver driver;

	public WebDriver dataScrapper(WebDriver driver,int pages){
		resultsPage rp = new resultsPage(driver);
		int i = 0;
		while(i<=pages){
	//	scrapper(rp);
		rp.getnextPage().click();
		i++;
		}
		return driver;
		
	}
	public scrap(WebDriver driver){
		this.driver=driver;
	}
	public void scrapper(WebDriver driver){
		
	}
}
