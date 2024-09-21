#autor Andres Cruz

Feature: Agregar productos al carro de compras.

  Yo como usuario
  Quiero agregar 2 productos con diferentes cantidades 2 y 5 al carrito de compras
  Para comprobar que se añadan los productos correctamente

  Background:
    Given "usuario" abre el sitio web de pruebas

  @successful
  Scenario: Agregar 2 productos al carro de compras
    And selecciona aleatoriamente el primer producto, define la cantidad 2 y lo añade al carrito
    When selecciona aleatoriamente el segundo producto, define la cantidad 5 y lo añade al carrito
    Then visualizara en la cabecera el titulo finalizar compra