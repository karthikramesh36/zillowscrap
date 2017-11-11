package Kart;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import intialize.initialize;

public class init_test extends initialize {
	
			
	@BeforeTest
	public void initialize() throws IOException{
		driver=initializeDriver();
	}
	@ Test
	public void browerinvocationtest() throws IOException {
		driver.get(prop.getProperty("url"));
	//	Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.id("js-toggleRightNavLg"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", ele);

		WebElement ele1 = driver.findElement(By.id("rightNav-signIn"));
	    JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", ele1);

	//	act.moveToElement(driver.findElement(By.id("rightNav-signIn"))).click();
	//	driver.findElement(By.xpath("//*[@id='rightNav-signIn']"));
		//driver.findElement(By.id("js-toggleRightNavLg")).click();
	//	WebElement ele = driver.findElement(By.id("rightNav-signIn"));
	//	ele.getLocation().
		
	}
	
	@AfterTest
	public void teardown(){
		//driver.close();
	}
	


}
