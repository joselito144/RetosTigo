package pe.com.vivanda.www.action;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import pe.com.vivanda.www.object.VivandaHomePage;

public class SeleccionarProducto implements Task{
	
	String tipoProducto;
	String nombreProducto;
	
	public SeleccionarProducto(String tipoProducto, String nombreProducto) {
		this.nombreProducto = nombreProducto;
		this.tipoProducto = tipoProducto;
	}

	public <T extends Actor> void performAs(T actor) {
		System.out.print("verificado");
		final Target productoSeleccionado = Target.the(nombreProducto).locatedBy("//*[contains(text(),'" + nombreProducto + "')]");
		final Target tipo = Target.the(tipoProducto).locatedBy("//a[contains(text(),'" + tipoProducto + "')]");
		actor.attemptsTo(Click.on(VivandaHomePage.MENU_PRODUCTOS)
				,Click.on(tipo)
				,Click.on(productoSeleccionado)
				,Click.on(VivandaHomePage.BOTON_AGREGAR)
				,Click.on(VivandaHomePage.RECOJO_TIENDA)
				,Click.on(VivandaHomePage.TIENDA_LIBERTADORES)
				,Click.on(VivandaHomePage.BOTON_CONTINUAR)
				,Click.on(VivandaHomePage.BOTON_CERRAR_EMERGENTE)
				,Click.on(VivandaHomePage.ICONO_CARRITO));
	}

	

	public static SeleccionarProducto buscar(String tipoProducto, String nombreProducto) {
		return instrumented(SeleccionarProducto.class, tipoProducto, nombreProducto);
		
	}
	
	

}
