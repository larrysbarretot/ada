import java.util.Date;

public class FichaDeAlquiler {
	private Persona persona;
	private Auto auto;
	private Date fechaDeAlquiler;
	private Date fechaDeRetorno;
	private double costo;

	public FichaDeAlquiler(Persona persona, Auto auto) {
		this.persona = persona;
		this.auto = auto;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Date getFechaDeAlquiler() {
		return fechaDeAlquiler;
	}

	public void setFechaDeAlquiler(Date fechaDeAlquiler) {
		this.fechaDeAlquiler = fechaDeAlquiler;
	}

	public Date getFechaDeRetorno() {
		return fechaDeRetorno;
	}

	public void setFechaDeRetorno(Date fechaDeRetorno) {
		this.fechaDeRetorno = fechaDeRetorno;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
}
