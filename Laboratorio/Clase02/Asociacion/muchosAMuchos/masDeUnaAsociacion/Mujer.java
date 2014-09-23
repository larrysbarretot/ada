import java.util.ArrayList;

public class Mujer {
	private String nombre;
	private Hombre esposo;
	private ArrayList<Hombre> amigos;

	public Mujer(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Hombre getEsposo() {
		return esposo;
	}

	public void setEsposo(Hombre esposo) {
		this.esposo = esposo;
	}

	public ArrayList<Hombre> getAmigos() {
		return amigos;
	}

	public void setAmigos(ArrayList<Hombre> amigos) {
		this.amigos = amigos;
	}
}
