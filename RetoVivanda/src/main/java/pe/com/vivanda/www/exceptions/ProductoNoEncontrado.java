package pe.com.vivanda.www.exceptions;

@SuppressWarnings("serial")
public class ProductoNoEncontrado extends AssertionError {
	
	public ProductoNoEncontrado(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

}
