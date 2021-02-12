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

	private final static By btnClosepopup = By.cssSelector("div[class='modal-header borderless'] button[aria-label=Close]");
	private final static By txtProgramacao = By.xpath("//*[@class='schedule-inner schedule-live'] //div[@class='program-schedule-content'][1]");
	private final static By txtnamePrograma = By.xpath("//*[@class='schedule-inner schedule-live'] //h2[@class='program-schedule-title']");
	private final static By txtdurationProgramacao = By.xpath("//*[@class='schedule-inner schedule-live'] //div[@class='program-schedule-content'][1] //div[@class='program-duration']");
	private final static By txttituloPrograma = By.cssSelector("div[class='sky-modal-program-title']");
	private final static By txtduracaoPrograma = By.cssSelector("div[class='sky-modal-program-date-time']");

	public static void acessarUrl(String url) {
		driver.get(url);
		WebElement popup = driver.findElement(btnClosepopup);
		if (popup.isDisplayed()) {
			popup.click();
		}
	}

	public static void acessarMenu(String arg1) {

		driver.findElement(By.linkText(arg1)).click();
	}

	public static void programacao() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(txtProgramacao).click();

		WebElement nameProgramacao = driver.findElement(txtnamePrograma);
		nomePrograma = nameProgramacao.getText();
		WebElement durationProgramacao = driver.findElement(txtdurationProgramacao);
		duracaoPrograma = durationProgramacao.getText();
		System.out.println(duracaoPrograma);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void validarTitle(String Arg) {
		assertEquals(Arg, driver.getTitle());
	}

	public static void tituloPrograma() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement titulo = driver.findElement(txttituloPrograma);
		assertEquals(nomePrograma, titulo.getText());
	}

	public static void validarduracao() {
		WebElement titulo = driver.findElement(txtduracaoPrograma);
		assertEquals(duracaoPrograma, titulo.getText());
	}

}
