#Author: sml.souza@yahoo.com.br

@executa
Feature: Comprar produtos no site
  Eu como usuario quero acessar o site para realizar compras



  @executa1
  Scenario: Cadastrar novo usuario
    Given que eu testes no site
    When clicar em  Sign in
    And  preencho todos os campos
    Then valido as informcoes

  @executa2
  Scenario: Comprar o produto Printed Chiffon Dress
    Given que eu testes no url
    When clicar no campo pesquisa
    And informo o produto Printed Chiffon Dress e faco a busca
    And clico no produto Printed Chiffon Dress e escolho a cor
    And informo o tamanho m



  @executa3
  Scenario: Comprar o produto Faded Short Sleeve T-shirts
    When clicar no campo pesquisa
    And informo o produto Faded Short Sleeve T-shirts e faco a busca
    And clico no produto Faded Short Sleeve T-shirts e escolho a cor



  @executa4
  Scenario: Comprar o produto Blouse
    When clicar no campo pesquisa
    And informo o produto Blouse e faco a busca
    And informo a quantidade dois


  @executa5
  Scenario: Comprar o produto Printed Dress
    When clicar no campo pesquisa
    And informo o produto Printed Dress e faco a busca
    And clico no produto Printed Dress
    And envio ao carrinho e finalizo a compra
    Then valido as informcoes e fecho o site



