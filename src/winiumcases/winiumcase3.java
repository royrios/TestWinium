package winiumcases;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class winiumcase3 {
	WiniumDriver driver = null;
	
	@BeforeClass
	public void setUpEnvironment() throws IOException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Users\\Roy\\Documents\\proyectos visual EXE\\setup.exe");
		
		
		try {
			driver = new WiniumDriver(new URL("http://localhost:9999"),options);
		}catch(MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNotePadApplication() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.findElementById("textBoxMyInput").sendKeys(" prueba para formulario ultra basico");
		Thread.sleep(1000);
		driver.findElementById("btnOK").click();
		
		
	}
	
	@AfterClass
	public void tearDown() throws IOException {
		//driver.close();
	}

}
