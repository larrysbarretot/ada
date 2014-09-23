import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		Alumno alumno = new Alumno("Larry");
		Profesor profesor = new Profesor("Robert");
		alumnos.add(new Alumno("Steve"));
		alumnos.add(alumno);
		profesor.setGrupoDeAlumnos(alumnos);
		profesores.add(profesor);
		profesores.add(new Profesor("Alonso"));
		alumno.setProfesores(profesores);
		System.out.println("ALUMNO");
		System.out.println(alumno.getNombre());
		for(int i = 0; i < alumno.getProfesores().size(); i++) {
			System.out.println(alumno.getProfesores().get(i).getNombre());
		}
		System.out.println("PROFESOR");
		System.out.println(profesor.getNombre());
		for(int i = 0; i < profesor.getGrupoDeAlumnos().size(); i++) {
			System.out.println(profesor.getGrupoDeAlumnos().get(i).getNombre());
		}	


	}
}
