package dominio;

import java.util.ArrayList;

import excepciones.*;

public class Menu {

	// Atributo de clase

	public static int numeroMenus;

	// Atributos de instancia

	private int numeroIngredientes;
	private ArrayList<Ingrediente> listaIngredientes;

	// Constructor
	public Menu() {

		numeroMenus++;

		this.numeroIngredientes = 0;
		this.listaIngredientes = new ArrayList<Ingrediente>();
	}

	public int getNumeroIngredientes() {

		return this.listaIngredientes.size();
	}

	public void anyadirComida(Comida e) throws NoCocinadoException {

		if (e.cocinado) {
			this.listaIngredientes.add(e);
		} else {
			throw new NoCocinadoException();
		}

	}

	public void anyadirBebida(Bebida e) {
		this.listaIngredientes.add(e);

	}

	public double obtenerPrecioMenu() throws MenuIncompletoException {

		double aux = 0;

		for (int i = 0; i < this.listaIngredientes.size(); i++) {

			Ingrediente a = this.listaIngredientes.get(i);
			aux += a.obtenerPrecio();
		}
		return aux;

	}

	public void imprimirMenu() {

		for (int i = 0; i < this.listaIngredientes.size(); i++) {
			System.out.println(this.listaIngredientes.get(i));
		}
	}

}
