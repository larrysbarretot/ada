public class Alumno {
	private String nombre;

	public Alumno(String nombre) {
		this.nombre = nombre;
	}
	
	public double sumar(double a, double b) {
		/* Instanciamos una calculadora */
		Calculadora calculadora = new Calculadora("Cassio");

		/* Realizamos la suma */
		double suma = calculadora.operacionSuma(a, b);

		/* Devolvemos el resultado */
		return suma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
