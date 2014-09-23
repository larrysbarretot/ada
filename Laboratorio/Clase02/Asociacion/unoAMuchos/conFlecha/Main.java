import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Profesor profesor = new Profesor("Larry");
		System.out.println("PROFESOR");
		System.out.println(profesor.getNombre());
		Alumno alumno = new Alumno("Steve");
		Alumno alumno1 = new Alumno("Pepe");
		alumnos.add(alumno);
		alumnos.add(alumno1);
		profesor.setGrupoDeAlumnos(alumnos);
		System.out.println("ALUMNOS");
		for(int i = 0; i < profesor.getGrupoDeAlumnos().size(); i++) {
			System.out.println(profesor.getGrupoDeAlumnos().get(i).getNombre());
		}
	}
}
