package dominio;

public class Agua extends Bebida {

	public Agua() {

	}

	public String toString() {
		return "Agua ...................." + obtenerPrecio();
	}

	@Override
	public double obtenerPrecio() {

		double precio = 1;

		if (this.refrigerada = true) {
			precio = 1.50;
		}

		return precio;
	}

}
