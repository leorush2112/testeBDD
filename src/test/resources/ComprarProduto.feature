
Feature: Comprar produto

  Scenario: Compra a partir de uma Busca
    Given acesso o site Petz
    When busco por "Coleira" e pressiono Enter
    Then exibe uma lista de produtos relacionados com "Coleira"
    When escolho "Guia Petz Flamingo para Cães"
    Then exibe para o "Tamanho PP" o preco de "R$ 43,99"




