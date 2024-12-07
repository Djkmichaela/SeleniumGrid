import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {

	@Test
	public void runTestInGrid() throws MalformedURLException, URISyntaxException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		// System.setProperty("webdriver.chromedriver.driver",
		// "/Users/michaeldjamba/Desktop/Grid/chromedriver");
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.88.253:4444").toURL(), caps);

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Michael djamba");
		driver.close();

	}

}
