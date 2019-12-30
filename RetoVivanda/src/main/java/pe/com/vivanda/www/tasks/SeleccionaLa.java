package pe.com.vivanda.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import pe.com.vivanda.www.models.Producto;
import pe.com.vivanda.www.userinterfaces.HomeVivanda;

public class SeleccionaLa implements Task{
	
	List<Producto> producto;
	
	SeleccionaLa(List<Producto> producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		final Target productoSeleccionado = Target.the(producto.get(0).getNombreProducto()).locatedBy("//*[contains(text(),'" + producto.get(0).getNombreProducto() + "')]");
		final Target tipoProducto = Target.the(producto.get(0).getTipoProducto()).locatedBy("//a[contains(text(),'" + producto.get(0).getTipoProducto() + "')]");
		actor.attemptsTo(Click.on(HomeVivanda.MENU_PRODUCTOS)
				,Click.on(tipoProducto)
				,Click.on(productoSeleccionado)
				,Click.on(HomeVivanda.BOTON_AGREGAR)
				,Click.on(HomeVivanda.RECOJO_TIENDA)
				,Click.on(HomeVivanda.TIENDA_LIBERTADORES)
				,Click.on(HomeVivanda.BOTON_CONTINUAR)
				,Click.on(HomeVivanda.BOTON_CERRAR_EMERGENTE)
				,Click.on(HomeVivanda.ICONO_CARRITO));
	}

	public static SeleccionaLa opcion(List<Producto> producto) {
		return instrumented(SeleccionaLa.class, producto);
	}

}
