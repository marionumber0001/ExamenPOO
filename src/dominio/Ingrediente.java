package dominio;

public abstract class Ingrediente {

	private String nombre; // el nombre del ingrediente concreto (hamburguesa, agua, …).

	private String tipoIngrediente; // si es comida o bebida.

	// Get & Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoIngrediente() {
		return tipoIngrediente;
	}

	public void setTipoIngrediente(String tipoIngrediente) {
		this.tipoIngrediente = tipoIngrediente;
	}

	// Métodos abstractos
	public abstract double obtenerPrecio();
}
