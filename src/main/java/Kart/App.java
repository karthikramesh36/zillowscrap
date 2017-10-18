package Kart;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import intialize.idriver;
import intialize.initialize;

/**
 * Hello world!
 *
 */
public class App extends initialize
{	public  WebDriver driver;

	public void begin() throws IOException{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		idriver i = new idriver(driver);
		home H = new home(driver);
		scrap S = new scrap(driver);
				
		driver=i.waitForLoad(driver);
		driver=H.homepage(driver);
		
		i.waitForLoad(driver);
		i.scrollpage(driver);
		driver=S.dataScrapper(driver,3);
		
	}

    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.begin();
    }
}
