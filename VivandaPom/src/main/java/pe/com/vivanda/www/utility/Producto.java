package pe.com.vivanda.www.utility;

public class Producto {
	
	String tipoProducto;
	String nombreProducto;
	
	public Producto(String tipoProducto, String nombreProducto) {
		this.nombreProducto = nombreProducto;
		this.tipoProducto = tipoProducto;
	}
	
	public String getTipoProducto() {
		return tipoProducto;
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}

}
