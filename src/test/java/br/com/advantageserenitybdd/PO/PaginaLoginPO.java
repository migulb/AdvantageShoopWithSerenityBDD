package br.com.advantageserenitybdd.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

public class PaginaLoginPO extends PageObject {

	
	public void clicarLogin () {
		$(By.id("menuUser")).isVisible();
		$(By.id("menuUser")).click();
	}
	
	public void clicaCadastro() {
		$(By.xpath("//a[@class='create-new-account ng-scope']")).sendKeys(Keys.ENTER);;
	}
	
}
