public class Calculadora {
	private String marca;

	public Calculadora(String marca) {
		this.marca = marca;
	}

	public double operacionSuma(double a, double b) {
		return a + b;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
