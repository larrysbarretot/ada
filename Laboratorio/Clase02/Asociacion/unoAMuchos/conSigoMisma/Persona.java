import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	private ArrayList<Persona> amigos;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		amigos = new ArrayList<Persona>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public ArrayList<Persona> getAmigos() {
		return amigos;
	}

	public void setAmigos(ArrayList<Persona> personas) {
		this.amigos = personas;
	}
}
