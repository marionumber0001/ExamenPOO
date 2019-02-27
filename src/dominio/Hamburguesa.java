package dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hamburguesa extends Comida {

	private SimpleDateFormat fechaCaducidad;

	public Hamburguesa(String fechaCaducidad) {

		this.fechaCaducidad = new SimpleDateFormat("dd/MM/yyyy");

		fechaCaducidad = this.fechaCaducidad.format(new Date());
	}

	public String toString() {
		return "Hamburguesa ............." +obtenerPrecio();
	}

	@Override
	public double obtenerPrecio() {

		double precio = 3.50;

		return precio;

	}

}

/*
 * Consideraciones: El precio de una hamburguesa es de 3,50€.
 * 
 * Si falta 1 dia para que caduque, se le hará un descuento del 50%.
 * 
 * Si faltan 2 dias para que caduque, se le hará un descuento del 40%.
 * 
 * Si faltan 3 dias para que caduque, se le hará un descuento del 30%.
 * 
 * Si faltan 4 dias para que caduque, se le hará un descuento del 20%.
 * 
 */
