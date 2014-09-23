public class Programa {
	public static void main(String[] args) {
		/* Creamos un auto, internamente se crean tambien las llantas */
		Auto auto = new Auto();

		/* Destruimos el auto */
		auto = null;
		System.out.println("Auto y llantas destruidos");
	}
}
