package excepciones;

public class MenuIncompletoException extends Exception {

	public String mensajeError() {

		return "El Menú Está Incompleto";
	}
}
