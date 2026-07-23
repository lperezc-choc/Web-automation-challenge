Feature: Compra de un producto

  Como usuario
  Quiero comprar un producto
  Para finalizar una compra correctamente

  @purchase

  Scenario: Compra exitosa

    Given que el usuario inicia una compra en SauceDemo
    When realiza la compra de un producto
    Then debe finalizar la compra correctamente