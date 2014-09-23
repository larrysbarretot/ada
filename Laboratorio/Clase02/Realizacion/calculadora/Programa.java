public class Programa {
	public static void main(String[] args) {
		/* Definimos una variable del tipo de la interfaz */
		Calculadora calculadora = null;

		/* Instanciamos la interfaz con alguna de las clases que la implementa */
		calculadora = new CalculadoraComun();
		//calculadora = new CalculadoraCientifica();

		/* Verificamos a que instancia pertenece */
		if(calculadora instanceof CalculadoraComun) {
			System.out.println("La calculadora se creo como una comun");
		}else {
			if(calculadora instanceof CalculadoraCientifica) {
				System.out.println("La calculadora se creo como una cientifica");
			}
		}

		/* Llamamos a un metodo */
		System.out.println(calculadora.sumar(1, 2));
	}
}
