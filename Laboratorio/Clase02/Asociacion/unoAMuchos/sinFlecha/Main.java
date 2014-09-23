import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Alumno alumno = new Alumno("Larry");
		Profesor profesor = new Profesor("Robert");
		alumnos.add(new Alumno("Steve"));
		alumnos.add(alumno);
		profesor.setGrupoDeAlumnos(alumnos);
		alumno.setProfesor(profesor);
		System.out.println("ALUMNO");
		System.out.println(alumno.getNombre());
		System.out.println(alumno.getProfesor().getNombre());
		System.out.println("PROFESOR");
		System.out.println(profesor.getNombre());
		for(int i = 0; i < profesor.getGrupoDeAlumnos().size(); i++) {
			System.out.println(profesor.getGrupoDeAlumnos().get(i).getNombre());
		}	


	}
}
