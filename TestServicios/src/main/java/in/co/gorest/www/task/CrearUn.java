package in.co.gorest.www.task;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import in.co.gorest.www.model.Usuario;

public class CrearUn implements Task{
	
	private Usuario usuario;
	
	public CrearUn(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Post.to("/users").with(
                requestSpecification -> requestSpecification.contentType(ContentType.JSON)
                	.header("Authorization","Bearer DKMPvGvi2nzqnvWgS1oWgPe0g4B2E84JwSgq")
                       .body(this.usuario)
                 ));
		

		
	}

	public static CrearUn user(Usuario usuario) {
		return instrumented (CrearUn.class, usuario);
	}

}
