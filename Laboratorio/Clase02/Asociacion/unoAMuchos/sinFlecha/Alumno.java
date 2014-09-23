public class Alumno {
	private String nombre;
	private Profesor profesor;

	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Profesor getProfesor() {
		return profesor;
	}
}
