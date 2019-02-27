package dominio;

public abstract class Bebida extends Ingrediente {

	protected boolean refrigerada;

	public Bebida() {

		this.refrigerada = false;
	}

	public void meterEnNevera() {

		this.refrigerada = true;
	}

	public void sacarDeNevera() {

		this.refrigerada = false;

	}

}
