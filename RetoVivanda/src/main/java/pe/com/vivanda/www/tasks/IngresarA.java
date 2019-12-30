package pe.com.vivanda.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pe.com.vivanda.www.userinterfaces.HomeVivanda;

public class IngresarA implements Task{
	
	HomeVivanda pagina;
	
	IngresarA(HomeVivanda paginaDeInicio) {
		this.pagina = paginaDeInicio;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(pagina));
		
	}
	
	public static IngresarA la(HomeVivanda paginadeinicio) {

		return Tasks.instrumented(IngresarA.class, paginadeinicio);
	}

}
