package pe.com.vivanda.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.vivanda.www.userinterfaces.HomeVivanda;

public class ElProductoAgregado implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HomeVivanda.PRODUCTO_EN_CARRITO).viewedBy(actor).asString();
	}

	public static ElProductoAgregado alCarrito() {
		return new ElProductoAgregado();
	}

}
