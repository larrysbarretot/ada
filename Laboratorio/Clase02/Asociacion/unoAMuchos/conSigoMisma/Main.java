import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Persona persona = new Persona("Pepito", 10);
		Persona persona1 = new Persona("Juancito", 11);
		ArrayList<Persona> amigos = new ArrayList<Persona>();
		amigos.add(new Persona("Pedrito", 12));
		amigos.add(new Persona("Felipe", 10));
		amigos.add(new Persona("Junior", 9));
		ArrayList<Persona> amigos1 = new ArrayList<Persona>();
		amigos1.add(persona);
		persona.setAmigos(amigos);
		persona1.setAmigos(amigos1);
		System.out.println("PERSONA");
		System.out.println(persona.getNombre());
		System.out.println("AMIGOS");
		for(int i = 0; i < persona.getAmigos().size(); i++) {
			System.out.println(persona.getAmigos().get(i).getNombre());		
		}
		System.out.println("PERSONA");
		System.out.println(persona1.getNombre());
		System.out.println("AMIGOS");
		for(int i = 0; i < persona1.getAmigos().size(); i++) {
			System.out.println(persona1.getAmigos().get(i).getNombre());		
		}
	}
}
