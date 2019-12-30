package pe.com.vivanda.www.definition;



import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pe.com.vivanda.www.object.VivandaHomePage;
import pe.com.vivanda.www.utility.Producto;

public class BuscarProductoDefinitions {
	
	VivandaHomePage elUsuario;
	
	@Given("^el usuario ingresa a la pagina de Vivanda$")
	public void elUsuarioIngresaALaPaginaDeVivanda() {
		elUsuario.abreLaPaginaVivanda();
	}

	@When("^Jose busca un producto desde el menu$")
	public void joseBuscaUnProductoDesdeElMenu(List<Producto> producto) {

	    elUsuario.buscaProducto(producto);
	    
	}

	@Then("^el puede verlo agregado al carrito$")
	public void elPuedeVerloAgregadoAlCarrito() {
		elUsuario.validaElCarrito();

	}

}
