package br.com.advantageserenitybdd.PO;

import org.jruby.ir.instructions.defined.GetDefinedConstantOrMethodInstr;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class DashboardPO extends PageObject{

	@Step
	public void iniciaAplicação() {
		getDriver();
	}
}
