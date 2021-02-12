package steps;




import cucumber.api.java.pt.Ent�o;
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

	@Ent�o("^clicar na programa��o$")
	public void clicar_na_programa��o() throws Throwable {
		PageprogramacaoSky.programacao();
	}

	@Ent�o("^validar titulo da programa��o$")
	public void validar_titulo_da_programa��o() throws Throwable {
	//	PageprogramacaoSky.validarTitle();
		PageprogramacaoSky.tituloPrograma();
	}
	
	@Ent�o("^validar dura��o da programa��o$")
	public void validar_duracao_da_programa��o() throws Throwable {

		PageprogramacaoSky.validarduracao();
	}
	
	
	

	@Ent�o("^Titulo for igual a \"([^\"]*)\"$")
	public void titulo_igual(String arg) throws Throwable {
		PageprogramacaoSky.validarTitle(arg);

	}
	
	


}
