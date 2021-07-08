
Feature: Comprar produto

  Scenario: Compra a partir de uma Busca
    Given acesso o site Petz
    When busco por "Coleira" e pressiono Enter
    Then exibe uma lista de produtos relacionados com "Coleira"
    When escolho "Coleira Petz Azul para Cães"
    Then exibe para o "Tamanho P" o preço de "R$ 39,99"




