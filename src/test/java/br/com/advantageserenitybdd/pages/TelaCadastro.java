package br.com.advantageserenitybdd.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.com.advantageserenitybdd.PO.CadastroPO;
import br.com.advantageserenitybdd.Utils.MassaExcel;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class TelaCadastro extends PageObject {

	MassaExcel dados;
	CadastroPO cadastro;
	
	
	@Step
	public void digitaOsDados() throws Exception {
		cadastro.digitaUsuario(dados.usuario());
		cadastro.digitaEmail(dados.email());
		cadastro.digitaSenha(dados.senha());
		cadastro.confirmaSenha(dados.ConfirmaSenha());
		cadastro.digitaPrimeiroNome(dados.PrimeiroNome());
		cadastro.digitaUltimoNome(dados.UltimoNome());
		cadastro.digitaTelefone(dados.Telefone());
		cadastro.escolherPais();
		cadastro.digitaCidade(dados.Cidade());
		cadastro.digitaEndereco(dados.Endereco());
		cadastro.digitaEstado(dados.Estado());
		cadastro.digitaCEP(dados.CEP());
		cadastro.aceitaTermos();
		cadastro.confirmaCadastro();
		
		$(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']")).isVisible();
		String user = $(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']")).getText();

		Assert.assertTrue(user.contains(dados.usuario()));
	}
	

}
