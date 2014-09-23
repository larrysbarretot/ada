public class Alumno extends Persona {
	private int grado;

	public Alumno() {

	}

	public Alumno(String nombres) {
		super(nombres);
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}
}
