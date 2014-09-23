public class CalculadoraComun implements Calculadora {
	
	public double sumar(double a, double b) {
		System.out.println("Algoritmo comun de suma");
		return a + b;
	}

	public double restar(double a, double b) {
		System.out.println("Algoritmo comun de resta");
		return a - b;
	}

	public double multiplicar(double a, double b) {
		System.out.println("Algoritmo comun de multiplicacion");
		return a * b;
	}

	public double dividir(double a, double b) {
		System.out.println("Algoritmo comun de division");
		return a / b;
	}
}
