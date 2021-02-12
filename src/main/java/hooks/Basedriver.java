package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Basedriver {

	public static WebDriver driver;

	@Before
	public void beforeCenario() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@After
	public void afterCenario() {
		driver.quit();
	}

}
