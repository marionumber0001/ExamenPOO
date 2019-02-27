package dominio;

public class Cola extends Bebida {

	public Cola() {

	}
	public String toString() {
		return "Cola ...................." +obtenerPrecio();
	}
	@Override
	public double obtenerPrecio() {

		double precio = 1;
		
		if (this.refrigerada = true) {
			
			precio = 1.5;
		}
		return precio;
	}

}
