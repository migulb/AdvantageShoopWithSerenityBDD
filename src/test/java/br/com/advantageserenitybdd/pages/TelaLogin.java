package br.com.advantageserenitybdd.pages;

import br.com.advantageserenitybdd.PO.DashboardPO;
import br.com.advantageserenitybdd.PO.PaginaLoginPO;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

public class TelaLogin {

	PaginaLoginPO login;
	DashboardPO dash;
	
	@Step
	public void abreAplicacao() {
		dash.open();
	}
	
	@Step
	public void clicoEmLogin () {
		login.clicarLogin();
	}
	
	@Step
	public void clicoEmCadastrar() {
		login.clicaCadastro();
	}
}
