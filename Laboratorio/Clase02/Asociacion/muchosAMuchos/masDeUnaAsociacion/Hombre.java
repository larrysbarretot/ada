import java.util.ArrayList;

public class Hombre {
	private String nombre;
	private Mujer esposa;
	private ArrayList<Mujer> amigas;

	public Hombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mujer getEsposa() {
		return esposa;
	}

	public void setEsposa(Mujer esposa) {
		this.esposa = esposa;
	}

	public ArrayList<Mujer> getAmigas() {
		return amigas;
	}

	public void setAmigas(ArrayList<Mujer> amigas) {
		this.amigas = amigas;
	}
}
