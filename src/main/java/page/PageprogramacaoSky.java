package page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import hooks.Basedriver;

public class PageprogramacaoSky {

	static WebDriver driver = Basedriver.getDriver();

	public static void acessarUrl(String url) {
		driver.get(url);
		WebElement popup = driver
				.findElement(By.cssSelector("div[class='modal-header borderless'] button[aria-label=Close]"));
		if (popup.isDisplayed()) {
			popup.click();
		}
	}

	public static void acessarMenu(String arg1) {

		driver.findElement(By.linkText(arg1)).click();
	}

	public static void programacao() {

	}

	public static void validarTitle(String Arg) {
		assertEquals(Arg, driver.getTitle());
		
	}

}
