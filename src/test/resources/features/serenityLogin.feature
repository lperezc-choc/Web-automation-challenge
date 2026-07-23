Feature: Login en SauceDemo

  Como usuario
  Quiero iniciar sesión
  Para ingresar al inventario

  @login

  Scenario: Login exitoso

    Given que el usuario abre SauceDemo

    When ingresa sus credenciales

    Then debe visualizar el inventario