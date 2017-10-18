package Kart;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import intialize.initialize;

public class init_test extends initialize {
	
	@ Test
	public void browerinvocationtest() throws IOException {
		driver=initializeDriver();
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
	}
	


}
