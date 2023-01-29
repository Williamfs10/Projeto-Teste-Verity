
@tag
Feature: Site Verity

   @tag2
   Scenario: Cadastro 
    Given que acesse a url "https://www.verity.com.br/"
    When for exibido a tela home
    And  selecionado o botao contato
    And preencher os campos contato
    And selecionar o checkbox
    Then clicar no botao enviar 
                                                                                                                                                                                                                                             
  @tag1
  Scenario: ValidacaoTexto
    Given que acesse a url "https://www.verity.com.br/"
    When for exibido a tela home
    Then validar o texto Nossas soluções_
                                                                                                                                                                                                                        
  