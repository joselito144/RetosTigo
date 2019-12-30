package pe.com.vivanda.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.vivanda.com.pe/")
public class HomeVivanda extends PageObject {
	
	public static final Target MENU_PRODUCTOS = Target.the("Desplegar Menú Productos").locatedBy("//span[contains(text(),'NUESTROS PRODUCTOS')]//i[@class='icon icon-chevron-right']");
	public static final Target PANADERIA_PASTELERIA = Target.the("Panadería y Pastelería").locatedBy("//a[contains(text(),'Panadería y Pastelería')]"); 
	public static final Target BOTON_AGREGAR = Target.the("Boton Agregar al Carrito").locatedBy("//a[@class='buy-button buy-button-ref']");
	public static final Target ICONO_CARRITO = Target.the("Ícono carrito").locatedBy("//i[@class='minicart__btn__icon-i']");
	public static final Target RECOJO_TIENDA = Target.the("Recojo en la Tienda").locatedBy("//span[contains(text(),'Recojo en Tienda')]");
	public static final Target TIENDA_LIBERTADORES = Target.the("Vivanda Libertadores").locatedBy("//p[contains(text(),'Vivanda Libertadores')]");
	public static final Target BOTON_CONTINUAR = Target.the("Boton Continuar").locatedBy("//div[@class='SalesChannel__buttonWrapper']//button[@class='SalesChannel__preButton'][contains(text(),'CONTINUAR')]");
	public static final Target BOTON_CERRAR_EMERGENTE = Target.the("Boton Cerrar").locatedBy("//div[@class='SalesChannel__close']");
	public static final Target PRODUCTO_EN_CARRITO = Target.the("Producto en carrito").locatedBy("/html[1]/body[1]/div[5]/header[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[4]/div[3]/div[3]/ul[1]/li[1]/div[1]/div[2]/h4[1]/a[1]");
}
