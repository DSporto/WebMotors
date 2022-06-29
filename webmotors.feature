#Author: webmotors.com.br


Feature: Realizar pesquisa google
  Eu como usuario quero acessar o site para realizar uma pesquisa
 
  Scenario: Pesquisar um veiculo no site da webmotors e entrar em contato com o vendedor
    Given Que eu esteja no site "https://hportal.webmotors.com.br/ "
    When Eu preencher o nome do "veiculo"
    Then Visualizo as informacoes do veiculo pesquisado e campos para envio de msg para vendedor
   
    
    