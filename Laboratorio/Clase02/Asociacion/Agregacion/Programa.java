public class Programa {
	public static void main(String[] args) {
		/* Creamos cuatro llantas */
		Llanta llanta1 = new Llanta();
		Llanta llanta2 = new Llanta();
		Llanta llanta3 = new Llanta();
		Llanta llanta4 = new Llanta();

		/* Creamos un auto */
		Auto auto = new Auto();

		/* Colocamos las llantas en el auto */
		auto.addLlanta(0, llanta1);
		auto.addLlanta(1, llanta2);
		auto.addLlanta(2, llanta3);
		auto.addLlanta(3, llanta4);

		/* Destruimos el auto */
		auto = null;
		System.out.println("Auto destruido");

		/* Las llantas aun existen */
		System.out.println("Llanta 1: " + llanta1);
		System.out.println("Llanta 2: " + llanta2);
		System.out.println("Llanta 3: " + llanta3);
		System.out.println("Llanta 4: " + llanta4);
	}
}
