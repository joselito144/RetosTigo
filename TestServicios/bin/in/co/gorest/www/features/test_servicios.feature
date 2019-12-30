#Author: jose.suarez@sophossolutions.com


@tag
Feature: Crear usuario
  Yo como usuario deseo crear mi usuario en la api rest

  Scenario Outline: Creacion de usuario 
    When Jose intenta crear un usuario con los datos
	| first_name    |  last_name    |  gender   |  email    |  status   |
	| <first_name>  |  <last_name>  |  <gender> |  <email>  |  <status> |
	
    Then El deberia recibir un codigo de respueta
  | codigoEsperado   |
  | <codigoEsperado> |

Examples:

	| first_name    |  last_name    |  gender   |  email                |  status   | codigoEsperado |
	| jose          |  suarez       |  male     |  jose@peoresnada.com  |  active   |   200          |
	| jose          |  suarez       |  male     |  jose                 |  active   |   422          |