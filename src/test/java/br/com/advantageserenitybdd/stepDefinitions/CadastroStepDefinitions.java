package br.com.advantageserenitybdd.stepDefinitions;


import br.com.advantageserenitybdd.pages.TelaCadastro;
import br.com.advantageserenitybdd.pages.TelaLogin;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

public class CadastroStepDefinitions {

	@Steps
	TelaLogin login;
	
	@Steps
	TelaCadastro cadastro;
	
	
	
	@Dado("a abertura do site principal")
	public void a_abertura_do_site_principal() {
		login.abreAplicacao();
	}

	@Quando("o menu do lado direito superior for ativado")
	public void o_menu_do_lado_direito_superior_for_ativado() {
		login.clicoEmLogin();
	}

	@E("deve clicar em CREATE NEW ACCOUNT")
	public void deve_clicar_em_CREATE_NEW_ACCOUNT() {
		login.clicoEmCadastrar();
	}

	@E("preencher todos os dados necessários do site")
	public void preencher_todos_os_dados_necessários_do_site() throws Exception {
	   cadastro.digitaOsDados();
	}

	@E("clica em REGISTER")
	public void clica_em_REGISTER() {
	   
	}

	@Então("finalizar o navegador")
	public void finalizar_o_navegador() {
	   
	}
}
