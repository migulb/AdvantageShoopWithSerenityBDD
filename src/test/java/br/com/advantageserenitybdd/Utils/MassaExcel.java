package br.com.advantageserenitybdd.Utils;

import net.serenitybdd.core.pages.PageObject;

public class MassaExcel extends PageObject {

	public MassaExcel() throws Exception {
		ReadyExcel.setExcelFile(Constante.Path_TestData + Constante.File_TestData, Constante.SheetName);
		getDriver();
	}
	

	public String usuario() throws Exception {

		return ReadyExcel.getCellData(1, Constante.Col_UserName);
	}

	public String email() throws Exception {
		return ReadyExcel.getCellData(1, Constante.Col_email);
	}

	public String senha() throws Exception {
		return ReadyExcel.getCellData(1, Constante.Col_senha);
	}

	public String ConfirmaSenha() throws Exception {
		return ReadyExcel.getCellData(1, Constante.Col_confSenha);

	}

	public String PrimeiroNome() throws Exception {
		return ReadyExcel.getCellData(1, Constante.Col_Nome);

	}

	public String UltimoNome() throws Exception {
		return ReadyExcel.getCellData(1, Constante.Col_endName);
	}

	public String Telefone() throws Exception {
		return ReadyExcel.getCellData(1, Constante.Col_Tel);
	}

	public String Estado() throws Exception {
		return ReadyExcel.getCellData(1, Constante.Col_estado);
	}

	public String Endereco() throws Exception {
		return ReadyExcel.getCellData(1, Constante.Col_endereco);
	}

	public String Cidade() throws Exception {
		return ReadyExcel.getCellData(1, Constante.Col_cidade);
	}

	public String CEP() throws Exception {
		return ReadyExcel.getCellData(1, Constante.COl_cep);
	}
	public String usuario_falha() throws Exception {

		return ReadyExcel.getCellData(2, Constante.Col_UserName);
	}

	public String email_falha() throws Exception {
		return ReadyExcel.getCellData(2, Constante.Col_email);
	}

	public String senha_falha() throws Exception {
		return ReadyExcel.getCellData(2, Constante.Col_senha);
	}

	public String ConfirmaSenha_falha() throws Exception {
		return ReadyExcel.getCellData(2, Constante.Col_confSenha);

	}

	public String PrimeiroNome_falha() throws Exception {
		return ReadyExcel.getCellData(2, Constante.Col_Nome);

	}

	public String UltimoNome_falha() throws Exception {
		return ReadyExcel.getCellData(2, Constante.Col_endName);
	}

	public String Telefone_falha() throws Exception {
		return ReadyExcel.getCellData(2, Constante.Col_Tel);
	}

	public String Estado_falha() throws Exception {
		return ReadyExcel.getCellData(2, Constante.Col_estado);
	}

	public String Endereco_falha() throws Exception {
		return ReadyExcel.getCellData(2, Constante.Col_endereco);
	}

	public String Cidade_falha() throws Exception {
		return ReadyExcel.getCellData(2, Constante.Col_cidade);
	}

	public String CEP_falha() throws Exception {
		return ReadyExcel.getCellData(2, Constante.COl_cep);
	}

}
