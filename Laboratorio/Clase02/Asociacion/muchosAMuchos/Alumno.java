import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private ArrayList<Profesor> profesores;

	public Alumno(String nombre) {
		this.nombre = nombre;
		this.profesores = new ArrayList<Profesor>();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}
}
