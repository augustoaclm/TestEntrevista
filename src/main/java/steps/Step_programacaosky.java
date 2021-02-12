package steps;




import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import page.PageprogramacaoSky;

public class Step_programacaosky {
	
	
	

	@Quando("^acessar site \"([^\"]*)\"$")
	public void acessar_site(String url) throws Throwable {
		PageprogramacaoSky.acessarUrl(url);
		
		
		
		
	}

	@Quando("^acessar menu \"([^\"]*)\"$")
	public void acessar_menu(String menu) throws Throwable {
		
		PageprogramacaoSky.acessarMenu(menu);
		

	}

	@Então("^clicar na programação$")
	public void clicar_na_programação() throws Throwable {
		PageprogramacaoSky.programacao();
	}

	@Então("^validar titulo da programação$")
	public void validar_titulo_da_programação() throws Throwable {
	//	PageprogramacaoSky.validarTitle();
		PageprogramacaoSky.tituloPrograma();
	}
	
	@Então("^validar duração da programação$")
	public void validar_duracao_da_programação() throws Throwable {

		PageprogramacaoSky.validarduracao();
	}
	
	
	

	@Então("^Titulo for igual a \"([^\"]*)\"$")
	public void titulo_igual(String arg) throws Throwable {
		PageprogramacaoSky.validarTitle(arg);

	}
	
	


}
