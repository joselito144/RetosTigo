package pe.com.vivanda.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import pe.com.vivanda.www.exceptions.ProductoNoEncontrado;
import pe.com.vivanda.www.models.Producto;
import pe.com.vivanda.www.questions.ElProductoAgregado;
import pe.com.vivanda.www.tasks.IngresarA;
import pe.com.vivanda.www.tasks.SeleccionaLa;
import pe.com.vivanda.www.userinterfaces.HomeVivanda;

public class AgregarProductoStepDefinition {
	
	HomeVivanda paginaInicio;
	
	@Managed(driver = "chrome")
	
	WebDriver SuNavegador;
	
	Actor Jose = Actor.named("Jose");
	
	@Before
	public void setUp() {
		Jose.can(BrowseTheWeb.with(SuNavegador));
	}
	
	@Given("^el usuario ingresa a la pagina de Vivanda$")
	public void elUsuarioIngresaALaPaginaDeVivanda() throws Exception {
		Jose.attemptsTo(IngresarA.la(paginaInicio));
	}


	@When("^Jose busca un producto desde el menu$")
	public void joseBuscaUnProductoDesdeElMenu(List<Producto> productos) throws Exception {
		
		Jose.attemptsTo(SeleccionaLa.opcion(productos));
		Jose.remember("nombreProducto", productos.get(0).getNombreProducto());
	}

	@Then("^el puede verlo agregado al carrito$")
	public void elPuedeVerloAgregadoAlCarrito() throws Exception {
		Jose.should(seeThat(ElProductoAgregado.alCarrito(), equalTo(Jose.recall("nombreProducto")))
				.orComplainWith(ProductoNoEncontrado.class, "El producto no se encuentra en el carrito"));
	}


}
