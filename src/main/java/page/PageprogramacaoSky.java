package page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import hooks.Basedriver;

public class PageprogramacaoSky {

	static WebDriver driver = Basedriver.getDriver();
	public static String nomePrograma;
	public static String duracaoPrograma;

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
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@class='schedule-inner schedule-live'] //div[@class='program-schedule-content'][1]")).click();
		
		WebElement nameProgramacao = driver.findElement(By.xpath("//*[@class='schedule-inner schedule-live'] //h2[@class='program-schedule-title']"));
		nomePrograma = nameProgramacao.getText();
		WebElement durationProgramacao = driver.findElement(By.xpath("//*[@class='schedule-inner schedule-live'] //div[@class='program-schedule-content'][1] //div[@class='program-duration']"));
		duracaoPrograma = durationProgramacao.getText();
		System.out.println(duracaoPrograma);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void validarTitle(String Arg) {
		
		assertEquals(Arg, driver.getTitle());

	}

	public static void tituloPrograma() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	WebElement titulo =	driver.findElement(By.cssSelector("div[class='sky-modal-program-title']"));
	
	assertEquals(nomePrograma, titulo.getText());
	}



	public static void validarduracao() {
		// TODO Auto-generated method stub
	WebElement titulo =	driver.findElement(By.cssSelector("div[class='sky-modal-program-date-time']"));
		
		assertEquals(duracaoPrograma, titulo.getText());
	}

}
