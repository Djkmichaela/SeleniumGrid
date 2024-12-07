import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTestInfireFox {

	
	
	
	
	@Test
	public void runTestInGridrr() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("firefox");
		//System.setProperty("webdriver.chromedriver.driver", "/Users/michaeldjamba/Desktop/Grid/chromedriver");
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.88.253:4444"),caps);
		
		driver.get("https://www.google.com/");
	
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Michael djamba");
		driver.close();

		
	}
}
