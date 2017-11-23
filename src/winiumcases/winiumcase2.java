package winiumcases;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class winiumcase2 {
	WiniumDriver driver = null;
	
	@BeforeClass
	public void setUpEnvironment() throws IOException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		
		
		try {
			driver = new WiniumDriver(new URL("http://localhost:9999"),options);
		}catch(MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNotePadApplication() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.findElementById("num6Button").click();
		Thread.sleep(1000);
		driver.findElementById("num9Button").click();
		Thread.sleep(1000);
		driver.findElementById("num2Button").click();
		Thread.sleep(1000);
		driver.findElementById("num8Button").click();
		Thread.sleep(1000);
		driver.findElementById("multiplyButton").click();
		Thread.sleep(1000);
		driver.findElementById("num1Button").click();
		Thread.sleep(1000);
		driver.findElementById("num4Button").click();
		Thread.sleep(1000);
		driver.findElementById("num5Button").click();
		Thread.sleep(1000);
		driver.findElementById("equalButton").click();
		
		
	}
	
	@AfterClass
	public void tearDown() throws IOException {
		//driver.close();
	}

}
