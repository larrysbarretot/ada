public class Profesor extends Persona {
	private String dni;

	public Profesor() {

	}

	public Profesor(String nombres) {
		super(nombres);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
