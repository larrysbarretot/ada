public class Main {
	public static void main(String[] args) {
		Escritor escritor = new Escritor("Larry Steve");
		System.out.println(escritor.getNombre());
		System.out.println(escritor.getLibro().getTitulo());
	}
}
