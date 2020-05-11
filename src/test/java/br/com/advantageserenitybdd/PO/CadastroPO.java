package br.com.advantageserenitybdd.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CadastroPO extends PageObject {

	
	//Identificador dos Elementos Web
	private WebElementFacade cbx_pais() {

		WebElementFacade pais = $(By.name("countryListboxRegisterPage"));

		return pais;
	}

	private WebElementFacade txt_user() {

		WebElementFacade user = $(By.name("usernameRegisterPage"));

		return user;
	}

	private WebElementFacade txt_email() {

		WebElementFacade email = $(By.name("emailRegisterPage"));

		return email;
	}
	
	private WebElementFacade txt_senha() {

		WebElementFacade senha = $(By.name("passwordRegisterPage"));

		return senha;
	}
	
	private WebElementFacade confirmarSenha() {

		WebElementFacade confsenha = $(By.name("confirm_passwordRegisterPage"));

		return confsenha;
	}
	
	private WebElementFacade txt_nome() {

		WebElementFacade confsenha = $(By.name("first_nameRegisterPage"));

		return confsenha;
	}
	
	private WebElementFacade txt_ultimoNome() {

		WebElementFacade confsenha = $(By.name("last_nameRegisterPage"));

		return confsenha;
	}
	
	private WebElementFacade txt_Telefone() {

		WebElementFacade confsenha = $(By.name("phone_numberRegisterPage"));

		return confsenha;
	}
	
	private WebElementFacade txt_Cidade() {

		WebElementFacade confsenha = $(By.name("cityRegisterPage"));

		return confsenha;
	}
	
	private WebElementFacade txt_Endereco() {
		WebElementFacade endereco = $(By.name("addressRegisterPage"));
		
		return endereco;
	}
	
	private WebElementFacade txt_Estado() {
		WebElementFacade estado = $(By.name("state_/_province_/_regionRegisterPage"));
		
		return estado;
	}
	
	private WebElementFacade txt_cep() {
		WebElementFacade cep = $(By.name("postal_codeRegisterPage"));
		
		return cep;
	}
	
	private WebElementFacade chkbx_Termos() {
		WebElementFacade termos = $(By.name("i_agree"));
		
		return termos;
	}
	
	private WebElementFacade btn_ConfirmaCadastro() {
		WebElementFacade btn_cadastro = $(By.id("register_btnundefined"));
		
		return btn_cadastro;
		
	}
	
	//////////AÇÃO DOS ELEMENTOS////////////

	public void digitaUsuario(String User) {
		txt_user().isVisible();
		txt_user().sendKeys(User);
	}

	public void digitaEmail(String email) {
		txt_email().sendKeys(email);
	}

	public void digitaSenha(String senha) {
		txt_senha().sendKeys(senha);
	}

	public void confirmaSenha(String confiSenha) {
		confirmarSenha().sendKeys(confiSenha);
	}

	public void digitaPrimeiroNome(String nome) {
		txt_nome().sendKeys(nome);
	}

	public void digitaUltimoNome(String ultimoNome) {
		txt_ultimoNome().typeAndTab(ultimoNome);
	}

	public void digitaTelefone(String telefone) {
		txt_Telefone().sendKeys(telefone);
	}

	public void escolherPais() {
		new Select(cbx_pais()).selectByVisibleText("Brazil");

	}

	public void digitaCidade(String cidade) {
		txt_Cidade().sendKeys(cidade);
	}
	
	public void digitaEndereco(String endereco) {
		txt_Endereco().sendKeys(endereco);
	}
	
	public void digitaEstado(String estado) {
		txt_Estado().sendKeys(estado);
	}
	
	public void digitaCEP(String cep) {
		txt_cep().sendKeys(cep);
	}
	
	public void aceitaTermos() {
		chkbx_Termos().click();
	}

	public void confirmaCadastro() {
		btn_ConfirmaCadastro().click();
	}
}
