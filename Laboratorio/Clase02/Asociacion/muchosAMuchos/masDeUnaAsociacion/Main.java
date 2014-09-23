import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Hombre hombre = new Hombre("Jose");
		Mujer mujer = new Mujer("Asenat");
		ArrayList<Hombre> amigos = new ArrayList<Hombre>();
		ArrayList<Mujer> amigas = new ArrayList<Mujer>();
		amigos.add(new Hombre("Pepe"));
		amigos.add(new Hombre("Pedro"));
		amigos.add(new Hombre("Ricardo"));
		amigas.add(new Mujer("Rosa"));
		amigas.add(new Mujer("Gloria"));
		amigas.add(new Mujer("Janet"));
		hombre.setEsposa(mujer);
		hombre.setAmigas(amigas);
		mujer.setEsposo(hombre);
		mujer.setAmigos(amigos);
		System.out.println("----------");
		System.out.println(hombre.getNombre());
		System.out.println(hombre.getEsposa().getNombre());
		for(int i = 0; i < hombre.getAmigas().size(); i++) {
			System.out.println(hombre.getAmigas().get(i).getNombre());
		}
		System.out.println(mujer.getNombre());
		System.out.println(mujer.getEsposo().getNombre());
		for(int i = 0; i < mujer.getAmigos().size(); i++) {
			System.out.println(mujer.getAmigos().get(i).getNombre());
		}
		System.out.println("----------");

	}
}
