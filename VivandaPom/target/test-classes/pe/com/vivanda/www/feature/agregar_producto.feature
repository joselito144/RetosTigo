# Author: jose.suarez@sophossolutions.com


Feature: Agregar Producto al carrito
  Yo como usuario de Vivanda quiero elegir un producto del catalogo para agregarlo al carrito


Background: el usuario ingresa a la pagina

  Given el usuario ingresa a la pagina de Vivanda
  
  Scenario Outline: Agregar producto desde el menu
  
 	When Jose busca un producto desde el menu
    
    | tipoProducto   | nombreProducto   |
    | <tipoProducto> | <nombreProducto> |
    
    
  Then el puede verlo agregado al carrito
    
Examples:
    | tipoProducto              | nombreProducto                                    |
    | Frutas y Verduras         | Zanahoria Entera Precio x Kg (6 unid aprox = 1kg) |
		| Vinos, Licores y Cervezas | Cerveza HEINEKEN Barril 5L                        |


