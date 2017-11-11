package intialize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


public class idriver {
	public WebDriver driver;
	
	public WebElement findelement(WebDriver driver,By by,int timeouts){
		if(timeouts > 0){
			
		
		WebDriverWait wait = new WebDriverWait(driver,timeouts);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		return driver.findElement(by);
		}	
		else return driver.findElement(by);
	} 
	public idriver(WebDriver driver){
		this.driver=driver;
	}
	
	public WebDriver waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> Condition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(Condition);
        return driver;
    }
	public void scrollpage(WebDriver driver){
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,250)", "");
	}
	public WebDriver jscriptexeclick(WebDriver driver,WebElement ele){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", ele);
	    return driver;
	    
	}
}
