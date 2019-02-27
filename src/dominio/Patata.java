package dominio;

import interfaces.Cocinable;

public class Patata extends Comida implements Cocinable {

	private int estado;

	public Patata() {

		this.estado = CRUDA;
	}

	@Override
	public void freir() {

		this.estado = FRITA;
		super.cocinado = true;

	}

	@Override
	public void cocer() {

		this.estado = COCIDA;
		super.cocinado = true;

	}

	@Override
	public void asar() {

		this.estado = ASADA;
		super.cocinado = true;

	}

	@Override
	public double obtenerPrecio() {

		double precio = 0;

		if (this.estado == FRITA) {

			precio = 1.1;
		} else if (this.estado == COCIDA) {

			precio = 0.8;
		} else if (this.estado == ASADA) {

			precio = 0.9;
		}

		return precio;
	}

	@Override
	public String toString() {

		if (this.estado == FRITA) {

			return "Patata Frita ............" + obtenerPrecio();
		} else if (this.estado == COCIDA) {

			return "Patata Cocida ..........." + obtenerPrecio();
		} else if (this.estado == ASADA) {

			return "Patata Asada ............" + obtenerPrecio();
		}

		return null;
	}

}
