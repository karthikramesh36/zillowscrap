package intialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class initialize {
	public static WebDriver driver;
	public Properties prop;

	
	public WebDriver initializeDriver() throws IOException{		
	FileInputStream fis = new FileInputStream("/Users/karthik/zillowscrap/src/main/java/intialize/data.Properties");
	prop = new Properties();
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	// 1 implies firefox
	// 2 implies chrome
	if (browserName.equals("1")) {
		System.setProperty("webdriver.gecko.driver", "/Users/karthik/Downloads/geckodriver");
		driver = new FirefoxDriver();
		
	}
	else if (browserName.equals("2")){
		System.setProperty("webdriver.chrome.driver", "/Users/karthik/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	return driver;
}
						
}
	
	//public void findElement(WebDriver driver,By by,int Timeout){
		
	

