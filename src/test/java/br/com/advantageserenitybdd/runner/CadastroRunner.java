package br.com.advantageserenitybdd.runner;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"br.com.advantageserenitybdd.stepDefinitions"},
        features = "src/test/resources/features/cadastro.feature")
public class CadastroRunner {}