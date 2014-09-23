import java.util.ArrayList;

public class Profesor {
	private String nombre;
	private ArrayList<Alumno> grupoDeAlumnos;

	public Profesor(String nombre) {
		this.nombre = nombre;
	}

	public Profesor(String nombre, ArrayList<Alumno> grupoDeAlumnos) {
		this.nombre = nombre;
		this.grupoDeAlumnos = grupoDeAlumnos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alumno> getGrupoDeAlumnos() {
		return grupoDeAlumnos;
	}

	public void setGrupoDeAlumnos(ArrayList<Alumno> grupoDeAlumnos) {
		this.grupoDeAlumnos = grupoDeAlumnos;
	}
}
