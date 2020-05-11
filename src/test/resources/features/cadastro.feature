#language:pt
#coding: utf-8


Funcionalidade: Cadastro de usuário


Contexto: acessar o site SHOPAdvance e testar funcionalidades referente cadastro


@CadastroDeUsuario
  Cenário: Cadastro de usuário
    Dado a abertura do site principal
    Quando o menu do lado direito superior for ativado
    E deve clicar em CREATE NEW ACCOUNT 
    E preencher todos os dados necessários do site
    E clica em REGISTER
    Então finalizar o navegador