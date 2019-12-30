package in.co.gorest.www.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.co.gorest.www.model.Codigos;
import in.co.gorest.www.model.Usuario;
import in.co.gorest.www.question.ElCodigoDe;
import in.co.gorest.www.task.CrearUn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

public class CrearUsuarioStepDefinitions {
	
    public  static final String URL_BASE = "https://gorest.co.in/public-api";

    Actor Jose = Actor.named("Joselito").whoCan(CallAnApi.at(URL_BASE));
	
	@When("^Jose intenta crear un usuario con los datos$")
	public void joseIntentaCrearUnUsuarioConLosDatos(List<Usuario> usuario) throws Exception {
		Jose.attemptsTo(CrearUn.user(usuario.get(0)));
	}

	@Then("^El deberia recibir un codigo de respueta$")
	public void elDeberiaRecibirUnCodigoDeRespueta(List<Codigos> codigoEsperado) throws Exception {
		
        Jose.should(seeThat("El código de respuesta", ElCodigoDe.respuesta(),equalTo(codigoEsperado.get(0).getCodigo())));}


}
